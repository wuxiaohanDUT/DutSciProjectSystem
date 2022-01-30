package com.dut.sci.project.controller;

import com.dut.sci.project.dto.CollegeFormDTO;
import com.dut.sci.project.dto.YearNumDTO;
import com.dut.sci.project.request.GetCollegeFormNumsRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.service.DataService;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class VisualController {

    @Resource
    private DataService dataService;

    /**
     * 获取一段时间内，不同学院论文或项目申请成功的数量
     * @param getCollegeFormNumsRequest
     * @return
     */
    @PostMapping("visual/getCollegeFormNums")
    public CommonResponse getCollegeFormNums(@RequestBody GetCollegeFormNumsRequest getCollegeFormNumsRequest) {
        CommonResponse commonResponse = new CommonResponse();
        List<CollegeFormDTO> collegeFormDTOList = dataService.getCollegeFormNums(getCollegeFormNumsRequest.getBegin(),
                getCollegeFormNumsRequest.getEnd(), getCollegeFormNumsRequest.getType());
        commonResponse.setSuccess(true);
        commonResponse.setData(collegeFormDTOList);
        return commonResponse;
    }

    /**
     * 获取某一学院近五年每年发表论文或者申请科创项目的数量
     * @param request
     * @return
     */
    @PostMapping("visual/getFiveYearFormNums")
    public CommonResponse getFiveYearFormNums(@RequestBody GetCollegeFormNumsRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        Date now = new Date();
        int year = now.getYear();
        List<YearNumDTO> yearNumDTOList = Lists.newArrayList();
        for (int i = year - 4; i <= year; i++) {
            Date begin = new Date(i, 0, 1);
            Date end = new Date(i + 1, 0, 1);
            List<CollegeFormDTO> collegeFormDTOList = dataService.getCollegeFormNums(begin, end, request.getType());
            YearNumDTO yearNumDTO = new YearNumDTO();
            yearNumDTO.setYear(i + 1900);
            if (CollectionUtils.isEmpty(collegeFormDTOList)) {
                yearNumDTO.setNum(0);
            } else {
                for (CollegeFormDTO collegeFormDTO : collegeFormDTOList) {
                    if (request.getCollege().equals(collegeFormDTO.getCollege())) {
                        yearNumDTO.setNum(collegeFormDTO.getNums());
                        break;
                    }
                }
            }
            yearNumDTOList.add(yearNumDTO);
        }
        commonResponse.setData(yearNumDTOList);
        commonResponse.setSuccess(true);
        return commonResponse;
    }
}

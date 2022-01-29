package com.dut.sci.project.controller;

import com.dut.sci.project.dto.CollegeFormDTO;
import com.dut.sci.project.request.GetCollegeFormNumsRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.service.DataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class VisualController {

    @Resource
    private DataService dataService;

    @PostMapping("visual/getCollegeFormNums")
    public CommonResponse getCollegeFormNums(@RequestBody GetCollegeFormNumsRequest getCollegeFormNumsRequest) {
        CommonResponse commonResponse = new CommonResponse();
        List<CollegeFormDTO> collegeFormDTOList = dataService.getCollegeFormNums(getCollegeFormNumsRequest.getBegin(),
                getCollegeFormNumsRequest.getEnd(), getCollegeFormNumsRequest.getType());
        commonResponse.setSuccess(true);
        commonResponse.setData(collegeFormDTOList);
        return commonResponse;
    }
}

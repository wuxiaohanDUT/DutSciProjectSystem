package com.dut.sci.project.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.dut.sci.project.dto.ScoreRecordDTO;
import com.dut.sci.project.dto.UserPointsDTO;
import com.dut.sci.project.model.UserPointsModel;
import com.dut.sci.project.request.GetUserScoreRecordsRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.service.ScoreService;
import org.assertj.core.util.Lists;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class ScoreController {

    @Resource
    private ScoreService scoreService;

    /**
     * 获取一个用户在一个事件段内所有的得分记录
     * @param request
     * @return
     */
    @PostMapping("score/getUserScoreRecords")
    @CrossOrigin
    public CommonResponse getUserScoreRecords(@RequestBody GetUserScoreRecordsRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        List<ScoreRecordDTO> scoreRecordDTOList = scoreService.getUserScoreRecord(request.getUserId(), request.getBegin(), request.getEnd(), request.getPageNum(), request.getPageSize());
        commonResponse.setData(scoreRecordDTOList);
        commonResponse.setSuccess(true);
        return commonResponse;
    }

    /**
     * 获取一个时间段内所有用户的积分数，可以根据年级、学院进行筛选
     * @param request
     * @return
     */
    @PostMapping("score/getUserPoints")
    @CrossOrigin
    public CommonResponse getUserPoints(@RequestBody GetUserScoreRecordsRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        List<UserPointsDTO> userPointsDTOList = scoreService.getUserPoints(request.getBegin(), request.getEnd(), request.getYear(), request.getCollege());
        commonResponse.setSuccess(true);
        commonResponse.setData(userPointsDTOList);
        return commonResponse;
    }

    @RequestMapping("score/exportUserPointsExcel")
    @CrossOrigin
    public void exportUserPointsExcel(HttpServletResponse response, @RequestBody GetUserScoreRecordsRequest request) throws IOException {
        List<UserPointsDTO> userPointsDTOList = scoreService.getUserPoints(request.getBegin(), request.getEnd(), request.getYear(), request.getCollege());
        List<UserPointsModel> userPointsModelList = Lists.newArrayList();
        userPointsDTOList.stream().forEach(e -> {
            UserPointsModel userPointsModel  = new UserPointsModel();
            userPointsModel.setPoints(e.getPoints());
            userPointsModel.setUserId(e.getUserId());
            userPointsModel.setUserClass(e.getUserClass());
            userPointsModel.setUserName(e.getUserName());
            userPointsModelList.add(userPointsModel);
        });
        ServletOutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String fileName = "测试exportExcel";
        Sheet sheet = new Sheet(1, 0,UserPointsModel.class
        );
        //设置自适应宽度
        sheet.setAutoWidth(Boolean.TRUE);
        // 第一个 sheet 名称
        sheet.setSheetName("第一个sheet");
        writer.write(userPointsModelList, sheet);
        //通知浏览器以附件的形式下载处理，设置返回头要注意文件名有中文
        response.setHeader("Content-disposition", "attachment;filename=" + new String( fileName.getBytes("gb2312"), "ISO8859-1" ) + ".xlsx");
        writer.finish();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        out.flush();
    }
}

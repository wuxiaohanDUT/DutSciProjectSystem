package com.dut.sci.project.controller;

import com.dut.sci.project.dto.ScoreRecordDTO;
import com.dut.sci.project.dto.UserPointsDTO;
import com.dut.sci.project.request.GetUserScoreRecordsRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.service.ScoreService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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
        List<ScoreRecordDTO> scoreRecordDTOList = scoreService.getUserScoreRecord(request.getUserId(), request.getBegin(), request.getEnd());
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
}
package com.dut.sci.project.service;


import com.dut.sci.project.dto.ScoreRecordDTO;
import com.dut.sci.project.repository.ScoreRecordRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class ScoreService {

    @Resource
    private ScoreRecordRepository scoreRecordRepository;

    public List<ScoreRecordDTO> getUserScoreRecord(Long userId, Date beginTime, Date endTIme) {
        return scoreRecordRepository.getUserScoreRecord(userId, beginTime, endTIme);
    }
}
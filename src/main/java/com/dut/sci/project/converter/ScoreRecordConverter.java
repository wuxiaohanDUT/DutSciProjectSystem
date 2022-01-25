package com.dut.sci.project.converter;

import com.dut.sci.project.domain.ScoreRecordDO;
import com.dut.sci.project.dto.ScoreRecordDTO;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class ScoreRecordConverter {

    public static ScoreRecordDTO scoreRecordDO2DTO(ScoreRecordDO scoreRecordDO) {
        if (null == scoreRecordDO) {
            return null;
        }
        ScoreRecordDTO scoreRecordDTO = new ScoreRecordDTO();
        scoreRecordDTO.setRecordId(scoreRecordDO.getRecordId());
        scoreRecordDTO.setPoints(scoreRecordDO.getPoints());
        scoreRecordDTO.setAchieveTime(scoreRecordDO.getAchieveTime());
        scoreRecordDTO.setProjectId(scoreRecordDO.getProjectId());
        scoreRecordDTO.setUserId(scoreRecordDO.getUserId());
        return scoreRecordDTO;
    }

    public static List<ScoreRecordDTO> scoreRecordDOList2DTOList(List<ScoreRecordDO> scoreRecordDOList) {
        if (CollectionUtils.isEmpty(scoreRecordDOList)) {
            return null;
        }
        List<ScoreRecordDTO> scoreRecordDTOList = Lists.newArrayList();
        for (ScoreRecordDO scoreRecordDO : scoreRecordDOList) {
            ScoreRecordDTO scoreRecordDTO = scoreRecordDO2DTO(scoreRecordDO);
            scoreRecordDTOList.add(scoreRecordDTO);
        }
        return scoreRecordDTOList;
    }

    public static ScoreRecordDO scoreRecordDTO2DO(ScoreRecordDTO scoreRecordDTO) {
        if (null == scoreRecordDTO) {
            return null;
        }
        ScoreRecordDO scoreRecordDO = new ScoreRecordDO();
        scoreRecordDO.setRecordId(scoreRecordDTO.getRecordId());
        scoreRecordDO.setPoints(scoreRecordDTO.getPoints());
        scoreRecordDO.setAchieveTime(scoreRecordDTO.getAchieveTime());
        scoreRecordDO.setProjectId(scoreRecordDTO.getProjectId());
        scoreRecordDO.setUserId(scoreRecordDTO.getUserId());
        return scoreRecordDO;
    }

    public static List<ScoreRecordDO> scoreRecordDTOList2DOList(List<ScoreRecordDTO> scoreRecordDTOList) {
        if (CollectionUtils.isEmpty(scoreRecordDTOList)) {
            return null;
        }
        List<ScoreRecordDO> scoreRecordDOList = Lists.newArrayList();
        for (ScoreRecordDTO scoreRecordDTO : scoreRecordDTOList) {
            ScoreRecordDO scoreRecordDO = scoreRecordDTO2DO(scoreRecordDTO);
            scoreRecordDOList.add(scoreRecordDO);
        }
        return scoreRecordDOList;
    }
}

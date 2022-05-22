package com.dut.sci.project.repository;

import com.dut.sci.project.converter.ScoreRecordConverter;
import com.dut.sci.project.domain.ScoreRecordDO;
import com.dut.sci.project.domain.ScoreRecordDOExample;
import com.dut.sci.project.dto.ScoreRecordDTO;
import com.dut.sci.project.mapper.ScoreRecordDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class ScoreRecordRepository {

    @Resource
    private ScoreRecordDOMapper scoreRecordDOMapper;

    public Boolean addScoreRecord(ScoreRecordDTO scoreRecordDTO) {
        ScoreRecordDO scoreRecordDO = ScoreRecordConverter.scoreRecordDTO2DO(scoreRecordDTO);
        return scoreRecordDOMapper.insert(scoreRecordDO) > 0;
    }

    public Boolean deleteScoreRecordById(Integer id) {
        return scoreRecordDOMapper.deleteByPrimaryKey(id) > 0;
    }

    public Boolean deleteScoreRecordByProjectId(Long projectId) {
        ScoreRecordDOExample scoreRecordDOExample = new ScoreRecordDOExample();
        ScoreRecordDOExample.Criteria criteria = scoreRecordDOExample.createCriteria();
        criteria.andProjectIdEqualTo(projectId);
        return scoreRecordDOMapper.deleteByExample(scoreRecordDOExample) > 0;
    }

    public List<ScoreRecordDTO> getUserScoreRecord(Long userId, Date begin, Date end, Integer pageNum, Integer pageSize) {
        ScoreRecordDOExample scoreRecordDOExample = new ScoreRecordDOExample();
        ScoreRecordDOExample.Criteria criteria = scoreRecordDOExample.createCriteria();
        if (userId != null) {
            criteria.andUserIdEqualTo(userId.toString());
        }
        if (begin != null) {
            criteria.andAchieveTimeGreaterThanOrEqualTo(begin);
        }
        if (end != null) {
            criteria.andAchieveTimeLessThanOrEqualTo(end);
        }
        List<ScoreRecordDO> scoreRecordDTOList = scoreRecordDOMapper.selectByExampleWithRowbounds(scoreRecordDOExample, new RowBounds(pageNum, pageSize));
        return ScoreRecordConverter.scoreRecordDOList2DTOList(scoreRecordDTOList);
    }

    public List<ScoreRecordDTO> getUserScoreRecords(List<String> userIds, Date begin, Date end) {
        ScoreRecordDOExample scoreRecordDOExample = new ScoreRecordDOExample();
        ScoreRecordDOExample.Criteria criteria = scoreRecordDOExample.createCriteria();
        if (userIds != null) {
            criteria.andUserIdIn(userIds);
        }
        if (begin != null) {
            criteria.andAchieveTimeGreaterThanOrEqualTo(begin);
        }
        if (end != null) {
            criteria.andAchieveTimeLessThanOrEqualTo(end);
        }
        List<ScoreRecordDO> scoreRecordDTOList = scoreRecordDOMapper.selectByExample(scoreRecordDOExample);
        return ScoreRecordConverter.scoreRecordDOList2DTOList(scoreRecordDTOList);
    }
}

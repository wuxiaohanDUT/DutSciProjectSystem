package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.ScoreRecordDO;
import com.dut.sci.project.domain.ScoreRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreRecordDOMapper {
    long countByExample(ScoreRecordDOExample example);

    int deleteByExample(ScoreRecordDOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScoreRecordDO record);

    int insertSelective(ScoreRecordDO record);

    List<ScoreRecordDO> selectByExample(ScoreRecordDOExample example);

    ScoreRecordDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScoreRecordDO record, @Param("example") ScoreRecordDOExample example);

    int updateByExample(@Param("record") ScoreRecordDO record, @Param("example") ScoreRecordDOExample example);

    int updateByPrimaryKeySelective(ScoreRecordDO record);

    int updateByPrimaryKey(ScoreRecordDO record);
}
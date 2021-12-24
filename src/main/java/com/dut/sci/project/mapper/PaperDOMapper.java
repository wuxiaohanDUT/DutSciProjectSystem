package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.PaperDO;
import com.dut.sci.project.domain.PaperDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperDOMapper {
    long countByExample(PaperDOExample example);

    int deleteByExample(PaperDOExample example);

    int deleteByPrimaryKey(Long paperId);

    int insert(PaperDO record);

    int insertSelective(PaperDO record);

    List<PaperDO> selectByExample(PaperDOExample example);

    PaperDO selectByPrimaryKey(Long paperId);

    int updateByExampleSelective(@Param("record") PaperDO record, @Param("example") PaperDOExample example);

    int updateByExample(@Param("record") PaperDO record, @Param("example") PaperDOExample example);

    int updateByPrimaryKeySelective(PaperDO record);

    int updateByPrimaryKey(PaperDO record);
}
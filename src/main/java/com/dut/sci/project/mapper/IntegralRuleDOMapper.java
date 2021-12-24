package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.IntegralRuleDO;
import com.dut.sci.project.domain.IntegralRuleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralRuleDOMapper {
    long countByExample(IntegralRuleDOExample example);

    int deleteByExample(IntegralRuleDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IntegralRuleDO record);

    int insertSelective(IntegralRuleDO record);

    List<IntegralRuleDO> selectByExample(IntegralRuleDOExample example);

    IntegralRuleDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IntegralRuleDO record, @Param("example") IntegralRuleDOExample example);

    int updateByExample(@Param("record") IntegralRuleDO record, @Param("example") IntegralRuleDOExample example);

    int updateByPrimaryKeySelective(IntegralRuleDO record);

    int updateByPrimaryKey(IntegralRuleDO record);
}
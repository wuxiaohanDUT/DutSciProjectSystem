package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.IntegralRuleDO;
import com.dut.sci.project.domain.IntegralRuleDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IntegralRuleDOMapper {
    long countByExample(IntegralRuleDOExample example);

    int deleteByExample(IntegralRuleDOExample example);

    int deleteByPrimaryKey(Long ruleId);

    int insert(IntegralRuleDO record);

    int insertSelective(IntegralRuleDO record);

    List<IntegralRuleDO> selectByExampleWithRowbounds(IntegralRuleDOExample example, RowBounds rowBounds);

    List<IntegralRuleDO> selectByExample(IntegralRuleDOExample example);

    IntegralRuleDO selectByPrimaryKey(Long ruleId);

    int updateByExampleSelective(@Param("record") IntegralRuleDO record, @Param("example") IntegralRuleDOExample example);

    int updateByExample(@Param("record") IntegralRuleDO record, @Param("example") IntegralRuleDOExample example);

    int updateByPrimaryKeySelective(IntegralRuleDO record);

    int updateByPrimaryKey(IntegralRuleDO record);
}
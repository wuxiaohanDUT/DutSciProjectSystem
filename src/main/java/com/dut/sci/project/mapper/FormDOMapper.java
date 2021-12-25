package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.FormDO;
import com.dut.sci.project.domain.FormDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FormDOMapper {
    long countByExample(FormDOExample example);

    int deleteByExample(FormDOExample example);

    int deleteByPrimaryKey(Long formId);

    int insert(FormDO record);

    int insertSelective(FormDO record);

    List<FormDO> selectByExampleWithRowbounds(FormDOExample example, RowBounds rowBounds);

    List<FormDO> selectByExample(FormDOExample example);

    FormDO selectByPrimaryKey(Long formId);

    int updateByExampleSelective(@Param("record") FormDO record, @Param("example") FormDOExample example);

    int updateByExample(@Param("record") FormDO record, @Param("example") FormDOExample example);

    int updateByPrimaryKeySelective(FormDO record);

    int updateByPrimaryKey(FormDO record);
}
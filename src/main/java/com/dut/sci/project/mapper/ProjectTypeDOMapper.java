package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.ProjectTypeDO;
import com.dut.sci.project.domain.ProjectTypeDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProjectTypeDOMapper {
    long countByExample(ProjectTypeDOExample example);

    int deleteByExample(ProjectTypeDOExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(ProjectTypeDO record);

    int insertSelective(ProjectTypeDO record);

    List<ProjectTypeDO> selectByExampleWithRowbounds(ProjectTypeDOExample example, RowBounds rowBounds);

    List<ProjectTypeDO> selectByExample(ProjectTypeDOExample example);

    ProjectTypeDO selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") ProjectTypeDO record, @Param("example") ProjectTypeDOExample example);

    int updateByExample(@Param("record") ProjectTypeDO record, @Param("example") ProjectTypeDOExample example);

    int updateByPrimaryKeySelective(ProjectTypeDO record);

    int updateByPrimaryKey(ProjectTypeDO record);
}
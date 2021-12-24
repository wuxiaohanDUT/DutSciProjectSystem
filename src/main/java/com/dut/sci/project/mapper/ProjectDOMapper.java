package com.dut.sci.project.mapper;

import com.dut.sci.project.domain.ProjectDO;
import com.dut.sci.project.domain.ProjectDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectDOMapper {
    long countByExample(ProjectDOExample example);

    int deleteByExample(ProjectDOExample example);

    int deleteByPrimaryKey(Long projectId);

    int insert(ProjectDO record);

    int insertSelective(ProjectDO record);

    List<ProjectDO> selectByExample(ProjectDOExample example);

    ProjectDO selectByPrimaryKey(Long projectId);

    int updateByExampleSelective(@Param("record") ProjectDO record, @Param("example") ProjectDOExample example);

    int updateByExample(@Param("record") ProjectDO record, @Param("example") ProjectDOExample example);

    int updateByPrimaryKeySelective(ProjectDO record);

    int updateByPrimaryKey(ProjectDO record);
}
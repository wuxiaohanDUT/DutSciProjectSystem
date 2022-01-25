package com.dut.sci.project.repository;

import com.dut.sci.project.converter.ProjectConverter;
import com.dut.sci.project.domain.ProjectDO;
import com.dut.sci.project.dto.ProjectDTO;
import com.dut.sci.project.mapper.ProjectDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ProjectRepository {

    @Resource
    private ProjectDOMapper projectDOMapper;

    public Boolean addProject(ProjectDTO projectDTO) {
        if (projectDTO == null) {
            return false;
        }
        ProjectDO projectDO = ProjectConverter.projectDTO2DO(projectDTO);
        return projectDOMapper.insert(projectDO) > 0;
    }

    public ProjectDTO getProjectById(Long id) {
        ProjectDO projectDO = projectDOMapper.selectByPrimaryKey(id);
        return ProjectConverter.projectDO2DTO(projectDO);
    }

    public Boolean deleteProjectById(Long id) {
        return projectDOMapper.deleteByPrimaryKey(id) > 0;
    }
}

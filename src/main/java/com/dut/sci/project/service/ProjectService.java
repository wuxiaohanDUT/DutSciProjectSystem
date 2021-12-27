package com.dut.sci.project.service;

import com.dut.sci.project.dto.ProjectTypeDTO;
import com.dut.sci.project.repository.ProjectTypeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectService {

    @Resource
    private ProjectTypeRepository projectTypeRepository;

    public List<ProjectTypeDTO> getAllTypes() {
        return projectTypeRepository.getAllProjectTypeList();
    }

    public Boolean addProjectType(ProjectTypeDTO projectTypeDTO) {
        return projectTypeRepository.addProjectType(projectTypeDTO);
    }
}

package com.dut.sci.project.converter;

import com.dut.sci.project.domain.ProjectDO;
import com.dut.sci.project.dto.ProjectDTO;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class ProjectConverter {

    public static ProjectDO projectDTO2DO(ProjectDTO projectDTO) {
        if (projectDTO == null) {
            return null;
        }
        ProjectDO projectDO = new ProjectDO();
        projectDO.setProjectId(projectDTO.getProjectId());
        projectDO.setProjectType(projectDTO.getProjectType());
        projectDO.setAwardLevel(projectDTO.getAwardLevel());
        projectDO.setAchieveTime(projectDTO.getAchieveTime());
        projectDO.setInstructorNames(projectDTO.getInstructorNames());
        StringBuilder sb = new StringBuilder();
        int len = projectDTO.getParticipantIds().size();
        for (int i = 0; i < len; ++i) {
            sb.append(projectDTO.getParticipantIds().get(i));
            if (i != len - 1) {
                sb.append("_");
            }
        }
        projectDO.setParticipantIds(sb.toString());
        return projectDO;
    }

    public static List<ProjectDO> projectDTOList2DOList(List<ProjectDTO> projectDTOList) {
        if (CollectionUtils.isEmpty(projectDTOList)) {
            return null;
        }
        List<ProjectDO> projectDOList = Lists.newArrayList();
        for (ProjectDTO projectDTO : projectDTOList) {
            projectDOList.add(projectDTO2DO(projectDTO));
        }
        return projectDOList;
    }

    public static ProjectDTO projectDO2DTO(ProjectDO projectDO) {
        if (projectDO == null) {
            return null;
        }
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setProjectId(projectDO.getProjectId());
        projectDTO.setProjectType(projectDO.getProjectType());
        projectDTO.setAwardLevel(projectDO.getAwardLevel());
        projectDTO.setAchieveTime(projectDO.getAchieveTime());
        projectDTO.setInstructorNames(projectDO.getInstructorNames());
        String[] arr = projectDO.getParticipantIds().split("_");
        List<Long> list = Lists.newArrayList();
        for (String s : arr) {
            list.add(Long.valueOf(s));
        }
        projectDTO.setParticipantIds(list);
        return projectDTO;
    }

    public static List<ProjectDTO> projectDOList2DTOList(List<ProjectDO> projectDOList) {
        if (CollectionUtils.isEmpty(projectDOList)) {
            return null;
        }
        List<ProjectDTO> projectDTOList = Lists.newArrayList();
        for (ProjectDO projectDO : projectDOList) {
            projectDTOList.add(projectDO2DTO(projectDO));
        }
        return projectDTOList;
    }
}

package com.dut.sci.project.converter;

import com.dut.sci.project.domain.ProjectTypeDO;
import com.dut.sci.project.dto.ProjectTypeDTO;
import org.assertj.core.util.Lists;

import java.util.List;

public class ProjectTypeConverter {

    public static ProjectTypeDO typeDTO2DO(ProjectTypeDTO projectTypeDTO) {
        ProjectTypeDO projectTypeDO = new ProjectTypeDO();
        projectTypeDO.setTypeId(projectTypeDTO.getTypeId());
        projectTypeDO.setTypeName(projectTypeDTO.getTypeName());
        StringBuilder awardLevel = new StringBuilder();
        List<String> awardList = projectTypeDTO.getAwardLevel();
        for (int i = 0; i < awardList.size(); ++i) {
            awardLevel.append(awardList.get(i));
            if (i != awardList.size() - 1) {
                awardLevel.append("_");
            }
        }
        projectTypeDO.setAwardLevel(awardLevel.toString());
        return projectTypeDO;
    }

    public static ProjectTypeDTO typeDO2DTO(ProjectTypeDO projectTypeDO) {
        ProjectTypeDTO projectTypeDTO = new ProjectTypeDTO();
        projectTypeDTO.setTypeId(projectTypeDO.getTypeId());
        projectTypeDTO.setTypeName(projectTypeDO.getTypeName());
        String[] arr = projectTypeDO.getAwardLevel().split("_");
        List<String> list = Lists.newArrayList();
        for(String s : arr) {
            list.add(s);
        }
        projectTypeDTO.setAwardLevel(list);
        return projectTypeDTO;
    }

    public static List<ProjectTypeDTO> typeDOList2DTOList(List<ProjectTypeDO> projectTypeDOList) {
        List<ProjectTypeDTO> projectTypeDTOS = Lists.newArrayList();
        for(ProjectTypeDO projectTypeDO : projectTypeDOList) {
            projectTypeDTOS.add(typeDO2DTO(projectTypeDO));
        }
        return projectTypeDTOS;
    }

    public static List<ProjectTypeDO> typeDTOList2DOList(List<ProjectTypeDTO> projectTypeDTOList) {
        List<ProjectTypeDO> typeDOList = Lists.newArrayList();
        for(ProjectTypeDTO projectTypeDTO : projectTypeDTOList) {
            typeDOList.add(typeDTO2DO(projectTypeDTO));
        }
        return typeDOList;
    }
}

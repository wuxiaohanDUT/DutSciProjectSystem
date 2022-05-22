package com.dut.sci.project.service;

import com.dut.sci.project.dto.*;
import com.dut.sci.project.repository.*;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectService {

    @Resource
    private ProjectTypeRepository projectTypeRepository;

    @Resource
    private IntegralRuleRepository integralRuleRepository;

    @Resource
    private FormRepository formRepository;

    @Resource
    private ProjectRepository projectRepository;

    @Resource
    private UserRepository userRepository;

    public List<ProjectTypeDTO> getAllTypes() {
        return projectTypeRepository.getAllProjectTypeList();
    }

    public Boolean addProjectType(ProjectTypeDTO projectTypeDTO) {
        List<String> levels = projectTypeDTO.getAwardLevel();
        boolean success = projectTypeRepository.addProjectType(projectTypeDTO);
        Long typeId = projectTypeRepository.getByTypeName(projectTypeDTO.getTypeName()).get(0).getTypeId();
        for (String level : levels) {
            IntegralRuleDTO integralRuleDTO = new IntegralRuleDTO();
            integralRuleDTO.setTypeId(typeId);
            integralRuleDTO.setPoints(10);
            integralRuleDTO.setAwardLevel(level);
            success &= integralRuleRepository.addRule(integralRuleDTO);
        }
        return success;
    }

    public Boolean deleteProjectType(Long projectTypeId) {
        boolean success = integralRuleRepository.deleteRuleByProjectId(projectTypeId);
        return success & projectTypeRepository.deleteProjectType(projectTypeId);
    }

    public Boolean updateRuleById(Long typeId, String awardLevel, Integer points) {
        return integralRuleRepository.updateRuleByTypeId(typeId, awardLevel, points);
    }

    public List<ShowRuleDTO> getRuleByTypeName(String typeName, Integer pageNum, Integer pageSize) {
        List<IntegralRuleDTO> integralRuleDTOS = integralRuleRepository.getRuleListByTypeName(typeName, (pageNum - 1) * pageSize + 1, pageSize);
        if (CollectionUtils.isEmpty(integralRuleDTOS)) {
            return null;
        }
        List<ShowRuleDTO> showRuleDTOS = Lists.newArrayList();
        for (IntegralRuleDTO integralRuleDTO : integralRuleDTOS) {
            ShowRuleDTO showRuleDTO = new ShowRuleDTO();
            showRuleDTO.setPoints(integralRuleDTO.getPoints());
            showRuleDTO.setAwardLevel(integralRuleDTO.getAwardLevel());
            String name = projectTypeRepository.getTypeNameById(integralRuleDTO.getTypeId());
            showRuleDTO.setTypeName(name);
            showRuleDTOS.add(showRuleDTO);
        }
        return showRuleDTOS;
    }

    public Long addProject(ProjectDTO projectDTO) {
        return projectRepository.addProject(projectDTO);
    }

    public ProjectDTO getProjectDetailByFormId(Long formId) {
        FormDTO formDTO = formRepository.getFormById(formId);
        if (null == formId) {
            return null;
        }
        ProjectDTO projectDTO = projectRepository.getProjectById(formDTO.getProjectId());
        List<Long> ids = projectDTO.getParticipantIds();
        List<String> names = Lists.newArrayList();
        for (Long id : ids) {
            UserDTO userDTO = userRepository.getUserDTOById(id);
            if (userDTO != null) {
                String name = userDTO.getUserName() + " " + id;
                names.add(name);
            }
        }
        String typeName = projectTypeRepository.getTypeNameById(projectDTO.getProjectType());
        projectDTO.setAwardType(typeName);
        projectDTO.setParticipantNames(names);
        return projectDTO;
    }

    public ProjectDTO getProjectById(Long projectId) {
        ProjectDTO projectDTO = projectRepository.getProjectById(projectId);
        List<Long> ids = projectDTO.getParticipantIds();
        List<String> names = Lists.newArrayList();
        for (Long id : ids) {
            UserDTO userDTO = userRepository.getUserDTOById(id);
            if (userDTO != null) {
                String name = userDTO.getUserName() + " " + id;
                names.add(name);
            }
        }
        String typeName = projectTypeRepository.getTypeNameById(projectDTO.getProjectType());
        projectDTO.setAwardType(typeName);
        projectDTO.setParticipantNames(names);
        return projectDTO;
    }
}

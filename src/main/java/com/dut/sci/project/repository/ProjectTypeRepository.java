package com.dut.sci.project.repository;

import com.dut.sci.project.converter.ProjectTypeConverter;
import com.dut.sci.project.domain.ProjectTypeDO;
import com.dut.sci.project.domain.ProjectTypeDOExample;
import com.dut.sci.project.dto.ProjectTypeDTO;
import com.dut.sci.project.mapper.ProjectTypeDOMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class ProjectTypeRepository {

    @Resource
    private ProjectTypeDOMapper projectTypeDOMapper;

    public List<ProjectTypeDTO> getAllProjectTypeList() {
        ProjectTypeDOExample projectDOExample = new ProjectTypeDOExample();
        List<ProjectTypeDO> projectTypeDOList = projectTypeDOMapper.selectByExample(projectDOExample);
        if (CollectionUtils.isEmpty(projectTypeDOList)) {
            return null;
        }
        return ProjectTypeConverter.typeDOList2DTOList(projectTypeDOList);
    }

    public Boolean addProjectType(ProjectTypeDTO projectTypeDTO) {
        ProjectTypeDO projectTypeDO = ProjectTypeConverter.typeDTO2DO(projectTypeDTO);
        return projectTypeDOMapper.insert(projectTypeDO) > 0;
    }

    public Boolean deleteProjectType(Long projectTypeId) {
        return projectTypeDOMapper.deleteByPrimaryKey(projectTypeId) > 0;
    }

    public List<ProjectTypeDO> getByTypeName(String typeName) {
        ProjectTypeDOExample projectTypeDOExample = new ProjectTypeDOExample();
        ProjectTypeDOExample.Criteria criteria = projectTypeDOExample.createCriteria();
        criteria.andTypeNameEqualTo(typeName);
        return projectTypeDOMapper.selectByExample(projectTypeDOExample);
    }

    public String getTypeNameById(Long typeId) {
        if (typeId == null) {
            return null;
        }
        ProjectTypeDO projectTypeDO = projectTypeDOMapper.selectByPrimaryKey(typeId);
        return projectTypeDO.getTypeName();
    }
}

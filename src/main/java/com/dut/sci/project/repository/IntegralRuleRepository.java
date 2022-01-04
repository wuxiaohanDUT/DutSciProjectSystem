package com.dut.sci.project.repository;

import com.dut.sci.project.converter.RuleConverter;
import com.dut.sci.project.domain.IntegralRuleDO;
import com.dut.sci.project.domain.IntegralRuleDOExample;
import com.dut.sci.project.domain.ProjectTypeDO;
import com.dut.sci.project.domain.ProjectTypeDOExample;
import com.dut.sci.project.dto.IntegralRuleDTO;
import com.dut.sci.project.mapper.IntegralRuleDOMapper;
import com.dut.sci.project.mapper.ProjectTypeDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class IntegralRuleRepository {

    @Resource
    private IntegralRuleDOMapper integralRuleDOMapper;

    @Resource
    private ProjectTypeDOMapper projectTypeDOMapper;

    public Boolean addRule(IntegralRuleDTO integralRuleDTO) {
        if (integralRuleDTO == null) {
            return false;
        }
        IntegralRuleDO integralRuleDO = RuleConverter.RuleDTO2DO(integralRuleDTO);
        return integralRuleDOMapper.insertSelective(integralRuleDO) > 0;
    }

    public Boolean updateRule(IntegralRuleDTO integralRuleDTO) {
        if (integralRuleDTO == null) {
            return false;
        }
        IntegralRuleDO integralRuleDO = RuleConverter.RuleDTO2DO(integralRuleDTO);
        return integralRuleDOMapper.updateByPrimaryKey(integralRuleDO) > 0;
    }

    public Boolean deleteRuleByProjectId(Long id) {
        IntegralRuleDOExample integralRuleDOExample = new IntegralRuleDOExample();
        IntegralRuleDOExample.Criteria criteria = integralRuleDOExample.createCriteria();
        criteria.andTypeIdEqualTo(id);
        return integralRuleDOMapper.deleteByExample(integralRuleDOExample) > 0;
    }

    public Boolean updateRuleByTypeId(Long typeId, String awardLevel, Integer points) {
        IntegralRuleDOExample integralRuleDOExample = new IntegralRuleDOExample();
        IntegralRuleDOExample.Criteria criteria = integralRuleDOExample.createCriteria();
        criteria.andTypeIdEqualTo(typeId).andAwardLevelEqualTo(awardLevel);
        List<IntegralRuleDO> integralRuleDOs = integralRuleDOMapper.selectByExample(integralRuleDOExample);
        if (CollectionUtils.isEmpty(integralRuleDOs)) {
            return false;
        }
        IntegralRuleDO integralRuleDO = integralRuleDOs.get(0);
        integralRuleDO.setPoints(points);
        return integralRuleDOMapper.updateByPrimaryKey(integralRuleDO) > 0;
    }

    public List<IntegralRuleDTO> getRuleListByTypeName(String typeName, Integer pageNum, Integer pageSize) {
        ProjectTypeDOExample projectTypeDOExample = new ProjectTypeDOExample();
        ProjectTypeDOExample.Criteria projectCriteria = projectTypeDOExample.createCriteria();
        if (Strings.isNotBlank(typeName)) {
            projectCriteria.andTypeNameEqualTo(typeName);
        }
        List<ProjectTypeDO> projectTypeDOs = projectTypeDOMapper.selectByExample(projectTypeDOExample);
        if (CollectionUtils.isEmpty(projectTypeDOs)) {
            return null;
        }
        IntegralRuleDOExample integralRuleDOExample = new IntegralRuleDOExample();
        IntegralRuleDOExample.Criteria criteria = integralRuleDOExample.createCriteria();
        if (Strings.isNotBlank(typeName)) {
            criteria.andTypeIdEqualTo(projectTypeDOs.get(0).getTypeId());
        }
        List<IntegralRuleDO> integralRuleDOS = integralRuleDOMapper.selectByExampleWithRowbounds(integralRuleDOExample, new RowBounds(pageNum - 1, pageSize));
        if (CollectionUtils.isEmpty(integralRuleDOS)) {
            return null;
        }
        return RuleConverter.RuleDOList2DTOList(integralRuleDOS);
    }
}

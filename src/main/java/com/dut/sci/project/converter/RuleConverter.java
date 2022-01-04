package com.dut.sci.project.converter;

import com.dut.sci.project.domain.IntegralRuleDO;
import com.dut.sci.project.dto.IntegralRuleDTO;
import org.assertj.core.util.Lists;

import java.util.List;

public class RuleConverter {

    public static IntegralRuleDTO RuleDO2DTO(IntegralRuleDO integralRuleDO) {
        IntegralRuleDTO integralRuleDTO = new IntegralRuleDTO();
        integralRuleDTO.setRuleId(integralRuleDO.getRuleId());
        integralRuleDTO.setPoints(integralRuleDO.getPoints());
        integralRuleDTO.setAwardLevel(integralRuleDO.getAwardLevel());
        integralRuleDTO.setTypeId(integralRuleDO.getTypeId());
        return integralRuleDTO;
    }

    public static List<IntegralRuleDTO> RuleDOList2DTOList(List<IntegralRuleDO> integralRuleDOList) {
        List<IntegralRuleDTO> integralRuleDTOList = Lists.newArrayList();
        for (IntegralRuleDO integralRuleDO : integralRuleDOList) {
            integralRuleDTOList.add(RuleDO2DTO(integralRuleDO));
        }
        return integralRuleDTOList;
    }

    public static IntegralRuleDO RuleDTO2DO(IntegralRuleDTO integralRuleDTO) {
        IntegralRuleDO integralRuleDO = new IntegralRuleDO();
        integralRuleDO.setRuleId(integralRuleDTO.getRuleId());
        integralRuleDO.setAwardLevel(integralRuleDTO.getAwardLevel());
        integralRuleDO.setPoints(integralRuleDTO.getPoints());
        integralRuleDO.setTypeId(integralRuleDTO.getTypeId());
        return integralRuleDO;
    }

    public static List<IntegralRuleDO> RuleDTOList2DOList(List<IntegralRuleDTO> integralRuleDTOList) {
        List<IntegralRuleDO> integralRuleDOList = Lists.newArrayList();
        for (IntegralRuleDTO integralRuleDTO : integralRuleDTOList) {
            integralRuleDOList.add(RuleDTO2DO(integralRuleDTO));
        }
        return integralRuleDOList;
    }
}

package com.dut.sci.project.repository;

import com.dut.sci.project.dto.ProjectTypeDTO;
import com.dut.sci.project.mapper.IntegralRuleDOMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class IntegralRuleRepository {
    @Resource
    private IntegralRuleDOMapper integralRuleDOMapper;

}

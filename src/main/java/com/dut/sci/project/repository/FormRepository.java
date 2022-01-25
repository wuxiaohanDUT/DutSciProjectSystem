package com.dut.sci.project.repository;

import com.dut.sci.project.converter.FormConverter;
import com.dut.sci.project.domain.FormDO;
import com.dut.sci.project.domain.FormDOExample;
import com.dut.sci.project.dto.FormDTO;
import com.dut.sci.project.mapper.FormDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class FormRepository {

    @Resource
    private FormDOMapper formDOMapper;

    public Boolean addForm(FormDTO formDTO) {
        return formDOMapper.insert(FormConverter.formDTO2DO(formDTO)) > 0;
    }

    public Boolean deleteFormById(Long id) {
        return formDOMapper.deleteByPrimaryKey(id) > 0;
    }

    public List<FormDTO> getFormsById(Long applicantId, Long reviewerId, Integer pageNum, Integer pageSize) {
        FormDOExample formDOExample = new FormDOExample();
        FormDOExample.Criteria criteria = formDOExample.createCriteria();
        if (applicantId != null) {
            criteria.andApplicantIdEqualTo(applicantId);
        }
        if (reviewerId != null) {
            criteria.andReviewerIdEqualTo(reviewerId);
        }
        List<FormDO> formDOList = formDOMapper.selectByExampleWithRowbounds(formDOExample, new RowBounds(pageNum, pageSize));
        if (CollectionUtils.isEmpty(formDOList)) {
            return null;
        }
        return FormConverter.formDOList2DTOList(formDOList);
    }

    public FormDTO getFormById(Long formId) {
        FormDO formDO = formDOMapper.selectByPrimaryKey(formId);
        return FormConverter.formDO2DTO(formDO);
    }

    public Boolean updateForm(FormDTO formDTO) {
        FormDO formDO = FormConverter.formDTO2DO(formDTO);
        return formDOMapper.updateByPrimaryKeySelective(formDO) > 0;
    }
}

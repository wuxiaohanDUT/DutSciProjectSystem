package com.dut.sci.project.repository;

import com.dut.sci.project.converter.FormConverter;
import com.dut.sci.project.domain.FormDO;
import com.dut.sci.project.domain.FormDOExample;
import com.dut.sci.project.dto.FormDTO;
import com.dut.sci.project.enums.FormStatusEnum;
import com.dut.sci.project.enums.FormTypeEnum;
import com.dut.sci.project.mapper.FormDOMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Repository
public class FormRepository {

    @Resource
    private FormDOMapper formDOMapper;

    public Long addForm(FormDTO formDTO) {
        FormDO formDO = FormConverter.formDTO2DO(formDTO);
        formDOMapper.insert(formDO);
        return formDO.getFormId();
    }

    public Boolean deleteFormById(Long id) {
        return formDOMapper.deleteByPrimaryKey(id) > 0;
    }

    public List<FormDTO> getFormsById(Long applicantId, Long reviewerId, Integer pageNum, Integer pageSize, Boolean isProject, Boolean isPaper, Boolean isChecking, Boolean isPassed, Boolean isFailed) {
        FormDOExample formDOExample = new FormDOExample();
        FormDOExample.Criteria criteria = formDOExample.createCriteria();
        if (applicantId != null) {
            criteria.andApplicantIdEqualTo(applicantId);
        }
        if (reviewerId != null) {
            criteria.andReviewerIdEqualTo(reviewerId);
        }
        if (isProject) {
            criteria.andFormTypeEqualTo(FormTypeEnum.PROJECT.getTypeCode());
        }
        if (isPaper) {
            criteria.andFormTypeEqualTo(FormTypeEnum.PAPER.getTypeCode());
        }
        if (isChecking) {
            criteria.andFormStatusEqualTo(FormStatusEnum.AUDITING.getTypeCode().byteValue());
        }
        if (isPassed) {
            criteria.andFormStatusEqualTo(FormStatusEnum.AUDIT_COMPLETED.getTypeCode().byteValue());
        }
        if (isFailed) {
            criteria.andFormStatusEqualTo(FormStatusEnum.AUDIT_FAILED.getTypeCode().byteValue());
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

    public List<FormDTO> getSuccessFormsByTime(Date begin, Date end, Byte type) {
        FormDOExample formDOExample = new FormDOExample();
        FormDOExample.Criteria criteria = formDOExample.createCriteria();
        criteria.andPassTimeBetween(begin, end);
        criteria.andFormStatusEqualTo(FormStatusEnum.AUDIT_COMPLETED.getTypeCode().byteValue());
        criteria.andFormTypeEqualTo(type.intValue());
        List<FormDO> formDOList = formDOMapper.selectByExample(formDOExample);
        return FormConverter.formDOList2DTOList(formDOList);
    }

}

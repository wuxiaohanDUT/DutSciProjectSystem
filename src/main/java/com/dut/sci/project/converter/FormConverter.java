package com.dut.sci.project.converter;

import com.dut.sci.project.domain.FormDO;
import com.dut.sci.project.dto.FormDTO;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class FormConverter {

    public static FormDTO formDO2DTO(FormDO formDO) {
        if (formDO == null) {
            return null;
        }
        FormDTO formDTO = new FormDTO();
        formDTO.setFormId(formDO.getFormId());
        formDTO.setFormStatus(formDO.getFormStatus());
        formDTO.setFormType(formDO.getFormType());
        formDTO.setApplicantId(formDO.getApplicantId());
        formDTO.setContentDescription(formDO.getContentDescription());
        formDTO.setPassTime(formDO.getPassTime());
        formDTO.setProjectId(formDO.getProjectId());
        formDTO.setReviewerId(formDO.getReviewerId());
        formDTO.setSubmitTime(formDO.getSubmitTime());
        return formDTO;
    }

    public static List<FormDTO> formDOList2DTOList(List<FormDO> formDOList) {
        if (CollectionUtils.isEmpty(formDOList)) {
            return null;
        }
        List<FormDTO> formDTOList = Lists.newArrayList();
        for (FormDO formDO : formDOList) {
            formDTOList.add(formDO2DTO(formDO));
        }
        return formDTOList;
    }

    public static FormDO formDTO2DO(FormDTO formDTO) {
        if (formDTO == null) {
            return null;
        }
        FormDO formDO = new FormDO();
        formDO.setFormId(formDTO.getFormId());
        formDO.setFormStatus(formDTO.getFormStatus());
        formDO.setFormType(formDTO.getFormType());
        formDO.setApplicantId(formDTO.getApplicantId());
        formDO.setContentDescription(formDTO.getContentDescription());
        formDO.setPassTime(formDTO.getPassTime());
        formDO.setProjectId(formDTO.getProjectId());
        formDO.setReviewerId(formDTO.getReviewerId());
        formDO.setSubmitTime(formDTO.getSubmitTime());
        return formDO;
    }

    public static List<FormDO> formDTOList2DOList(List<FormDTO> formDTOList) {
        if (CollectionUtils.isEmpty(formDTOList)) {
            return null;
        }
        List<FormDO> formDOList = Lists.newArrayList();
        for (FormDTO formDTO : formDTOList) {
            formDOList.add(formDTO2DO(formDTO));
        }
        return formDOList;
    }
}

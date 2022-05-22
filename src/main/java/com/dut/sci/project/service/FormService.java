package com.dut.sci.project.service;

import com.dut.sci.project.dto.*;
import com.dut.sci.project.enums.FormStatusEnum;
import com.dut.sci.project.enums.FormTypeEnum;
import com.dut.sci.project.repository.*;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FormService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private FormRepository formRepository;

    @Resource
    private ProjectRepository projectRepository;

    @Resource
    private IntegralRuleRepository integralRuleRepository;

    @Resource
    private ScoreRecordRepository scoreRecordRepository;

    @Resource
    private PaperRepository paperRepository;

    @Resource
    private ImgRepository imgRepository;

    @Transactional
    public Long submitProjectForm(FormDTO formDTO, Object projectOrPaperDTO) {
        Date submitTime = new Date(System.currentTimeMillis());
        formDTO.setSubmitTime(submitTime);
        formDTO.setFormStatus(FormStatusEnum.AUDITING.getTypeCode().byteValue());
        if (formDTO.getFormType().equals(FormTypeEnum.PAPER.getTypeCode())){
            Long paperId = paperRepository.addPaper((PaperDTO) projectOrPaperDTO);
            formDTO.setProjectId(paperId);
        } else if (formDTO.getFormType().equals(FormTypeEnum.PROJECT.getTypeCode())) {
            Long projectId = projectRepository.addProject((ProjectDTO) projectOrPaperDTO);
            formDTO.setProjectId(projectId);
        }
        return formRepository.addForm(formDTO);
    }

    public Boolean rejectForm(Long formId, Long reviewerId) {
        FormDTO formDTO = new FormDTO();
        formDTO.setFormId(formId);
        formDTO.setFormStatus(FormStatusEnum.AUDIT_FAILED.getTypeCode().byteValue());
        formDTO.setReviewerId(reviewerId);
        Date passTime = new Date(System.currentTimeMillis());
        formDTO.setPassTime(passTime);
        FormDTO oldFormDTO = formRepository.getFormById(formId);
        return formRepository.updateForm(formDTO);
    }

    @Transactional
    public Boolean agreeForm(Long formId, Long reviewerId) {
        FormDTO formDTO = new FormDTO();
        formDTO.setFormId(formId);
        formDTO.setFormStatus(FormStatusEnum.AUDIT_COMPLETED.getTypeCode().byteValue());
        formDTO.setReviewerId(reviewerId);
        formDTO.setPassTime(new Date(System.currentTimeMillis()));
        boolean success = true;
        success &= formRepository.updateForm(formDTO);
        formDTO = formRepository.getFormById(formId);
        if (null == formDTO) {
            return false;
        }
        if (formDTO.getFormType().equals(FormTypeEnum.PROJECT.getTypeCode())) {
            Long projectId = formDTO.getProjectId();
            ProjectDTO projectDTO = projectRepository.getProjectById(projectId);
            if (null == projectDTO) {
                return false;
            }
            Integer points = integralRuleRepository.getPointsByIdAndLevel(projectDTO.getProjectType(), projectDTO.getAwardLevel());
            List<Long> participantIds = projectDTO.getParticipantIds();
            for (Long id : participantIds) {
                ScoreRecordDTO scoreRecordDTO = new ScoreRecordDTO();
                scoreRecordDTO.setUserId(id.toString());
                scoreRecordDTO.setPoints(points);
                scoreRecordDTO.setProjectId(projectDTO.getProjectId());
                scoreRecordDTO.setAchieveTime(projectDTO.getAchieveTime());
                success &= scoreRecordRepository.addScoreRecord(scoreRecordDTO);
            }
        }
        return success;
    }

    @Transactional
    public Boolean deleteForm(Long formId) {
        boolean success = true;
        FormDTO formDTO = formRepository.getFormById(formId);
        if (null == formDTO) {
            return false;
        }
        if (formDTO.getFormType().equals(FormTypeEnum.PROJECT.getTypeCode())) {
            ProjectDTO projectDTO = projectRepository.getProjectById(formDTO.getProjectId());
            if (null == projectDTO) {
                return false;
            }
            success &= projectRepository.deleteProjectById(projectDTO.getProjectId());
            success &= scoreRecordRepository.deleteScoreRecordByProjectId(projectDTO.getProjectId());
        } else if (formDTO.getFormType().equals(FormTypeEnum.PAPER.getTypeCode())) {
            PaperDTO paperDTO = paperRepository.getPaperById(formDTO.getProjectId());
            if (null == paperDTO) {
                return false;
            }
            success &= paperRepository.deleteById(paperDTO.getPaperId());
        }
        success &= formRepository.deleteFormById(formId);
        success &= imgRepository.deleteImgByFormId(formId);
        return success;
    }

    public List<FormDTO> getForms(Long applicantId, Long reviewerId, Integer pageNum, Integer pageSize, Boolean isProject, Boolean isPaper, Boolean isChecking, Boolean isPassed, Boolean isFailed) {
        List<FormDTO> formDTOList = formRepository.getFormsById(applicantId, reviewerId, (pageNum - 1) * pageSize, pageSize, isProject, isPaper, isChecking, isPassed, isFailed);
        if (CollectionUtils.isEmpty(formDTOList)) {
            return null;
        }
        List<Long> userIds = Lists.newArrayList();
        for (FormDTO formDTO : formDTOList) {
            userIds.add(formDTO.getReviewerId());
            userIds.add(formDTO.getApplicantId());
        }
        List<UserDTO> reviewers = userRepository.getUserDTOListByIds(userIds);
        Map<Long, String> id2Name = reviewers.stream().collect(Collectors.toMap(e -> e.getUserId(), e -> e.getUserName()));
        formDTOList.stream().forEach(e -> {
            String reviewerName = id2Name.get(e.getReviewerId());
            e.setReviewerName(reviewerName);
            String applicantName = id2Name.get(e.getApplicantId());
            e.setApplicantName(applicantName);
            e.setFormStatusDescription(FormStatusEnum.valueOf(e.getFormStatus().intValue()).getTypeName());
            e.setFormTypeDes(FormTypeEnum.valueOf(e.getFormType().intValue()).getTypeName());
        });
        return formDTOList;
    }
}

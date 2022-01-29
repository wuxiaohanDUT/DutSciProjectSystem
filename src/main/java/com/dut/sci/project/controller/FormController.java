package com.dut.sci.project.controller;

import com.dut.sci.project.dto.FormDTO;
import com.dut.sci.project.dto.PaperDTO;
import com.dut.sci.project.dto.ProjectDTO;
import com.dut.sci.project.enums.FormTypeEnum;
import com.dut.sci.project.request.AddFormRequest;
import com.dut.sci.project.request.AddPaperRequet;
import com.dut.sci.project.request.GetFormListRequest;
import com.dut.sci.project.request.RejectFormRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.service.FormService;
import com.dut.sci.project.service.ImgService;
import com.dut.sci.project.service.ProjectService;
import org.assertj.core.util.Lists;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
public class FormController {

    @Resource
    private FormService formService;

    @Resource
    private ProjectService projectService;

    @Resource
    private ImgService imgService;

    @PostMapping("form/addProjectForm")
    @CrossOrigin
    public CommonResponse addProjectForm(@RequestBody AddFormRequest addFormRequest){
        CommonResponse commonResponse = new CommonResponse();
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setProjectType(addFormRequest.getProjectTypeId());
        projectDTO.setAchieveTime(addFormRequest.getAchieveTime());
        projectDTO.setParticipantIds(addFormRequest.getParticipantIds());
        projectDTO.setInstructorNames(addFormRequest.getInstructorNames());
        projectDTO.setAwardLevel(addFormRequest.getAwardLevel());
        FormDTO formDTO = new FormDTO();
        formDTO.setContentDescription(addFormRequest.getContentDescription());
        formDTO.setApplicantId(addFormRequest.getApplicantId());
        formDTO.setFormType(FormTypeEnum.PROJECT.getTypeCode());
        boolean success = formService.submitProjectForm(formDTO, projectDTO);
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    @PostMapping("form/addPaperForm")
    @CrossOrigin
    public CommonResponse addPaperForm(@RequestBody AddPaperRequet addPaperRequet) {
        CommonResponse commonResponse = new CommonResponse();
        PaperDTO paperDTO = new PaperDTO();
        paperDTO.setPaperName(addPaperRequet.getPaperName());
        paperDTO.setAuthorIds(addPaperRequet.getParticipantIds());
        paperDTO.setCollection(addPaperRequet.getCollection());
        paperDTO.setPaperName(addPaperRequet.getPaperName());
        paperDTO.setPublicationTime(addPaperRequet.getPublicationTime());
        paperDTO.setPublicationPeriodical(addPaperRequet.getPublicationPeriodical());
        FormDTO formDTO = new FormDTO();
        formDTO.setContentDescription(addPaperRequet.getContentDescription());
        formDTO.setApplicantId(addPaperRequet.getApplicantId());
        formDTO.setFormType(FormTypeEnum.PAPER.getTypeCode());
        boolean success = formService.submitProjectForm(formDTO, paperDTO);
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    @PostMapping("form/rejectForm")
    @CrossOrigin
    public CommonResponse rejectForm(@RequestBody RejectFormRequest rejectFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.rejectForm(rejectFormRequest.getFormId(), rejectFormRequest.getUserId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    @PostMapping("form/agreeForm")
    @CrossOrigin
    public CommonResponse agreeForm(@RequestBody RejectFormRequest agreeFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.agreeForm(agreeFormRequest.getFormId(), agreeFormRequest.getUserId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    @PostMapping("form/deleteForm")
    @CrossOrigin
    public CommonResponse deleteForm(@RequestBody RejectFormRequest deleteFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.deleteForm(deleteFormRequest.getFormId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    @PostMapping("form/getFormList")
    @CrossOrigin
    public CommonResponse getFormList(@RequestBody GetFormListRequest getFormListRequest) {
        CommonResponse commonResponse = new CommonResponse();
        List<FormDTO> formDTOList = formService.getForms(getFormListRequest.getApplicantId(),
                getFormListRequest.getReviewerId(),
                getFormListRequest.getPageNum(),
                getFormListRequest.getPageSize());
        commonResponse.setSuccess(true);
        commonResponse.setData(formDTOList);
        return commonResponse;
    }

    @PostMapping("form/getFormImg")
    @CrossOrigin
    public CommonResponse getFormImg(@RequestBody RejectFormRequest getFormImgRequest) {
        CommonResponse commonResponse = new CommonResponse();
        List<String> imgList = imgService.getImgsByFormId(getFormImgRequest.getFormId());
        commonResponse.setSuccess(true);
        commonResponse.setData(imgList);
        return commonResponse;
    }
}

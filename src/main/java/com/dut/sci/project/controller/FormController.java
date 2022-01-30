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

    /**
     * 提交科创项目申请
     * @param addFormRequest
     * @return
     */
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
        Long formId = formService.submitProjectForm(formDTO, projectDTO);
        commonResponse.setSuccess(true);
        commonResponse.setData(formId);
        return commonResponse;
    }

    /**
     * 提交论文项目申请
     * @param addPaperRequet
     * @return
     */
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
        Long formId = formService.submitProjectForm(formDTO, paperDTO);
        commonResponse.setSuccess(true);
        commonResponse.setData(formId);
        return commonResponse;
    }

    /**
     * 拒绝一条申请工单
     * @param rejectFormRequest
     * @return
     */
    @PostMapping("form/rejectForm")
    @CrossOrigin
    public CommonResponse rejectForm(@RequestBody RejectFormRequest rejectFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.rejectForm(rejectFormRequest.getFormId(), rejectFormRequest.getUserId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    /**
     * 同意一条申请工单
     * @param agreeFormRequest
     * @return
     */
    @PostMapping("form/agreeForm")
    @CrossOrigin
    public CommonResponse agreeForm(@RequestBody RejectFormRequest agreeFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.agreeForm(agreeFormRequest.getFormId(), agreeFormRequest.getUserId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    /**
     * 撤销一条申请工单
     * @param deleteFormRequest
     * @return
     */
    @PostMapping("form/deleteForm")
    @CrossOrigin
    public CommonResponse deleteForm(@RequestBody RejectFormRequest deleteFormRequest) {
        CommonResponse commonResponse = new CommonResponse();
        boolean success = formService.deleteForm(deleteFormRequest.getFormId());
        commonResponse.setSuccess(success);
        return commonResponse;
    }

    /**
     * 分页所有工单列表 可根据申请人Id、审批人Id进行筛选
     * @param getFormListRequest
     * @return
     */
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

    /**
     * 获取申请工单中的图片
     * @param getFormImgRequest
     * @return
     */
    @PostMapping("form/getFormImg")
    @CrossOrigin
    public CommonResponse getFormImg(@RequestBody RejectFormRequest getFormImgRequest) {
        CommonResponse commonResponse = new CommonResponse();
        List<String> imgList = imgService.getImgsByFormId(getFormImgRequest.getFormId());
        commonResponse.setSuccess(true);
        commonResponse.setData(imgList);
        return commonResponse;
    }

    /**
     * 提交申请证明图片
     * @param files
     * @param formId
     * @return
     * @throws IOException
     */
    @PostMapping("form/addFormImg")
    @CrossOrigin
    public CommonResponse addFormImg(@RequestParam("files") MultipartFile[] files, @RequestParam("formId") Long formId) throws IOException {
        CommonResponse commonResponse = new CommonResponse();
        List<byte[]> imgList = Lists.newArrayList();
        for(MultipartFile file : files) {
            imgList.add(file.getBytes());
        }
        boolean success = imgService.addImgs(imgList, formId);
        commonResponse.setSuccess(success);
        return commonResponse;
    }
}

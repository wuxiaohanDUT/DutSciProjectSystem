package com.dut.sci.project.controller;

import com.dut.sci.project.dto.PaperDTO;
import com.dut.sci.project.dto.ProjectDTO;
import com.dut.sci.project.dto.ProjectTypeDTO;
import com.dut.sci.project.dto.ShowRuleDTO;
import com.dut.sci.project.request.*;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.response.Response;
import com.dut.sci.project.service.PaperService;
import com.dut.sci.project.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @Resource
    private PaperService paperService;

    /**
     * 获取所有科创项目的类型
     * @return
     */
    @PostMapping("project/getAllType")
    @CrossOrigin
    public Response getAllType() {
        CommonResponse response = new CommonResponse();
        List<ProjectTypeDTO> typeDTOList = projectService.getAllTypes();
        if (typeDTOList != null) {
            response.setSuccess(true);
        }
        response.setData(typeDTOList);
        return response;
    }

    /**
     * 增加一种科创项目类型
     * @param addTypeRequest
     * @return
     */
    @PostMapping("project/addType")
    @CrossOrigin
    public Response addType(@RequestBody AddTypeRequest addTypeRequest) {
        CommonResponse response = new CommonResponse();
        ProjectTypeDTO projectTypeDTO = new ProjectTypeDTO();
        projectTypeDTO.setTypeName(addTypeRequest.getTypeName());
        projectTypeDTO.setAwardLevel(addTypeRequest.getAwardLevel());
        Boolean success = projectService.addProjectType(projectTypeDTO);
        response.setSuccess(success);
        return response;
    }

    /**
     * 删除一种科创项目类型
     * @param deleteTypeRequest
     * @return
     */
    @PostMapping("project/deleteType")
    @CrossOrigin
    public Response deleteType(@RequestBody DeleteTypeRequest deleteTypeRequest) {
        Boolean success = projectService.deleteProjectType(deleteTypeRequest.getTypeId());
        Response response = new CommonResponse();
        response.setSuccess(success);
        return response;
    }

    @PostMapping("project/getTypeRule")
    @CrossOrigin
    public Response getTypeRule() {
        return null;
    }

    /**
     * 跟新一条积分规则
     * @param updateRuleRequest
     * @return
     */
    @PostMapping("project/updateRule")
    @CrossOrigin
    public Response updateRule(@RequestBody UpdateRuleRequest updateRuleRequest) {
        Response response = new CommonResponse();
        boolean success = projectService.updateRuleById(updateRuleRequest.getTypeId(),
                                                        updateRuleRequest.getAwardLevel(),
                                                        updateRuleRequest.getPoints());
        response.setSuccess(success);
        return response;
    }

    /**
     * 根据项目类型名称获取积分规则
     * @param getRuleListRequest
     * @return
     */
    @PostMapping("project/getRuleByTypeName")
    @CrossOrigin
    public Response getRuleByTypeName(@RequestBody GetRuleListRequest getRuleListRequest) {
        Response response = new CommonResponse();
        List<ShowRuleDTO> showRuleDTOS = projectService.getRuleByTypeName(getRuleListRequest.getTypeName(),
                getRuleListRequest.getPageNum(), getRuleListRequest.getPageSize());
        boolean success = showRuleDTOS != null && !showRuleDTOS.isEmpty();
        response.setData(showRuleDTOS);
        response.setSuccess(success);
        return response;
    }

    /**
     * 根据工单Id查看项目详情信息
     * @param getProjectRequest
     * @return
     */
    @PostMapping("project/getProjectDetail")
    @CrossOrigin
    public Response getProjectDetail(@RequestBody GetProjectRequest getProjectRequest) {
        CommonResponse commonResponse = new CommonResponse();
        ProjectDTO projectDTO = projectService.getProjectDetailByFormId(getProjectRequest.getFormId());
        commonResponse.setData(projectDTO);
        return commonResponse;
    }

    /**
     * 根据工单Id查看论文详情信息
     * @param getProjectRequest
     * @return
     */
    @PostMapping("project/getPaperDetail")
    @CrossOrigin
    public Response getPaperDetail(@RequestBody GetProjectRequest getProjectRequest) {
        CommonResponse commonResponse = new CommonResponse();
        PaperDTO paperDTO = paperService.getPaperDetailByFormId(getProjectRequest.getFormId());
        commonResponse.setData(paperDTO);
        return commonResponse;
    }

    /**
     * 获取一个用户发表的论文
     * @param request
     * @return
     */
    @PostMapping("project/getPapersByUserId")
    @CrossOrigin
    public Response getPapersByUserId(@RequestBody GetPapersRequest request) {
        CommonResponse commonResponse = new CommonResponse();
        List<PaperDTO> paperDTOList = paperService.getPaperByUserId(request.getUserId().toString(), request.getPageNum(), request.getPageSize());
        commonResponse.setSuccess(true);
        commonResponse.setData(paperDTOList);
        return commonResponse;
    }
}

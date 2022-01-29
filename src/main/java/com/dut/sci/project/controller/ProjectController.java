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

    @GetMapping("project/getProjectDetail")
    @CrossOrigin
    public Response getProjectDetail(@RequestBody GetProjectRequest getProjectRequest) {
        CommonResponse commonResponse = new CommonResponse();
        ProjectDTO projectDTO = projectService.getProjectDetailByFormId(getProjectRequest.getFormId());
        commonResponse.setData(projectDTO);
        return commonResponse;
    }

    @GetMapping("project/getPaperDetail")
    @CrossOrigin
    public Response getPaperDetail(@RequestBody GetProjectRequest getProjectRequest) {
        CommonResponse commonResponse = new CommonResponse();
        PaperDTO paperDTO = paperService.getPaperDetailByFormId(getProjectRequest.getFormId());
        commonResponse.setData(paperDTO);
        return commonResponse;
    }
}

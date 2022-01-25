package com.dut.sci.project.controller;

import com.dut.sci.project.dto.ProjectTypeDTO;
import com.dut.sci.project.dto.ShowRuleDTO;
import com.dut.sci.project.request.AddTypeRequest;
import com.dut.sci.project.request.DeleteTypeRequest;
import com.dut.sci.project.request.GetRuleListRequest;
import com.dut.sci.project.request.UpdateRuleRequest;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.response.Response;
import com.dut.sci.project.service.ProjectService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProjectController {

    @Resource
    private ProjectService projectService;

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
}

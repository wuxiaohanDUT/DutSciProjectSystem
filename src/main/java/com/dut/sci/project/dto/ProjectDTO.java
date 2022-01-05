package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProjectDTO {

    private Long projectId;

    private Long projectType;

    private List<String> participantIds;

    private String awardLevel;

    private String instructorNames;

    private Date achieveTime;
}

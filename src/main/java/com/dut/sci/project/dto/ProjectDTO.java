package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProjectDTO {

    private Long projectId;

    private Long projectType;

    private List<Long> participantIds;

    private List<String> participantNames;

    private String awardLevel;

    private String awardType;

    private String instructorNames;

    private Date achieveTime;
}

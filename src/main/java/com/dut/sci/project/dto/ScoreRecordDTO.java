package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ScoreRecordDTO {

    private Integer recordId;

    private String userId;

    private Long projectId;

    private Integer points;

    private Date achieveTime;
}

package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FormDTO {
    private Long formId;

    private Byte formStatus;

    private Long reviewerId;

    private Date submitTime;

    private Date passTime;

    private Long applicantId;

    private String contentDescription;

    private Long projectId;

    private Integer formType;
}

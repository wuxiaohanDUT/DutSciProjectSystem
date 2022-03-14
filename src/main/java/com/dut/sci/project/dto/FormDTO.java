package com.dut.sci.project.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FormDTO {
    private Long formId;

    private Byte formStatus;

    private String formStatusDescription;

    private Long reviewerId;

    private String reviewerName;

    private Date submitTime;

    private Date passTime;

    private Long applicantId;

    private String applicantName;

    private String contentDescription;

    private Long projectId;

    private Integer formType;

    private String formTypeDes;
}

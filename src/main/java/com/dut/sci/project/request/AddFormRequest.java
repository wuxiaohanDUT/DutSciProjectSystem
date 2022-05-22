package com.dut.sci.project.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class AddFormRequest extends Request{

    private Long applicantId;
    private Long projectTypeId;
    private String awardLevel;
    private List<Long> participantIds;
    private String instructorNames;
    private Date achieveTime;
    private Integer formType;
    private String contentDescription;
}

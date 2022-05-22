package com.dut.sci.project.request;

import lombok.Data;

@Data
public class GetFormListRequest extends Request{

    private Long applicantId;
    private Long reviewerId;
    private Integer pageNum;
    private Integer pageSize;
    private Boolean isProject;
    private Boolean isPaper;
    private Boolean isChecking;
    private Boolean isPassed;
    private Boolean isFailed;

}

package com.dut.sci.project.request;

import lombok.Data;

@Data
public class GetFormListRequest extends Request{

    private Long applicantId;
    private Long reviewerId;
    private Integer pageNum;
    private Integer pageSize;

}

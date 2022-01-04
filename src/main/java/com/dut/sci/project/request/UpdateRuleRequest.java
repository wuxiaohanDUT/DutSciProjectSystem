package com.dut.sci.project.request;

import lombok.Data;

@Data
public class UpdateRuleRequest extends Request{

    private Long typeId;
    private String awardLevel;
    private Integer points;

}

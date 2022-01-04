package com.dut.sci.project.request;

import lombok.Data;

@Data
public class GetRuleListRequest extends Request{

    private String typeName;
    private Integer pageSize;
    private Integer pageNum;

}

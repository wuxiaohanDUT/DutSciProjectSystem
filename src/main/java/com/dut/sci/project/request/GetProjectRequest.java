package com.dut.sci.project.request;

import lombok.Data;

@Data
public class GetProjectRequest extends Request{

    private Long formId;
    private Long projectId;
}

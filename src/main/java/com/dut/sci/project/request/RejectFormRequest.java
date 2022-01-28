package com.dut.sci.project.request;

import lombok.Data;

@Data
public class RejectFormRequest extends Request{

    private Long formId;
    private Long userId;

}

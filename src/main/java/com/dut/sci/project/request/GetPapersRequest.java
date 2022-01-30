package com.dut.sci.project.request;

import lombok.Data;

@Data
public class GetPapersRequest extends Request{

    private Long userId;
    private Integer pageNum;
    private Integer pageSize;

}

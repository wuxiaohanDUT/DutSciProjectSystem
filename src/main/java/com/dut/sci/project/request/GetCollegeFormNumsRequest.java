package com.dut.sci.project.request;

import lombok.Data;

import java.util.Date;

@Data
public class GetCollegeFormNumsRequest extends Request{

    private Date begin;
    private Date end;
    private Byte type;

}

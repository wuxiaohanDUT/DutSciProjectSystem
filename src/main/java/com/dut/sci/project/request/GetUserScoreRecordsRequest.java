package com.dut.sci.project.request;

import lombok.Data;

import java.util.Date;

@Data
public class GetUserScoreRecordsRequest extends Request {

    private Long userId;
    private Date begin;
    private Date end;
    private Integer year;
    private String college;
    private Integer pageNum;
    private Integer pageSize;

}

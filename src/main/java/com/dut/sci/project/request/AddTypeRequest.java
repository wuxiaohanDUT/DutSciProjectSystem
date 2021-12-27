package com.dut.sci.project.request;

import lombok.Data;

import java.util.List;

@Data
public class AddTypeRequest extends Request {
    private String typeName;
    private List<String> awardLevel;
}

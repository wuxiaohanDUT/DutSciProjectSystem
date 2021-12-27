package com.dut.sci.project.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProjectTypeDTO {
    private Long typeId;
    private String typeName;
    private List<String> awardLevel;
}

package com.dut.sci.project.dto;

import lombok.Data;

@Data
public class UserPointsDTO {

    private Long userId;
    private String userName;
    private String userClass;
    private Integer points;

}

package com.dut.sci.project.dto;

import lombok.Data;

@Data
public class UserDTO {

    private Long userId;

    private String userPassword;

    private String userName;

    private String userPhoneNumber;

    private String userEmail;

    private Boolean userGender;

    private String userCollege;

    private String userClass;

    private Integer userType;

}

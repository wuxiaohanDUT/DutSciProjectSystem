package com.dut.sci.project.vo;

import lombok.Data;

@Data
public class UserVO {

    private Long userId;

    private String password;

    private String userName;

    private String token;

    private String userPhoneNumber;

    private String userEmail;

    private Boolean userGender;

    private String userCollege;

    private String userClass;

    private Integer userType;
}

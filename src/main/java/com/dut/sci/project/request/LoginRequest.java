package com.dut.sci.project.request;

import lombok.Data;

@Data
public class LoginRequest extends Request {

    private Long userId;
    private String password;

}

package com.dut.sci.project.request;

import lombok.Data;

@Data
public class ChangePasswordRequest extends Request{

    private Long userId;
    private String newPassword;

}

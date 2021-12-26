package com.dut.sci.project.request;

import com.dut.sci.project.vo.UserVO;
import lombok.Data;

@Data
public class UpdateUserInfoRequest extends Request{

    private Long userId;

    private String newUserPhoneNumber;

    private String newUserEmail;
}

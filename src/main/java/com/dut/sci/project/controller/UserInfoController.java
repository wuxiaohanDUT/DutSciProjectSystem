package com.dut.sci.project.controller;

import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.request.ChangePasswordRequest;
import com.dut.sci.project.request.UpdateUserInfoRequest;
import com.dut.sci.project.response.ChangePswdResponse;
import com.dut.sci.project.response.UpdateUserInfoResponse;
import com.dut.sci.project.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserInfoController {

    @Resource
    private UserService userService;

    @PostMapping("user/updateInfo")
    public UpdateUserInfoResponse updateUserInfo(@RequestBody UpdateUserInfoRequest updateUserInfoRequest) {
        UpdateUserInfoResponse response = new UpdateUserInfoResponse();
        if (updateUserInfoRequest.getNewUserEmail() == null &&
            updateUserInfoRequest.getNewUserPhoneNumber() == null) {
            response.setSuccess(false);
            response.setDescription("更新数据为空");
            return response;
        }
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(updateUserInfoRequest.getUserId());
        userDTO.setUserPhoneNumber(updateUserInfoRequest.getNewUserPhoneNumber());
        userDTO.setUserEmail(updateUserInfoRequest.getNewUserEmail());
        Boolean success = userService.userInfoUpdate(userDTO);
        response.setSuccess(success);
        response.setDescription("更新成功");
        return response;
    }

    @PostMapping("user/changePassword")
    public ChangePswdResponse changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        ChangePswdResponse response = new ChangePswdResponse();
        Boolean success = userService.changePassword(changePasswordRequest.getUserId(), changePasswordRequest.getNewPassword());
        response.setSuccess(success);
        return response;
    }
}

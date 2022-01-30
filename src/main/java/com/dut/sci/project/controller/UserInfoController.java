package com.dut.sci.project.controller;

import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.request.ChangePasswordRequest;
import com.dut.sci.project.request.UpdateUserInfoRequest;
import com.dut.sci.project.response.ChangePswdResponse;
import com.dut.sci.project.response.CommonResponse;
import com.dut.sci.project.response.UpdateUserInfoResponse;
import com.dut.sci.project.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserInfoController {

    @Resource
    private UserService userService;

    /**
     * 跟新用户个人信息
     * @param updateUserInfoRequest
     * @return
     */
    @PostMapping("user/updateInfo")
    @CrossOrigin
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

    /**
     * 更改用户密码
     * @param changePasswordRequest
     * @return
     */
    @PostMapping("user/changePassword")
    @CrossOrigin
    public ChangePswdResponse changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        ChangePswdResponse response = new ChangePswdResponse();
        Boolean success = userService.changePassword(changePasswordRequest.getUserId(), changePasswordRequest.getNewPassword());
        response.setSuccess(success);
        return response;
    }

    /**
     * 获取用户个人信息（除了密码）
     * @param getUserInfoRequest
     * @return
     */
    @PostMapping("user/getUserInfo")
    @CrossOrigin
    public CommonResponse getUserInfo(@RequestBody UpdateUserInfoRequest getUserInfoRequest) {
        CommonResponse commonResponse = new CommonResponse();
        UserDTO userDTO = userService.getUserInfoById(getUserInfoRequest.getUserId());
        commonResponse.setData(userDTO);
        commonResponse.setSuccess(true);
        return commonResponse;
    }

    /**
     * 获取学院名称列表
     * @return
     */
    @PostMapping("user/getAllCollege")
    @CrossOrigin
    public CommonResponse getAllCollege() {
        CommonResponse commonResponse = new CommonResponse();
        List<String> collegeList = userService.getAllCollege();
        commonResponse.setSuccess(true);
        commonResponse.setData(collegeList);
        return commonResponse;
    }
}

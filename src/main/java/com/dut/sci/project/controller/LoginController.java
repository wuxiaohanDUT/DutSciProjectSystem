package com.dut.sci.project.controller;

import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.request.LoginRequest;
import com.dut.sci.project.response.LoginResponse;
import com.dut.sci.project.service.TokenService;
import com.dut.sci.project.service.UserService;
import com.dut.sci.project.vo.UserVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private TokenService tokenService;

    @PostMapping("user/login")
    public LoginResponse Login(@RequestParam LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        UserDTO userDTO = userService.userLogin(loginRequest.getUserId(), loginRequest.getPassword());
        if (null == userDTO) {
            loginResponse.setSuccess(false);
            return loginResponse;
        }
        UserVO userVO = userDTO2VO(userDTO);
        loginResponse.setData(userVO);
        loginResponse.setSuccess(true);
        return loginResponse;
    }

    private UserVO userDTO2VO(UserDTO userDTO) {
        UserVO userVO = new UserVO();
        userVO.setUserId(userDTO.getUserId());
        userVO.setUserClass(userDTO.getUserClass());
        userVO.setUserEmail(userDTO.getUserEmail());
        userVO.setUserName(userDTO.getUserName());
        userVO.setUserGender(userDTO.getUserGender());
        userVO.setUserType(userDTO.getUserType());
        userVO.setUserCollege(userDTO.getUserCollege());
        userVO.setUserPhoneNumber(userDTO.getUserPhoneNumber());
        userVO.setUserType(userDTO.getUserType());
        userVO.setToken(tokenService.generateUserToken(userDTO.getUserId()));
        return userVO;
    }
}

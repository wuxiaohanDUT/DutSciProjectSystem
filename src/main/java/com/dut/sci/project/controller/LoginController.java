package com.dut.sci.project.controller;

import com.dut.sci.project.converter.UserConverter;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.request.LoginRequest;
import com.dut.sci.project.response.LoginResponse;
import com.dut.sci.project.service.TokenService;
import com.dut.sci.project.service.UserService;
import com.dut.sci.project.vo.UserVO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private TokenService tokenService;

    @PostMapping("user/login")
    @CrossOrigin
    public LoginResponse Login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        UserDTO userDTO = userService.userLogin(loginRequest.getUserId(), loginRequest.getPassword());
        if (null == userDTO) {
            loginResponse.setSuccess(false);
            loginResponse.setDescription("账号或密码错误");
            return loginResponse;
        }
        UserVO userVO = UserConverter.UserDTO2VO(userDTO);
        userVO.setToken(tokenService.generateUserToken(userDTO.getUserId()));
        loginResponse.setData(userVO);
        loginResponse.setSuccess(true);
        loginResponse.setDescription("登录成功");
        return loginResponse;
    }

}

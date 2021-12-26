package com.dut.sci.project;

import com.alibaba.fastjson.JSON;
import com.dut.sci.project.controller.LoginController;
import com.dut.sci.project.converter.UserConverter;
import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.repository.UserRepository;
import com.dut.sci.project.request.LoginRequest;
import com.dut.sci.project.request.UpdateUserInfoRequest;
import com.dut.sci.project.service.UserService;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class LoginTest {

    @Resource
    private LoginController loginController;

    @Resource
    private UserService userService;

    @Resource
    private UserRepository userRepository;

    @Test
    public void TestUserService() {
        System.out.println(userService);
        UserDTO userDTO = userService.userLogin(Long.valueOf(201892244), "wu2658343834");
        System.out.println(userDTO);
    }
    @Test
    public void LoginTest() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUserId(Long.valueOf(201892244));
        loginRequest.setPassword("wu2658343834");
        System.out.println(loginController.Login(loginRequest));
    }
    @Test void UserToJason() {
        UserDTO userDO = userRepository.getUserDTOById(Long.valueOf(201892244));
        UpdateUserInfoRequest updateUserInfoRequest = new UpdateUserInfoRequest();
        System.out.println(JSON.toJSON(updateUserInfoRequest));
    }
}

package com.dut.sci.project;

import com.alibaba.fastjson.JSON;
import com.dut.sci.project.controller.LoginController;
import com.dut.sci.project.converter.UserConverter;
import com.dut.sci.project.domain.ProjectDO;
import com.dut.sci.project.domain.UserDO;
import com.dut.sci.project.dto.UserDTO;
import com.dut.sci.project.mapper.ProjectDOMapper;
import com.dut.sci.project.mapper.UserDOMapper;
import com.dut.sci.project.repository.UserRepository;
import com.dut.sci.project.request.*;
import com.dut.sci.project.service.DataService;
import com.dut.sci.project.service.UserService;
import io.jsonwebtoken.lang.Assert;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class LoginTest {

    @Resource
    private LoginController loginController;

    @Resource
    private UserService userService;

    @Resource
    private UserRepository userRepository;

    @Resource
    private UserDOMapper userDOMapper;

    @Resource
    private ProjectDOMapper projectDOMapper;

    @Resource
    private DataService dataService;

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

    @Test void TypeToJason() {
        AddTypeRequest addTypeRequest = new AddTypeRequest();
        addTypeRequest.setTypeName("大学生数学竞赛");
        List<String> list = Lists.newArrayList();
        list.add("一等奖");
        list.add("二等奖");
        list.add("三等奖");
        addTypeRequest.setAwardLevel(list);
        System.out.println(JSON.toJSON(addTypeRequest));
    }

    @Test
    public void test() {
        AddPaperRequet addPaperRequet = new AddPaperRequet();
        addPaperRequet.setPaperName("论文题目");
        addPaperRequet.setCollection("ccf");
        addPaperRequet.setApplicantId(Long.valueOf(201892244));
        List<String> list = Lists.newArrayList();
        list.add("201892244");
        addPaperRequet.setParticipantIds(list);
        addPaperRequet.setContentDescription("描述");
        addPaperRequet.setPublicationPeriodical("123");
        addPaperRequet.setPublicationTime(new Date());
        System.out.println(JSON.toJSON(addPaperRequet));
    }
    @Test
    public void dataTest() {
        int year = new Date().getYear();
        Date begin = new Date(year, 0, 1);
        Date end = new Date(year+1, 0, 1);
        System.out.println(begin.getTime() +" " +end.getTime());
        System.out.println(dataService.getCollegeFormNums(begin, end, (byte)0));
    }
}

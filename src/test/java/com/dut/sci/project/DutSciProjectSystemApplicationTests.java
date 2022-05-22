package com.dut.sci.project;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DutSciProjectSystemApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getAllType, methodAndArgs=[], exception=null, time=1653029975611)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getRuleByTypeName, methodAndArgs=[UserAop.MethodAndArgs(parameterName=getRuleListRequest, arg=GetRuleListRequest(typeName=null, pageSize=5, pageNum=1))], exception=null, time=1653029976815)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getRuleByTypeName, methodAndArgs=[UserAop.MethodAndArgs(parameterName=getRuleListRequest, arg=GetRuleListRequest(typeName=null, pageSize=5, pageNum=1))], exception=null, time=1653029979976)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getAllType, methodAndArgs=[], exception=null, time=1653029982200)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getAllType, methodAndArgs=[], exception=null, time=1653029982402)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getAllType, methodAndArgs=[], exception=null, time=1653030264312)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.ProjectController, methodName=getRuleByTypeName, methodAndArgs=[UserAop.MethodAndArgs(parameterName=getRuleListRequest, arg=GetRuleListRequest(typeName=null, pageSize=5, pageNum=1))], exception=null, time=1653030423270)\n" +
                "UserAop.ControllerAop(className=com.dut.sci.project.controller.FormController, methodName=addProjectForm, methodAndArgs=[UserAop.MethodAndArgs(parameterName=addFormRequest, arg=AddFormRequest(applicantId=201892244, projectTypeId=26, awardLevel=一等奖, participantIds=[201892244], instructorNames=吴潇晗, achieveTime=Fri Jan 28 15:04:03 CST 2022, formType=1, contentDescription=蓝桥杯科创项目申请))], exception=null, time=1653030843039)");
    }
}

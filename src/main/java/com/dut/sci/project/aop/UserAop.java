package com.dut.sci.project.aop;

import lombok.Data;
import lombok.ToString;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class UserAop {


    @Pointcut("execution(public * com.dut.sci.project.controller.*.*(..) )")
    public void pointCut(){}

    @Before("pointCut()")
    public void getControllerParam(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // 当前被切点切到的方法
        Method method = signature.getMethod();
        // 参数名称
        String[] parameterNames = signature.getParameterNames();
        // 参数值
        Object[] args = joinPoint.getArgs();
        List<MethodAndArgs> methodAndArgsList = new ArrayList<>();
        if (parameterNames.length == args.length) {
            for (int i = 0; i < parameterNames.length; i++) {
                String parameterName = parameterNames[i];
                Object arg = args[i];
                MethodAndArgs methodAndArgs = new MethodAndArgs();
                methodAndArgs.setParameterName(parameterName);
                methodAndArgs.setArg(arg);
                methodAndArgsList.add(methodAndArgs);
            }
        }

        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();

        ControllerAop controllerAop = new ControllerAop();
        controllerAop.setClassName(className);
        controllerAop.setMethodName(methodName);
        controllerAop.setMethodAndArgs(methodAndArgsList);
        controllerAop.setTime(System.currentTimeMillis());
        System.out.println(controllerAop);
    }

    @Data
    @ToString
    private static class MethodAndArgs {

        /**
         * 参数名称
         */
        private String parameterName;
        /**
         * 实际参数
         */
        private Object arg;
    }

    @Data
    @ToString
    private static class ControllerAop {

        /**
         * 类名
         */
        private String className;
        /**
         * 方法名
         */
        private String methodName;
        /**
         * 请求方法{参数名称:实际参数}
         */
        private List<MethodAndArgs> methodAndArgs = new ArrayList<>();

        private Exception exception;
        private long time;
    }
}

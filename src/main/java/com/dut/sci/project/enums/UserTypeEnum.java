package com.dut.sci.project.enums;

import java.util.Arrays;

public enum UserTypeEnum {

    STUDENT(0, "学生"),
    TEACHER(1, "老师"),
    ADMAIN(2, "管理员");

    private Integer typeCode;
    private String typeName;

    UserTypeEnum(Integer typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public static UserTypeEnum valueOf(Integer userType) {
        return Arrays.stream(UserTypeEnum.values()).filter(userTypeEnum -> {
            return userTypeEnum.getUserType().equals(userType);
        }).findFirst().get();
    }

    public Integer getUserType() {
        return typeCode;
    }

    public void setUserType(Integer userType) {
        this.typeCode = userType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

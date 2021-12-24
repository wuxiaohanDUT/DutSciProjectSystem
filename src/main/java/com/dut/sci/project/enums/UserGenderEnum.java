package com.dut.sci.project.enums;

import java.util.Arrays;

public enum UserGenderEnum {

    MALE(0, "男"),
    FEMALE(1, "女");

    private Integer code;
    private String name;

    UserGenderEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public static UserGenderEnum valueOf(Integer code) {
        return Arrays.stream(UserGenderEnum.values()).filter(e -> {
            return e.getCode().equals(code);
        }).findFirst().get();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

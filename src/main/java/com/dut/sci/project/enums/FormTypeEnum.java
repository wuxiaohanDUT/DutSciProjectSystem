package com.dut.sci.project.enums;

import java.util.Arrays;

public enum FormTypeEnum {
    PROJECT(0, "科创项目"),
    PAPER(1, "科研论文");

    private Integer typeCode;
    private String typeName;

    FormTypeEnum(Integer typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public static FormTypeEnum valueOf(Integer typeCode) {
        return Arrays.stream(FormTypeEnum.values()).filter(e -> {
            return e.getTypeCode().equals(typeCode);
        }).findFirst().get();
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

package com.dut.sci.project.enums;

import java.util.Arrays;

public enum FormStatusEnum {

    AUDITING(0, "审核中"),
    AUDIT_COMPLETED(1, "审核完成"),
    AUDIT_FAILED(2, "审核未通过");

    private Integer typeCode;
    private String typeName;

    FormStatusEnum(Integer typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public FormStatusEnum valueOf(Integer typeCode) {
        return Arrays.stream(FormStatusEnum.values()).filter(e -> {
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

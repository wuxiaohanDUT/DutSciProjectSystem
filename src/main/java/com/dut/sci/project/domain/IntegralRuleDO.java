package com.dut.sci.project.domain;

public class IntegralRuleDO {
    private Long id;

    private Long typeId;

    private String awardLevel;

    private String awardType;

    private Integer points;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel == null ? null : awardLevel.trim();
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType == null ? null : awardType.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
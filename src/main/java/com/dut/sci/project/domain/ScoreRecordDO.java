package com.dut.sci.project.domain;

import java.util.Date;

public class ScoreRecordDO {
    private Integer id;

    private String userId;

    private Long formId;

    private Integer points;

    private Date achieveTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getAchieveTime() {
        return achieveTime;
    }

    public void setAchieveTime(Date achieveTime) {
        this.achieveTime = achieveTime;
    }
}
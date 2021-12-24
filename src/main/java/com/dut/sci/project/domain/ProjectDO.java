package com.dut.sci.project.domain;

import java.util.Date;

public class ProjectDO {
    private Long projectId;

    private Long projectType;

    private String typeName;

    private String participantIds;

    private String participantNames;

    private String instructorNames;

    private String awardType;

    private String awardLevel;

    private String instructorIds;

    private Date achieveTime;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getProjectType() {
        return projectType;
    }

    public void setProjectType(Long projectType) {
        this.projectType = projectType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getParticipantIds() {
        return participantIds;
    }

    public void setParticipantIds(String participantIds) {
        this.participantIds = participantIds == null ? null : participantIds.trim();
    }

    public String getParticipantNames() {
        return participantNames;
    }

    public void setParticipantNames(String participantNames) {
        this.participantNames = participantNames == null ? null : participantNames.trim();
    }

    public String getInstructorNames() {
        return instructorNames;
    }

    public void setInstructorNames(String instructorNames) {
        this.instructorNames = instructorNames == null ? null : instructorNames.trim();
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType == null ? null : awardType.trim();
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel == null ? null : awardLevel.trim();
    }

    public String getInstructorIds() {
        return instructorIds;
    }

    public void setInstructorIds(String instructorIds) {
        this.instructorIds = instructorIds == null ? null : instructorIds.trim();
    }

    public Date getAchieveTime() {
        return achieveTime;
    }

    public void setAchieveTime(Date achieveTime) {
        this.achieveTime = achieveTime;
    }
}
package com.dut.sci.project.domain;

import java.util.Date;

public class FormDO {
    private Long formId;

    private Byte formStatus;

    private Long reviewerId;

    private String reviewerName;

    private Date submitTime;

    private Date passTime;

    private String applicantName;

    private String applicantPhoneNumber;

    private Long applicantId;

    private String contentDescription;

    private String imgUrls;

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Byte getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(Byte formStatus) {
        this.formStatus = formStatus;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName == null ? null : reviewerName.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getApplicantPhoneNumber() {
        return applicantPhoneNumber;
    }

    public void setApplicantPhoneNumber(String applicantPhoneNumber) {
        this.applicantPhoneNumber = applicantPhoneNumber == null ? null : applicantPhoneNumber.trim();
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription == null ? null : contentDescription.trim();
    }

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls == null ? null : imgUrls.trim();
    }
}
package com.dut.sci.project.domain;

import java.util.Date;

public class PaperDO {
    private Long paperId;

    private String authorIds;

    private String publicationPeriodical;

    private String paperName;

    private String collection;

    private Date publicationTime;

    public Long getPaperId() {
        return paperId;
    }

    public void setPaperId(Long paperId) {
        this.paperId = paperId;
    }

    public String getAuthorIds() {
        return authorIds;
    }

    public void setAuthorIds(String authorIds) {
        this.authorIds = authorIds == null ? null : authorIds.trim();
    }

    public String getPublicationPeriodical() {
        return publicationPeriodical;
    }

    public void setPublicationPeriodical(String publicationPeriodical) {
        this.publicationPeriodical = publicationPeriodical == null ? null : publicationPeriodical.trim();
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection == null ? null : collection.trim();
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
}
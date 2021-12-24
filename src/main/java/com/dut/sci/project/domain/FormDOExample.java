package com.dut.sci.project.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FormDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Long value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Long value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Long value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Long value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Long value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Long> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Long> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Long value1, Long value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Long value1, Long value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormStatusIsNull() {
            addCriterion("form_status is null");
            return (Criteria) this;
        }

        public Criteria andFormStatusIsNotNull() {
            addCriterion("form_status is not null");
            return (Criteria) this;
        }

        public Criteria andFormStatusEqualTo(Byte value) {
            addCriterion("form_status =", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusNotEqualTo(Byte value) {
            addCriterion("form_status <>", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusGreaterThan(Byte value) {
            addCriterion("form_status >", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("form_status >=", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusLessThan(Byte value) {
            addCriterion("form_status <", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusLessThanOrEqualTo(Byte value) {
            addCriterion("form_status <=", value, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusIn(List<Byte> values) {
            addCriterion("form_status in", values, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusNotIn(List<Byte> values) {
            addCriterion("form_status not in", values, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusBetween(Byte value1, Byte value2) {
            addCriterion("form_status between", value1, value2, "formStatus");
            return (Criteria) this;
        }

        public Criteria andFormStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("form_status not between", value1, value2, "formStatus");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNull() {
            addCriterion("reviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNotNull() {
            addCriterion("reviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdEqualTo(Long value) {
            addCriterion("reviewer_id =", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotEqualTo(Long value) {
            addCriterion("reviewer_id <>", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThan(Long value) {
            addCriterion("reviewer_id >", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer_id >=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThan(Long value) {
            addCriterion("reviewer_id <", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThanOrEqualTo(Long value) {
            addCriterion("reviewer_id <=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIn(List<Long> values) {
            addCriterion("reviewer_id in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotIn(List<Long> values) {
            addCriterion("reviewer_id not in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdBetween(Long value1, Long value2) {
            addCriterion("reviewer_id between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotBetween(Long value1, Long value2) {
            addCriterion("reviewer_id not between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIsNull() {
            addCriterion("reviewer_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIsNotNull() {
            addCriterion("reviewer_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameEqualTo(String value) {
            addCriterion("reviewer_name =", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotEqualTo(String value) {
            addCriterion("reviewer_name <>", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThan(String value) {
            addCriterion("reviewer_name >", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_name >=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThan(String value) {
            addCriterion("reviewer_name <", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThanOrEqualTo(String value) {
            addCriterion("reviewer_name <=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLike(String value) {
            addCriterion("reviewer_name like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotLike(String value) {
            addCriterion("reviewer_name not like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIn(List<String> values) {
            addCriterion("reviewer_name in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotIn(List<String> values) {
            addCriterion("reviewer_name not in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameBetween(String value1, String value2) {
            addCriterion("reviewer_name between", value1, value2, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotBetween(String value1, String value2) {
            addCriterion("reviewer_name not between", value1, value2, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeIsNull() {
            addCriterion("pass_time is null");
            return (Criteria) this;
        }

        public Criteria andPassTimeIsNotNull() {
            addCriterion("pass_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassTimeEqualTo(Date value) {
            addCriterion("pass_time =", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotEqualTo(Date value) {
            addCriterion("pass_time <>", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThan(Date value) {
            addCriterion("pass_time >", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pass_time >=", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThan(Date value) {
            addCriterion("pass_time <", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeLessThanOrEqualTo(Date value) {
            addCriterion("pass_time <=", value, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeIn(List<Date> values) {
            addCriterion("pass_time in", values, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotIn(List<Date> values) {
            addCriterion("pass_time not in", values, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeBetween(Date value1, Date value2) {
            addCriterion("pass_time between", value1, value2, "passTime");
            return (Criteria) this;
        }

        public Criteria andPassTimeNotBetween(Date value1, Date value2) {
            addCriterion("pass_time not between", value1, value2, "passTime");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNull() {
            addCriterion("applicant_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIsNotNull() {
            addCriterion("applicant_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantNameEqualTo(String value) {
            addCriterion("applicant_name =", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotEqualTo(String value) {
            addCriterion("applicant_name <>", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThan(String value) {
            addCriterion("applicant_name >", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_name >=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThan(String value) {
            addCriterion("applicant_name <", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLessThanOrEqualTo(String value) {
            addCriterion("applicant_name <=", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameLike(String value) {
            addCriterion("applicant_name like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotLike(String value) {
            addCriterion("applicant_name not like", value, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameIn(List<String> values) {
            addCriterion("applicant_name in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotIn(List<String> values) {
            addCriterion("applicant_name not in", values, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameBetween(String value1, String value2) {
            addCriterion("applicant_name between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantNameNotBetween(String value1, String value2) {
            addCriterion("applicant_name not between", value1, value2, "applicantName");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberIsNull() {
            addCriterion("applicant_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberIsNotNull() {
            addCriterion("applicant_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberEqualTo(String value) {
            addCriterion("applicant_phone_number =", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberNotEqualTo(String value) {
            addCriterion("applicant_phone_number <>", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberGreaterThan(String value) {
            addCriterion("applicant_phone_number >", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("applicant_phone_number >=", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberLessThan(String value) {
            addCriterion("applicant_phone_number <", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("applicant_phone_number <=", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberLike(String value) {
            addCriterion("applicant_phone_number like", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberNotLike(String value) {
            addCriterion("applicant_phone_number not like", value, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberIn(List<String> values) {
            addCriterion("applicant_phone_number in", values, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberNotIn(List<String> values) {
            addCriterion("applicant_phone_number not in", values, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberBetween(String value1, String value2) {
            addCriterion("applicant_phone_number between", value1, value2, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("applicant_phone_number not between", value1, value2, "applicantPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNull() {
            addCriterion("applicant_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIsNotNull() {
            addCriterion("applicant_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantIdEqualTo(Long value) {
            addCriterion("applicant_id =", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotEqualTo(Long value) {
            addCriterion("applicant_id <>", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThan(Long value) {
            addCriterion("applicant_id >", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("applicant_id >=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThan(Long value) {
            addCriterion("applicant_id <", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdLessThanOrEqualTo(Long value) {
            addCriterion("applicant_id <=", value, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdIn(List<Long> values) {
            addCriterion("applicant_id in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotIn(List<Long> values) {
            addCriterion("applicant_id not in", values, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdBetween(Long value1, Long value2) {
            addCriterion("applicant_id between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andApplicantIdNotBetween(Long value1, Long value2) {
            addCriterion("applicant_id not between", value1, value2, "applicantId");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIsNull() {
            addCriterion("content_description is null");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIsNotNull() {
            addCriterion("content_description is not null");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionEqualTo(String value) {
            addCriterion("content_description =", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotEqualTo(String value) {
            addCriterion("content_description <>", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionGreaterThan(String value) {
            addCriterion("content_description >", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("content_description >=", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLessThan(String value) {
            addCriterion("content_description <", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("content_description <=", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionLike(String value) {
            addCriterion("content_description like", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotLike(String value) {
            addCriterion("content_description not like", value, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionIn(List<String> values) {
            addCriterion("content_description in", values, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotIn(List<String> values) {
            addCriterion("content_description not in", values, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionBetween(String value1, String value2) {
            addCriterion("content_description between", value1, value2, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andContentDescriptionNotBetween(String value1, String value2) {
            addCriterion("content_description not between", value1, value2, "contentDescription");
            return (Criteria) this;
        }

        public Criteria andImgUrlsIsNull() {
            addCriterion("img_urls is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlsIsNotNull() {
            addCriterion("img_urls is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlsEqualTo(String value) {
            addCriterion("img_urls =", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsNotEqualTo(String value) {
            addCriterion("img_urls <>", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsGreaterThan(String value) {
            addCriterion("img_urls >", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("img_urls >=", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsLessThan(String value) {
            addCriterion("img_urls <", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsLessThanOrEqualTo(String value) {
            addCriterion("img_urls <=", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsLike(String value) {
            addCriterion("img_urls like", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsNotLike(String value) {
            addCriterion("img_urls not like", value, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsIn(List<String> values) {
            addCriterion("img_urls in", values, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsNotIn(List<String> values) {
            addCriterion("img_urls not in", values, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsBetween(String value1, String value2) {
            addCriterion("img_urls between", value1, value2, "imgUrls");
            return (Criteria) this;
        }

        public Criteria andImgUrlsNotBetween(String value1, String value2) {
            addCriterion("img_urls not between", value1, value2, "imgUrls");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
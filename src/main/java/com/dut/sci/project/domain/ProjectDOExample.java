package com.dut.sci.project.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDOExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Long value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Long value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Long value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Long value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Long value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Long> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Long> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Long value1, Long value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Long value1, Long value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsIsNull() {
            addCriterion("participant_ids is null");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsIsNotNull() {
            addCriterion("participant_ids is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsEqualTo(String value) {
            addCriterion("participant_ids =", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsNotEqualTo(String value) {
            addCriterion("participant_ids <>", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsGreaterThan(String value) {
            addCriterion("participant_ids >", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsGreaterThanOrEqualTo(String value) {
            addCriterion("participant_ids >=", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsLessThan(String value) {
            addCriterion("participant_ids <", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsLessThanOrEqualTo(String value) {
            addCriterion("participant_ids <=", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsLike(String value) {
            addCriterion("participant_ids like", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsNotLike(String value) {
            addCriterion("participant_ids not like", value, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsIn(List<String> values) {
            addCriterion("participant_ids in", values, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsNotIn(List<String> values) {
            addCriterion("participant_ids not in", values, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsBetween(String value1, String value2) {
            addCriterion("participant_ids between", value1, value2, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantIdsNotBetween(String value1, String value2) {
            addCriterion("participant_ids not between", value1, value2, "participantIds");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesIsNull() {
            addCriterion("participant_names is null");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesIsNotNull() {
            addCriterion("participant_names is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesEqualTo(String value) {
            addCriterion("participant_names =", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesNotEqualTo(String value) {
            addCriterion("participant_names <>", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesGreaterThan(String value) {
            addCriterion("participant_names >", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesGreaterThanOrEqualTo(String value) {
            addCriterion("participant_names >=", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesLessThan(String value) {
            addCriterion("participant_names <", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesLessThanOrEqualTo(String value) {
            addCriterion("participant_names <=", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesLike(String value) {
            addCriterion("participant_names like", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesNotLike(String value) {
            addCriterion("participant_names not like", value, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesIn(List<String> values) {
            addCriterion("participant_names in", values, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesNotIn(List<String> values) {
            addCriterion("participant_names not in", values, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesBetween(String value1, String value2) {
            addCriterion("participant_names between", value1, value2, "participantNames");
            return (Criteria) this;
        }

        public Criteria andParticipantNamesNotBetween(String value1, String value2) {
            addCriterion("participant_names not between", value1, value2, "participantNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesIsNull() {
            addCriterion("instructor_names is null");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesIsNotNull() {
            addCriterion("instructor_names is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesEqualTo(String value) {
            addCriterion("instructor_names =", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesNotEqualTo(String value) {
            addCriterion("instructor_names <>", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesGreaterThan(String value) {
            addCriterion("instructor_names >", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_names >=", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesLessThan(String value) {
            addCriterion("instructor_names <", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesLessThanOrEqualTo(String value) {
            addCriterion("instructor_names <=", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesLike(String value) {
            addCriterion("instructor_names like", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesNotLike(String value) {
            addCriterion("instructor_names not like", value, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesIn(List<String> values) {
            addCriterion("instructor_names in", values, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesNotIn(List<String> values) {
            addCriterion("instructor_names not in", values, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesBetween(String value1, String value2) {
            addCriterion("instructor_names between", value1, value2, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andInstructorNamesNotBetween(String value1, String value2) {
            addCriterion("instructor_names not between", value1, value2, "instructorNames");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIsNull() {
            addCriterion("award_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIsNotNull() {
            addCriterion("award_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeEqualTo(String value) {
            addCriterion("award_type =", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotEqualTo(String value) {
            addCriterion("award_type <>", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThan(String value) {
            addCriterion("award_type >", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("award_type >=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThan(String value) {
            addCriterion("award_type <", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThanOrEqualTo(String value) {
            addCriterion("award_type <=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLike(String value) {
            addCriterion("award_type like", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotLike(String value) {
            addCriterion("award_type not like", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIn(List<String> values) {
            addCriterion("award_type in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotIn(List<String> values) {
            addCriterion("award_type not in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeBetween(String value1, String value2) {
            addCriterion("award_type between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotBetween(String value1, String value2) {
            addCriterion("award_type not between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNull() {
            addCriterion("award_level is null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIsNotNull() {
            addCriterion("award_level is not null");
            return (Criteria) this;
        }

        public Criteria andAwardLevelEqualTo(String value) {
            addCriterion("award_level =", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotEqualTo(String value) {
            addCriterion("award_level <>", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThan(String value) {
            addCriterion("award_level >", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("award_level >=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThan(String value) {
            addCriterion("award_level <", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLessThanOrEqualTo(String value) {
            addCriterion("award_level <=", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelLike(String value) {
            addCriterion("award_level like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotLike(String value) {
            addCriterion("award_level not like", value, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelIn(List<String> values) {
            addCriterion("award_level in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotIn(List<String> values) {
            addCriterion("award_level not in", values, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelBetween(String value1, String value2) {
            addCriterion("award_level between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andAwardLevelNotBetween(String value1, String value2) {
            addCriterion("award_level not between", value1, value2, "awardLevel");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsIsNull() {
            addCriterion("instructor_ids is null");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsIsNotNull() {
            addCriterion("instructor_ids is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsEqualTo(String value) {
            addCriterion("instructor_ids =", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsNotEqualTo(String value) {
            addCriterion("instructor_ids <>", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsGreaterThan(String value) {
            addCriterion("instructor_ids >", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("instructor_ids >=", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsLessThan(String value) {
            addCriterion("instructor_ids <", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsLessThanOrEqualTo(String value) {
            addCriterion("instructor_ids <=", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsLike(String value) {
            addCriterion("instructor_ids like", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsNotLike(String value) {
            addCriterion("instructor_ids not like", value, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsIn(List<String> values) {
            addCriterion("instructor_ids in", values, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsNotIn(List<String> values) {
            addCriterion("instructor_ids not in", values, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsBetween(String value1, String value2) {
            addCriterion("instructor_ids between", value1, value2, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andInstructorIdsNotBetween(String value1, String value2) {
            addCriterion("instructor_ids not between", value1, value2, "instructorIds");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIsNull() {
            addCriterion("achieve_time is null");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIsNotNull() {
            addCriterion("achieve_time is not null");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeEqualTo(Date value) {
            addCriterion("achieve_time =", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotEqualTo(Date value) {
            addCriterion("achieve_time <>", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeGreaterThan(Date value) {
            addCriterion("achieve_time >", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("achieve_time >=", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeLessThan(Date value) {
            addCriterion("achieve_time <", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeLessThanOrEqualTo(Date value) {
            addCriterion("achieve_time <=", value, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeIn(List<Date> values) {
            addCriterion("achieve_time in", values, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotIn(List<Date> values) {
            addCriterion("achieve_time not in", values, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeBetween(Date value1, Date value2) {
            addCriterion("achieve_time between", value1, value2, "achieveTime");
            return (Criteria) this;
        }

        public Criteria andAchieveTimeNotBetween(Date value1, Date value2) {
            addCriterion("achieve_time not between", value1, value2, "achieveTime");
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
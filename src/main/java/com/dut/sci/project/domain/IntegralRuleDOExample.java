package com.dut.sci.project.domain;

import java.util.ArrayList;
import java.util.List;

public class IntegralRuleDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralRuleDOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
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

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
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
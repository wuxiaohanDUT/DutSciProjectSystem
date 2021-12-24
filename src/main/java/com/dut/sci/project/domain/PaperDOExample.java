package com.dut.sci.project.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperDOExample() {
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

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Long value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Long value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Long value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Long value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Long value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Long> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Long> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Long value1, Long value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Long value1, Long value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsIsNull() {
            addCriterion("author_ids is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsIsNotNull() {
            addCriterion("author_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsEqualTo(String value) {
            addCriterion("author_ids =", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsNotEqualTo(String value) {
            addCriterion("author_ids <>", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsGreaterThan(String value) {
            addCriterion("author_ids >", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsGreaterThanOrEqualTo(String value) {
            addCriterion("author_ids >=", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsLessThan(String value) {
            addCriterion("author_ids <", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsLessThanOrEqualTo(String value) {
            addCriterion("author_ids <=", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsLike(String value) {
            addCriterion("author_ids like", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsNotLike(String value) {
            addCriterion("author_ids not like", value, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsIn(List<String> values) {
            addCriterion("author_ids in", values, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsNotIn(List<String> values) {
            addCriterion("author_ids not in", values, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsBetween(String value1, String value2) {
            addCriterion("author_ids between", value1, value2, "authorIds");
            return (Criteria) this;
        }

        public Criteria andAuthorIdsNotBetween(String value1, String value2) {
            addCriterion("author_ids not between", value1, value2, "authorIds");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalIsNull() {
            addCriterion("publication_periodical is null");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalIsNotNull() {
            addCriterion("publication_periodical is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalEqualTo(String value) {
            addCriterion("publication_periodical =", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalNotEqualTo(String value) {
            addCriterion("publication_periodical <>", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalGreaterThan(String value) {
            addCriterion("publication_periodical >", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalGreaterThanOrEqualTo(String value) {
            addCriterion("publication_periodical >=", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalLessThan(String value) {
            addCriterion("publication_periodical <", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalLessThanOrEqualTo(String value) {
            addCriterion("publication_periodical <=", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalLike(String value) {
            addCriterion("publication_periodical like", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalNotLike(String value) {
            addCriterion("publication_periodical not like", value, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalIn(List<String> values) {
            addCriterion("publication_periodical in", values, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalNotIn(List<String> values) {
            addCriterion("publication_periodical not in", values, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalBetween(String value1, String value2) {
            addCriterion("publication_periodical between", value1, value2, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPublicationPeriodicalNotBetween(String value1, String value2) {
            addCriterion("publication_periodical not between", value1, value2, "publicationPeriodical");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNull() {
            addCriterion("collection is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNotNull() {
            addCriterion("collection is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEqualTo(String value) {
            addCriterion("collection =", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotEqualTo(String value) {
            addCriterion("collection <>", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThan(String value) {
            addCriterion("collection >", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("collection >=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThan(String value) {
            addCriterion("collection <", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThanOrEqualTo(String value) {
            addCriterion("collection <=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLike(String value) {
            addCriterion("collection like", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotLike(String value) {
            addCriterion("collection not like", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionIn(List<String> values) {
            addCriterion("collection in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotIn(List<String> values) {
            addCriterion("collection not in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionBetween(String value1, String value2) {
            addCriterion("collection between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotBetween(String value1, String value2) {
            addCriterion("collection not between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeIsNull() {
            addCriterion("publication_time is null");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeIsNotNull() {
            addCriterion("publication_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeEqualTo(Date value) {
            addCriterion("publication_time =", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeNotEqualTo(Date value) {
            addCriterion("publication_time <>", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeGreaterThan(Date value) {
            addCriterion("publication_time >", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publication_time >=", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeLessThan(Date value) {
            addCriterion("publication_time <", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeLessThanOrEqualTo(Date value) {
            addCriterion("publication_time <=", value, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeIn(List<Date> values) {
            addCriterion("publication_time in", values, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeNotIn(List<Date> values) {
            addCriterion("publication_time not in", values, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeBetween(Date value1, Date value2) {
            addCriterion("publication_time between", value1, value2, "publicationTime");
            return (Criteria) this;
        }

        public Criteria andPublicationTimeNotBetween(Date value1, Date value2) {
            addCriterion("publication_time not between", value1, value2, "publicationTime");
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
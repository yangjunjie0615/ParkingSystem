package com.project.bean;

import java.util.ArrayList;
import java.util.List;

public class ActionlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ActionlogExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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
            addCriterion("actionlog.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("actionlog.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("actionlog.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("actionlog.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("actionlog.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionlog.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("actionlog.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("actionlog.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("actionlog.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("actionlog.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("actionlog.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actionlog.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("actionlog.operatetime is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("actionlog.operatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(String value) {
            addCriterion("actionlog.operatetime =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(String value) {
            addCriterion("actionlog.operatetime <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(String value) {
            addCriterion("actionlog.operatetime >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("actionlog.operatetime >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(String value) {
            addCriterion("actionlog.operatetime <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(String value) {
            addCriterion("actionlog.operatetime <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLike(String value) {
            addCriterion("actionlog.operatetime like", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotLike(String value) {
            addCriterion("actionlog.operatetime not like", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<String> values) {
            addCriterion("actionlog.operatetime in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<String> values) {
            addCriterion("actionlog.operatetime not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(String value1, String value2) {
            addCriterion("actionlog.operatetime between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(String value1, String value2) {
            addCriterion("actionlog.operatetime not between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andActionmessageIsNull() {
            addCriterion("actionlog.actionmessage is null");
            return (Criteria) this;
        }

        public Criteria andActionmessageIsNotNull() {
            addCriterion("actionlog.actionmessage is not null");
            return (Criteria) this;
        }

        public Criteria andActionmessageEqualTo(String value) {
            addCriterion("actionlog.actionmessage =", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageNotEqualTo(String value) {
            addCriterion("actionlog.actionmessage <>", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageGreaterThan(String value) {
            addCriterion("actionlog.actionmessage >", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageGreaterThanOrEqualTo(String value) {
            addCriterion("actionlog.actionmessage >=", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageLessThan(String value) {
            addCriterion("actionlog.actionmessage <", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageLessThanOrEqualTo(String value) {
            addCriterion("actionlog.actionmessage <=", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageLike(String value) {
            addCriterion("actionlog.actionmessage like", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageNotLike(String value) {
            addCriterion("actionlog.actionmessage not like", value, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageIn(List<String> values) {
            addCriterion("actionlog.actionmessage in", values, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageNotIn(List<String> values) {
            addCriterion("actionlog.actionmessage not in", values, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageBetween(String value1, String value2) {
            addCriterion("actionlog.actionmessage between", value1, value2, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andActionmessageNotBetween(String value1, String value2) {
            addCriterion("actionlog.actionmessage not between", value1, value2, "actionmessage");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("actionlog.`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("actionlog.`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("actionlog.`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("actionlog.`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("actionlog.`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionlog.`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("actionlog.`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("actionlog.`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("actionlog.`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("actionlog.`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("actionlog.`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("actionlog.`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAcioninfoIsNull() {
            addCriterion("actionlog.acioninfo is null");
            return (Criteria) this;
        }

        public Criteria andAcioninfoIsNotNull() {
            addCriterion("actionlog.acioninfo is not null");
            return (Criteria) this;
        }

        public Criteria andAcioninfoEqualTo(String value) {
            addCriterion("actionlog.acioninfo =", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoNotEqualTo(String value) {
            addCriterion("actionlog.acioninfo <>", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoGreaterThan(String value) {
            addCriterion("actionlog.acioninfo >", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoGreaterThanOrEqualTo(String value) {
            addCriterion("actionlog.acioninfo >=", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoLessThan(String value) {
            addCriterion("actionlog.acioninfo <", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoLessThanOrEqualTo(String value) {
            addCriterion("actionlog.acioninfo <=", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoLike(String value) {
            addCriterion("actionlog.acioninfo like", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoNotLike(String value) {
            addCriterion("actionlog.acioninfo not like", value, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoIn(List<String> values) {
            addCriterion("actionlog.acioninfo in", values, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoNotIn(List<String> values) {
            addCriterion("actionlog.acioninfo not in", values, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoBetween(String value1, String value2) {
            addCriterion("actionlog.acioninfo between", value1, value2, "acioninfo");
            return (Criteria) this;
        }

        public Criteria andAcioninfoNotBetween(String value1, String value2) {
            addCriterion("actionlog.acioninfo not between", value1, value2, "acioninfo");
            return (Criteria) this;
        }
    }

    /**
     */
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
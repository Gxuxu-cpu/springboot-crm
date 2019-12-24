package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class SysRoleRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleRightExample() {
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

        public Criteria andRfRightCodeIsNull() {
            addCriterion("rf_right_code is null");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeIsNotNull() {
            addCriterion("rf_right_code is not null");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeEqualTo(String value) {
            addCriterion("rf_right_code =", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeNotEqualTo(String value) {
            addCriterion("rf_right_code <>", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeGreaterThan(String value) {
            addCriterion("rf_right_code >", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rf_right_code >=", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeLessThan(String value) {
            addCriterion("rf_right_code <", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeLessThanOrEqualTo(String value) {
            addCriterion("rf_right_code <=", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeLike(String value) {
            addCriterion("rf_right_code like", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeNotLike(String value) {
            addCriterion("rf_right_code not like", value, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeIn(List<String> values) {
            addCriterion("rf_right_code in", values, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeNotIn(List<String> values) {
            addCriterion("rf_right_code not in", values, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeBetween(String value1, String value2) {
            addCriterion("rf_right_code between", value1, value2, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRightCodeNotBetween(String value1, String value2) {
            addCriterion("rf_right_code not between", value1, value2, "rfRightCode");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdIsNull() {
            addCriterion("rf_role_id is null");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdIsNotNull() {
            addCriterion("rf_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdEqualTo(Long value) {
            addCriterion("rf_role_id =", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdNotEqualTo(Long value) {
            addCriterion("rf_role_id <>", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdGreaterThan(Long value) {
            addCriterion("rf_role_id >", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rf_role_id >=", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdLessThan(Long value) {
            addCriterion("rf_role_id <", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("rf_role_id <=", value, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdIn(List<Long> values) {
            addCriterion("rf_role_id in", values, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdNotIn(List<Long> values) {
            addCriterion("rf_role_id not in", values, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdBetween(Long value1, Long value2) {
            addCriterion("rf_role_id between", value1, value2, "rfRoleId");
            return (Criteria) this;
        }

        public Criteria andRfRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("rf_role_id not between", value1, value2, "rfRoleId");
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
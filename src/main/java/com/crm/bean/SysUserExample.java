package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUsrIdIsNull() {
            addCriterion("usr_id is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(Long value) {
            addCriterion("usr_id =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(Long value) {
            addCriterion("usr_id <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(Long value) {
            addCriterion("usr_id >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("usr_id >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(Long value) {
            addCriterion("usr_id <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(Long value) {
            addCriterion("usr_id <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<Long> values) {
            addCriterion("usr_id in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<Long> values) {
            addCriterion("usr_id not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(Long value1, Long value2) {
            addCriterion("usr_id between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(Long value1, Long value2) {
            addCriterion("usr_id not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("usr_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("usr_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("usr_name =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("usr_name <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("usr_name >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_name >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("usr_name <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("usr_name <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("usr_name like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("usr_name not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("usr_name in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("usr_name not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("usr_name between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("usr_name not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("usr_password is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("usr_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("usr_password =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("usr_password <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("usr_password >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("usr_password >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("usr_password <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("usr_password <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("usr_password like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("usr_password not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("usr_password in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("usr_password not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("usr_password between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("usr_password not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIsNull() {
            addCriterion("usr_flag is null");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIsNotNull() {
            addCriterion("usr_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFlagEqualTo(Integer value) {
            addCriterion("usr_flag =", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotEqualTo(Integer value) {
            addCriterion("usr_flag <>", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagGreaterThan(Integer value) {
            addCriterion("usr_flag >", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("usr_flag >=", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagLessThan(Integer value) {
            addCriterion("usr_flag <", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagLessThanOrEqualTo(Integer value) {
            addCriterion("usr_flag <=", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIn(List<Integer> values) {
            addCriterion("usr_flag in", values, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotIn(List<Integer> values) {
            addCriterion("usr_flag not in", values, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagBetween(Integer value1, Integer value2) {
            addCriterion("usr_flag between", value1, value2, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("usr_flag not between", value1, value2, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIsNull() {
            addCriterion("usr_role_id is null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIsNotNull() {
            addCriterion("usr_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdEqualTo(Long value) {
            addCriterion("usr_role_id =", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotEqualTo(Long value) {
            addCriterion("usr_role_id <>", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdGreaterThan(Long value) {
            addCriterion("usr_role_id >", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("usr_role_id >=", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdLessThan(Long value) {
            addCriterion("usr_role_id <", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("usr_role_id <=", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIn(List<Long> values) {
            addCriterion("usr_role_id in", values, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotIn(List<Long> values) {
            addCriterion("usr_role_id not in", values, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdBetween(Long value1, Long value2) {
            addCriterion("usr_role_id between", value1, value2, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("usr_role_id not between", value1, value2, "usrRoleId");
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
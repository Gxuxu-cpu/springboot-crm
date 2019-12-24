package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class SysRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRightExample() {
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

        public Criteria andRightCodeIsNull() {
            addCriterion("right_code is null");
            return (Criteria) this;
        }

        public Criteria andRightCodeIsNotNull() {
            addCriterion("right_code is not null");
            return (Criteria) this;
        }

        public Criteria andRightCodeEqualTo(String value) {
            addCriterion("right_code =", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotEqualTo(String value) {
            addCriterion("right_code <>", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThan(String value) {
            addCriterion("right_code >", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThanOrEqualTo(String value) {
            addCriterion("right_code >=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThan(String value) {
            addCriterion("right_code <", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThanOrEqualTo(String value) {
            addCriterion("right_code <=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLike(String value) {
            addCriterion("right_code like", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotLike(String value) {
            addCriterion("right_code not like", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeIn(List<String> values) {
            addCriterion("right_code in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotIn(List<String> values) {
            addCriterion("right_code not in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeBetween(String value1, String value2) {
            addCriterion("right_code between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotBetween(String value1, String value2) {
            addCriterion("right_code not between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeIsNull() {
            addCriterion("right_parent_code is null");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeIsNotNull() {
            addCriterion("right_parent_code is not null");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeEqualTo(String value) {
            addCriterion("right_parent_code =", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeNotEqualTo(String value) {
            addCriterion("right_parent_code <>", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeGreaterThan(String value) {
            addCriterion("right_parent_code >", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("right_parent_code >=", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeLessThan(String value) {
            addCriterion("right_parent_code <", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeLessThanOrEqualTo(String value) {
            addCriterion("right_parent_code <=", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeLike(String value) {
            addCriterion("right_parent_code like", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeNotLike(String value) {
            addCriterion("right_parent_code not like", value, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeIn(List<String> values) {
            addCriterion("right_parent_code in", values, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeNotIn(List<String> values) {
            addCriterion("right_parent_code not in", values, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeBetween(String value1, String value2) {
            addCriterion("right_parent_code between", value1, value2, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightParentCodeNotBetween(String value1, String value2) {
            addCriterion("right_parent_code not between", value1, value2, "rightParentCode");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNull() {
            addCriterion("right_type is null");
            return (Criteria) this;
        }

        public Criteria andRightTypeIsNotNull() {
            addCriterion("right_type is not null");
            return (Criteria) this;
        }

        public Criteria andRightTypeEqualTo(String value) {
            addCriterion("right_type =", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotEqualTo(String value) {
            addCriterion("right_type <>", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThan(String value) {
            addCriterion("right_type >", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeGreaterThanOrEqualTo(String value) {
            addCriterion("right_type >=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThan(String value) {
            addCriterion("right_type <", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLessThanOrEqualTo(String value) {
            addCriterion("right_type <=", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeLike(String value) {
            addCriterion("right_type like", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotLike(String value) {
            addCriterion("right_type not like", value, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeIn(List<String> values) {
            addCriterion("right_type in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotIn(List<String> values) {
            addCriterion("right_type not in", values, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeBetween(String value1, String value2) {
            addCriterion("right_type between", value1, value2, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTypeNotBetween(String value1, String value2) {
            addCriterion("right_type not between", value1, value2, "rightType");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNull() {
            addCriterion("right_text is null");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNotNull() {
            addCriterion("right_text is not null");
            return (Criteria) this;
        }

        public Criteria andRightTextEqualTo(String value) {
            addCriterion("right_text =", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotEqualTo(String value) {
            addCriterion("right_text <>", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThan(String value) {
            addCriterion("right_text >", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThanOrEqualTo(String value) {
            addCriterion("right_text >=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThan(String value) {
            addCriterion("right_text <", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThanOrEqualTo(String value) {
            addCriterion("right_text <=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLike(String value) {
            addCriterion("right_text like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotLike(String value) {
            addCriterion("right_text not like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextIn(List<String> values) {
            addCriterion("right_text in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotIn(List<String> values) {
            addCriterion("right_text not in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextBetween(String value1, String value2) {
            addCriterion("right_text between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotBetween(String value1, String value2) {
            addCriterion("right_text not between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightUrlIsNull() {
            addCriterion("right_url is null");
            return (Criteria) this;
        }

        public Criteria andRightUrlIsNotNull() {
            addCriterion("right_url is not null");
            return (Criteria) this;
        }

        public Criteria andRightUrlEqualTo(String value) {
            addCriterion("right_url =", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotEqualTo(String value) {
            addCriterion("right_url <>", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlGreaterThan(String value) {
            addCriterion("right_url >", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlGreaterThanOrEqualTo(String value) {
            addCriterion("right_url >=", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLessThan(String value) {
            addCriterion("right_url <", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLessThanOrEqualTo(String value) {
            addCriterion("right_url <=", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlLike(String value) {
            addCriterion("right_url like", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotLike(String value) {
            addCriterion("right_url not like", value, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlIn(List<String> values) {
            addCriterion("right_url in", values, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotIn(List<String> values) {
            addCriterion("right_url not in", values, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlBetween(String value1, String value2) {
            addCriterion("right_url between", value1, value2, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightUrlNotBetween(String value1, String value2) {
            addCriterion("right_url not between", value1, value2, "rightUrl");
            return (Criteria) this;
        }

        public Criteria andRightTipIsNull() {
            addCriterion("right_tip is null");
            return (Criteria) this;
        }

        public Criteria andRightTipIsNotNull() {
            addCriterion("right_tip is not null");
            return (Criteria) this;
        }

        public Criteria andRightTipEqualTo(String value) {
            addCriterion("right_tip =", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotEqualTo(String value) {
            addCriterion("right_tip <>", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipGreaterThan(String value) {
            addCriterion("right_tip >", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipGreaterThanOrEqualTo(String value) {
            addCriterion("right_tip >=", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLessThan(String value) {
            addCriterion("right_tip <", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLessThanOrEqualTo(String value) {
            addCriterion("right_tip <=", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipLike(String value) {
            addCriterion("right_tip like", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotLike(String value) {
            addCriterion("right_tip not like", value, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipIn(List<String> values) {
            addCriterion("right_tip in", values, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotIn(List<String> values) {
            addCriterion("right_tip not in", values, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipBetween(String value1, String value2) {
            addCriterion("right_tip between", value1, value2, "rightTip");
            return (Criteria) this;
        }

        public Criteria andRightTipNotBetween(String value1, String value2) {
            addCriterion("right_tip not between", value1, value2, "rightTip");
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
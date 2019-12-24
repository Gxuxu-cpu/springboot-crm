package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CstLinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstLinkmanExample() {
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

        public Criteria andLkmIdIsNull() {
            addCriterion("lkm_id is null");
            return (Criteria) this;
        }

        public Criteria andLkmIdIsNotNull() {
            addCriterion("lkm_id is not null");
            return (Criteria) this;
        }

        public Criteria andLkmIdEqualTo(Long value) {
            addCriterion("lkm_id =", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotEqualTo(Long value) {
            addCriterion("lkm_id <>", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThan(Long value) {
            addCriterion("lkm_id >", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lkm_id >=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThan(Long value) {
            addCriterion("lkm_id <", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThanOrEqualTo(Long value) {
            addCriterion("lkm_id <=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdIn(List<Long> values) {
            addCriterion("lkm_id in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotIn(List<Long> values) {
            addCriterion("lkm_id not in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdBetween(Long value1, Long value2) {
            addCriterion("lkm_id between", value1, value2, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotBetween(Long value1, Long value2) {
            addCriterion("lkm_id not between", value1, value2, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIsNull() {
            addCriterion("lkm_cust_no is null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIsNotNull() {
            addCriterion("lkm_cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoEqualTo(String value) {
            addCriterion("lkm_cust_no =", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotEqualTo(String value) {
            addCriterion("lkm_cust_no <>", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoGreaterThan(String value) {
            addCriterion("lkm_cust_no >", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_cust_no >=", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLessThan(String value) {
            addCriterion("lkm_cust_no <", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLessThanOrEqualTo(String value) {
            addCriterion("lkm_cust_no <=", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLike(String value) {
            addCriterion("lkm_cust_no like", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotLike(String value) {
            addCriterion("lkm_cust_no not like", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIn(List<String> values) {
            addCriterion("lkm_cust_no in", values, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotIn(List<String> values) {
            addCriterion("lkm_cust_no not in", values, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoBetween(String value1, String value2) {
            addCriterion("lkm_cust_no between", value1, value2, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotBetween(String value1, String value2) {
            addCriterion("lkm_cust_no not between", value1, value2, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIsNull() {
            addCriterion("lkm_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIsNotNull() {
            addCriterion("lkm_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameEqualTo(String value) {
            addCriterion("lkm_cust_name =", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotEqualTo(String value) {
            addCriterion("lkm_cust_name <>", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameGreaterThan(String value) {
            addCriterion("lkm_cust_name >", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_cust_name >=", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLessThan(String value) {
            addCriterion("lkm_cust_name <", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLessThanOrEqualTo(String value) {
            addCriterion("lkm_cust_name <=", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLike(String value) {
            addCriterion("lkm_cust_name like", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotLike(String value) {
            addCriterion("lkm_cust_name not like", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIn(List<String> values) {
            addCriterion("lkm_cust_name in", values, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotIn(List<String> values) {
            addCriterion("lkm_cust_name not in", values, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameBetween(String value1, String value2) {
            addCriterion("lkm_cust_name between", value1, value2, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotBetween(String value1, String value2) {
            addCriterion("lkm_cust_name not between", value1, value2, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmNameIsNull() {
            addCriterion("lkm_name is null");
            return (Criteria) this;
        }

        public Criteria andLkmNameIsNotNull() {
            addCriterion("lkm_name is not null");
            return (Criteria) this;
        }

        public Criteria andLkmNameEqualTo(String value) {
            addCriterion("lkm_name =", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotEqualTo(String value) {
            addCriterion("lkm_name <>", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameGreaterThan(String value) {
            addCriterion("lkm_name >", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_name >=", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLessThan(String value) {
            addCriterion("lkm_name <", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLessThanOrEqualTo(String value) {
            addCriterion("lkm_name <=", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLike(String value) {
            addCriterion("lkm_name like", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotLike(String value) {
            addCriterion("lkm_name not like", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameIn(List<String> values) {
            addCriterion("lkm_name in", values, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotIn(List<String> values) {
            addCriterion("lkm_name not in", values, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameBetween(String value1, String value2) {
            addCriterion("lkm_name between", value1, value2, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotBetween(String value1, String value2) {
            addCriterion("lkm_name not between", value1, value2, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmSexIsNull() {
            addCriterion("lkm_sex is null");
            return (Criteria) this;
        }

        public Criteria andLkmSexIsNotNull() {
            addCriterion("lkm_sex is not null");
            return (Criteria) this;
        }

        public Criteria andLkmSexEqualTo(String value) {
            addCriterion("lkm_sex =", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotEqualTo(String value) {
            addCriterion("lkm_sex <>", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexGreaterThan(String value) {
            addCriterion("lkm_sex >", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_sex >=", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLessThan(String value) {
            addCriterion("lkm_sex <", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLessThanOrEqualTo(String value) {
            addCriterion("lkm_sex <=", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLike(String value) {
            addCriterion("lkm_sex like", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotLike(String value) {
            addCriterion("lkm_sex not like", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexIn(List<String> values) {
            addCriterion("lkm_sex in", values, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotIn(List<String> values) {
            addCriterion("lkm_sex not in", values, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexBetween(String value1, String value2) {
            addCriterion("lkm_sex between", value1, value2, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotBetween(String value1, String value2) {
            addCriterion("lkm_sex not between", value1, value2, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIsNull() {
            addCriterion("lkm_postion is null");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIsNotNull() {
            addCriterion("lkm_postion is not null");
            return (Criteria) this;
        }

        public Criteria andLkmPostionEqualTo(String value) {
            addCriterion("lkm_postion =", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotEqualTo(String value) {
            addCriterion("lkm_postion <>", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionGreaterThan(String value) {
            addCriterion("lkm_postion >", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_postion >=", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLessThan(String value) {
            addCriterion("lkm_postion <", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLessThanOrEqualTo(String value) {
            addCriterion("lkm_postion <=", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLike(String value) {
            addCriterion("lkm_postion like", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotLike(String value) {
            addCriterion("lkm_postion not like", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIn(List<String> values) {
            addCriterion("lkm_postion in", values, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotIn(List<String> values) {
            addCriterion("lkm_postion not in", values, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionBetween(String value1, String value2) {
            addCriterion("lkm_postion between", value1, value2, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotBetween(String value1, String value2) {
            addCriterion("lkm_postion not between", value1, value2, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmTelIsNull() {
            addCriterion("lkm_tel is null");
            return (Criteria) this;
        }

        public Criteria andLkmTelIsNotNull() {
            addCriterion("lkm_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLkmTelEqualTo(String value) {
            addCriterion("lkm_tel =", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotEqualTo(String value) {
            addCriterion("lkm_tel <>", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelGreaterThan(String value) {
            addCriterion("lkm_tel >", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_tel >=", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLessThan(String value) {
            addCriterion("lkm_tel <", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLessThanOrEqualTo(String value) {
            addCriterion("lkm_tel <=", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLike(String value) {
            addCriterion("lkm_tel like", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotLike(String value) {
            addCriterion("lkm_tel not like", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelIn(List<String> values) {
            addCriterion("lkm_tel in", values, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotIn(List<String> values) {
            addCriterion("lkm_tel not in", values, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelBetween(String value1, String value2) {
            addCriterion("lkm_tel between", value1, value2, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotBetween(String value1, String value2) {
            addCriterion("lkm_tel not between", value1, value2, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIsNull() {
            addCriterion("lkm_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIsNotNull() {
            addCriterion("lkm_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLkmMobileEqualTo(String value) {
            addCriterion("lkm_mobile =", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotEqualTo(String value) {
            addCriterion("lkm_mobile <>", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileGreaterThan(String value) {
            addCriterion("lkm_mobile >", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_mobile >=", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLessThan(String value) {
            addCriterion("lkm_mobile <", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLessThanOrEqualTo(String value) {
            addCriterion("lkm_mobile <=", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLike(String value) {
            addCriterion("lkm_mobile like", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotLike(String value) {
            addCriterion("lkm_mobile not like", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIn(List<String> values) {
            addCriterion("lkm_mobile in", values, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotIn(List<String> values) {
            addCriterion("lkm_mobile not in", values, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileBetween(String value1, String value2) {
            addCriterion("lkm_mobile between", value1, value2, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotBetween(String value1, String value2) {
            addCriterion("lkm_mobile not between", value1, value2, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIsNull() {
            addCriterion("lkm_memo is null");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIsNotNull() {
            addCriterion("lkm_memo is not null");
            return (Criteria) this;
        }

        public Criteria andLkmMemoEqualTo(String value) {
            addCriterion("lkm_memo =", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotEqualTo(String value) {
            addCriterion("lkm_memo <>", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoGreaterThan(String value) {
            addCriterion("lkm_memo >", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoGreaterThanOrEqualTo(String value) {
            addCriterion("lkm_memo >=", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLessThan(String value) {
            addCriterion("lkm_memo <", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLessThanOrEqualTo(String value) {
            addCriterion("lkm_memo <=", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLike(String value) {
            addCriterion("lkm_memo like", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotLike(String value) {
            addCriterion("lkm_memo not like", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIn(List<String> values) {
            addCriterion("lkm_memo in", values, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotIn(List<String> values) {
            addCriterion("lkm_memo not in", values, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoBetween(String value1, String value2) {
            addCriterion("lkm_memo between", value1, value2, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotBetween(String value1, String value2) {
            addCriterion("lkm_memo not between", value1, value2, "lkmMemo");
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
package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CstLostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstLostExample() {
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

        public Criteria andLstIdIsNull() {
            addCriterion("lst_id is null");
            return (Criteria) this;
        }

        public Criteria andLstIdIsNotNull() {
            addCriterion("lst_id is not null");
            return (Criteria) this;
        }

        public Criteria andLstIdEqualTo(Long value) {
            addCriterion("lst_id =", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotEqualTo(Long value) {
            addCriterion("lst_id <>", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdGreaterThan(Long value) {
            addCriterion("lst_id >", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lst_id >=", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdLessThan(Long value) {
            addCriterion("lst_id <", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdLessThanOrEqualTo(Long value) {
            addCriterion("lst_id <=", value, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdIn(List<Long> values) {
            addCriterion("lst_id in", values, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotIn(List<Long> values) {
            addCriterion("lst_id not in", values, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdBetween(Long value1, Long value2) {
            addCriterion("lst_id between", value1, value2, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstIdNotBetween(Long value1, Long value2) {
            addCriterion("lst_id not between", value1, value2, "lstId");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIsNull() {
            addCriterion("lst_cust_no is null");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIsNotNull() {
            addCriterion("lst_cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustNoEqualTo(String value) {
            addCriterion("lst_cust_no =", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotEqualTo(String value) {
            addCriterion("lst_cust_no <>", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoGreaterThan(String value) {
            addCriterion("lst_cust_no >", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("lst_cust_no >=", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLessThan(String value) {
            addCriterion("lst_cust_no <", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLessThanOrEqualTo(String value) {
            addCriterion("lst_cust_no <=", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoLike(String value) {
            addCriterion("lst_cust_no like", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotLike(String value) {
            addCriterion("lst_cust_no not like", value, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoIn(List<String> values) {
            addCriterion("lst_cust_no in", values, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotIn(List<String> values) {
            addCriterion("lst_cust_no not in", values, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoBetween(String value1, String value2) {
            addCriterion("lst_cust_no between", value1, value2, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNoNotBetween(String value1, String value2) {
            addCriterion("lst_cust_no not between", value1, value2, "lstCustNo");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIsNull() {
            addCriterion("lst_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIsNotNull() {
            addCriterion("lst_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustNameEqualTo(String value) {
            addCriterion("lst_cust_name =", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotEqualTo(String value) {
            addCriterion("lst_cust_name <>", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameGreaterThan(String value) {
            addCriterion("lst_cust_name >", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("lst_cust_name >=", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLessThan(String value) {
            addCriterion("lst_cust_name <", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLessThanOrEqualTo(String value) {
            addCriterion("lst_cust_name <=", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameLike(String value) {
            addCriterion("lst_cust_name like", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotLike(String value) {
            addCriterion("lst_cust_name not like", value, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameIn(List<String> values) {
            addCriterion("lst_cust_name in", values, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotIn(List<String> values) {
            addCriterion("lst_cust_name not in", values, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameBetween(String value1, String value2) {
            addCriterion("lst_cust_name between", value1, value2, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustNameNotBetween(String value1, String value2) {
            addCriterion("lst_cust_name not between", value1, value2, "lstCustName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIsNull() {
            addCriterion("lst_cust_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIsNotNull() {
            addCriterion("lst_cust_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdEqualTo(Long value) {
            addCriterion("lst_cust_manager_id =", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotEqualTo(Long value) {
            addCriterion("lst_cust_manager_id <>", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdGreaterThan(Long value) {
            addCriterion("lst_cust_manager_id >", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lst_cust_manager_id >=", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdLessThan(Long value) {
            addCriterion("lst_cust_manager_id <", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("lst_cust_manager_id <=", value, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdIn(List<Long> values) {
            addCriterion("lst_cust_manager_id in", values, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotIn(List<Long> values) {
            addCriterion("lst_cust_manager_id not in", values, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdBetween(Long value1, Long value2) {
            addCriterion("lst_cust_manager_id between", value1, value2, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("lst_cust_manager_id not between", value1, value2, "lstCustManagerId");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIsNull() {
            addCriterion("lst_cust_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIsNotNull() {
            addCriterion("lst_cust_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameEqualTo(String value) {
            addCriterion("lst_cust_manager_name =", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotEqualTo(String value) {
            addCriterion("lst_cust_manager_name <>", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameGreaterThan(String value) {
            addCriterion("lst_cust_manager_name >", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("lst_cust_manager_name >=", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLessThan(String value) {
            addCriterion("lst_cust_manager_name <", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLessThanOrEqualTo(String value) {
            addCriterion("lst_cust_manager_name <=", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameLike(String value) {
            addCriterion("lst_cust_manager_name like", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotLike(String value) {
            addCriterion("lst_cust_manager_name not like", value, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameIn(List<String> values) {
            addCriterion("lst_cust_manager_name in", values, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotIn(List<String> values) {
            addCriterion("lst_cust_manager_name not in", values, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameBetween(String value1, String value2) {
            addCriterion("lst_cust_manager_name between", value1, value2, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstCustManagerNameNotBetween(String value1, String value2) {
            addCriterion("lst_cust_manager_name not between", value1, value2, "lstCustManagerName");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIsNull() {
            addCriterion("lst_last_order_date is null");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIsNotNull() {
            addCriterion("lst_last_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateEqualTo(String value) {
            addCriterion("lst_last_order_date =", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotEqualTo(String value) {
            addCriterion("lst_last_order_date <>", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateGreaterThan(String value) {
            addCriterion("lst_last_order_date >", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateGreaterThanOrEqualTo(String value) {
            addCriterion("lst_last_order_date >=", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateLessThan(String value) {
            addCriterion("lst_last_order_date <", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateLessThanOrEqualTo(String value) {
            addCriterion("lst_last_order_date <=", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateLike(String value) {
            addCriterion("lst_last_order_date like", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotLike(String value) {
            addCriterion("lst_last_order_date not like", value, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateIn(List<String> values) {
            addCriterion("lst_last_order_date in", values, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotIn(List<String> values) {
            addCriterion("lst_last_order_date not in", values, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateBetween(String value1, String value2) {
            addCriterion("lst_last_order_date between", value1, value2, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLastOrderDateNotBetween(String value1, String value2) {
            addCriterion("lst_last_order_date not between", value1, value2, "lstLastOrderDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIsNull() {
            addCriterion("lst_lost_date is null");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIsNotNull() {
            addCriterion("lst_lost_date is not null");
            return (Criteria) this;
        }

        public Criteria andLstLostDateEqualTo(String value) {
            addCriterion("lst_lost_date =", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotEqualTo(String value) {
            addCriterion("lst_lost_date <>", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateGreaterThan(String value) {
            addCriterion("lst_lost_date >", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateGreaterThanOrEqualTo(String value) {
            addCriterion("lst_lost_date >=", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateLessThan(String value) {
            addCriterion("lst_lost_date <", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateLessThanOrEqualTo(String value) {
            addCriterion("lst_lost_date <=", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateLike(String value) {
            addCriterion("lst_lost_date like", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotLike(String value) {
            addCriterion("lst_lost_date not like", value, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateIn(List<String> values) {
            addCriterion("lst_lost_date in", values, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotIn(List<String> values) {
            addCriterion("lst_lost_date not in", values, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateBetween(String value1, String value2) {
            addCriterion("lst_lost_date between", value1, value2, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstLostDateNotBetween(String value1, String value2) {
            addCriterion("lst_lost_date not between", value1, value2, "lstLostDate");
            return (Criteria) this;
        }

        public Criteria andLstDelayIsNull() {
            addCriterion("lst_delay is null");
            return (Criteria) this;
        }

        public Criteria andLstDelayIsNotNull() {
            addCriterion("lst_delay is not null");
            return (Criteria) this;
        }

        public Criteria andLstDelayEqualTo(String value) {
            addCriterion("lst_delay =", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotEqualTo(String value) {
            addCriterion("lst_delay <>", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayGreaterThan(String value) {
            addCriterion("lst_delay >", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayGreaterThanOrEqualTo(String value) {
            addCriterion("lst_delay >=", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLessThan(String value) {
            addCriterion("lst_delay <", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLessThanOrEqualTo(String value) {
            addCriterion("lst_delay <=", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayLike(String value) {
            addCriterion("lst_delay like", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotLike(String value) {
            addCriterion("lst_delay not like", value, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayIn(List<String> values) {
            addCriterion("lst_delay in", values, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotIn(List<String> values) {
            addCriterion("lst_delay not in", values, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayBetween(String value1, String value2) {
            addCriterion("lst_delay between", value1, value2, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstDelayNotBetween(String value1, String value2) {
            addCriterion("lst_delay not between", value1, value2, "lstDelay");
            return (Criteria) this;
        }

        public Criteria andLstReasonIsNull() {
            addCriterion("lst_reason is null");
            return (Criteria) this;
        }

        public Criteria andLstReasonIsNotNull() {
            addCriterion("lst_reason is not null");
            return (Criteria) this;
        }

        public Criteria andLstReasonEqualTo(String value) {
            addCriterion("lst_reason =", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotEqualTo(String value) {
            addCriterion("lst_reason <>", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonGreaterThan(String value) {
            addCriterion("lst_reason >", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonGreaterThanOrEqualTo(String value) {
            addCriterion("lst_reason >=", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLessThan(String value) {
            addCriterion("lst_reason <", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLessThanOrEqualTo(String value) {
            addCriterion("lst_reason <=", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonLike(String value) {
            addCriterion("lst_reason like", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotLike(String value) {
            addCriterion("lst_reason not like", value, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonIn(List<String> values) {
            addCriterion("lst_reason in", values, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotIn(List<String> values) {
            addCriterion("lst_reason not in", values, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonBetween(String value1, String value2) {
            addCriterion("lst_reason between", value1, value2, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstReasonNotBetween(String value1, String value2) {
            addCriterion("lst_reason not between", value1, value2, "lstReason");
            return (Criteria) this;
        }

        public Criteria andLstStatusIsNull() {
            addCriterion("lst_status is null");
            return (Criteria) this;
        }

        public Criteria andLstStatusIsNotNull() {
            addCriterion("lst_status is not null");
            return (Criteria) this;
        }

        public Criteria andLstStatusEqualTo(String value) {
            addCriterion("lst_status =", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotEqualTo(String value) {
            addCriterion("lst_status <>", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusGreaterThan(String value) {
            addCriterion("lst_status >", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusGreaterThanOrEqualTo(String value) {
            addCriterion("lst_status >=", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusLessThan(String value) {
            addCriterion("lst_status <", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusLessThanOrEqualTo(String value) {
            addCriterion("lst_status <=", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusLike(String value) {
            addCriterion("lst_status like", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotLike(String value) {
            addCriterion("lst_status not like", value, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusIn(List<String> values) {
            addCriterion("lst_status in", values, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotIn(List<String> values) {
            addCriterion("lst_status not in", values, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusBetween(String value1, String value2) {
            addCriterion("lst_status between", value1, value2, "lstStatus");
            return (Criteria) this;
        }

        public Criteria andLstStatusNotBetween(String value1, String value2) {
            addCriterion("lst_status not between", value1, value2, "lstStatus");
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
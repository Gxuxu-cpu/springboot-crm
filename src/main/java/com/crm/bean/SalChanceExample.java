package com.crm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalChanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalChanceExample() {
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

        public Criteria andChcIdIsNull() {
            addCriterion("chc_id is null");
            return (Criteria) this;
        }

        public Criteria andChcIdIsNotNull() {
            addCriterion("chc_id is not null");
            return (Criteria) this;
        }

        public Criteria andChcIdEqualTo(Long value) {
            addCriterion("chc_id =", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotEqualTo(Long value) {
            addCriterion("chc_id <>", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThan(Long value) {
            addCriterion("chc_id >", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chc_id >=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThan(Long value) {
            addCriterion("chc_id <", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThanOrEqualTo(Long value) {
            addCriterion("chc_id <=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdIn(List<Long> values) {
            addCriterion("chc_id in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotIn(List<Long> values) {
            addCriterion("chc_id not in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdBetween(Long value1, Long value2) {
            addCriterion("chc_id between", value1, value2, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotBetween(Long value1, Long value2) {
            addCriterion("chc_id not between", value1, value2, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcSourceIsNull() {
            addCriterion("chc_source is null");
            return (Criteria) this;
        }

        public Criteria andChcSourceIsNotNull() {
            addCriterion("chc_source is not null");
            return (Criteria) this;
        }

        public Criteria andChcSourceEqualTo(String value) {
            addCriterion("chc_source =", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotEqualTo(String value) {
            addCriterion("chc_source <>", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceGreaterThan(String value) {
            addCriterion("chc_source >", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceGreaterThanOrEqualTo(String value) {
            addCriterion("chc_source >=", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLessThan(String value) {
            addCriterion("chc_source <", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLessThanOrEqualTo(String value) {
            addCriterion("chc_source <=", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLike(String value) {
            addCriterion("chc_source like", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotLike(String value) {
            addCriterion("chc_source not like", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceIn(List<String> values) {
            addCriterion("chc_source in", values, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotIn(List<String> values) {
            addCriterion("chc_source not in", values, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceBetween(String value1, String value2) {
            addCriterion("chc_source between", value1, value2, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotBetween(String value1, String value2) {
            addCriterion("chc_source not between", value1, value2, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIsNull() {
            addCriterion("chc_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIsNotNull() {
            addCriterion("chc_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andChcCustNameEqualTo(String value) {
            addCriterion("chc_cust_name =", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotEqualTo(String value) {
            addCriterion("chc_cust_name <>", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameGreaterThan(String value) {
            addCriterion("chc_cust_name >", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("chc_cust_name >=", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLessThan(String value) {
            addCriterion("chc_cust_name <", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLessThanOrEqualTo(String value) {
            addCriterion("chc_cust_name <=", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLike(String value) {
            addCriterion("chc_cust_name like", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotLike(String value) {
            addCriterion("chc_cust_name not like", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIn(List<String> values) {
            addCriterion("chc_cust_name in", values, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotIn(List<String> values) {
            addCriterion("chc_cust_name not in", values, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameBetween(String value1, String value2) {
            addCriterion("chc_cust_name between", value1, value2, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotBetween(String value1, String value2) {
            addCriterion("chc_cust_name not between", value1, value2, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcTitleIsNull() {
            addCriterion("chc_title is null");
            return (Criteria) this;
        }

        public Criteria andChcTitleIsNotNull() {
            addCriterion("chc_title is not null");
            return (Criteria) this;
        }

        public Criteria andChcTitleEqualTo(String value) {
            addCriterion("chc_title =", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotEqualTo(String value) {
            addCriterion("chc_title <>", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleGreaterThan(String value) {
            addCriterion("chc_title >", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("chc_title >=", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLessThan(String value) {
            addCriterion("chc_title <", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLessThanOrEqualTo(String value) {
            addCriterion("chc_title <=", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLike(String value) {
            addCriterion("chc_title like", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotLike(String value) {
            addCriterion("chc_title not like", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleIn(List<String> values) {
            addCriterion("chc_title in", values, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotIn(List<String> values) {
            addCriterion("chc_title not in", values, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleBetween(String value1, String value2) {
            addCriterion("chc_title between", value1, value2, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotBetween(String value1, String value2) {
            addCriterion("chc_title not between", value1, value2, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcRateIsNull() {
            addCriterion("chc_rate is null");
            return (Criteria) this;
        }

        public Criteria andChcRateIsNotNull() {
            addCriterion("chc_rate is not null");
            return (Criteria) this;
        }

        public Criteria andChcRateEqualTo(Integer value) {
            addCriterion("chc_rate =", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotEqualTo(Integer value) {
            addCriterion("chc_rate <>", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateGreaterThan(Integer value) {
            addCriterion("chc_rate >", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chc_rate >=", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateLessThan(Integer value) {
            addCriterion("chc_rate <", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateLessThanOrEqualTo(Integer value) {
            addCriterion("chc_rate <=", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateIn(List<Integer> values) {
            addCriterion("chc_rate in", values, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotIn(List<Integer> values) {
            addCriterion("chc_rate not in", values, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateBetween(Integer value1, Integer value2) {
            addCriterion("chc_rate between", value1, value2, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotBetween(Integer value1, Integer value2) {
            addCriterion("chc_rate not between", value1, value2, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIsNull() {
            addCriterion("chc_linkman is null");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIsNotNull() {
            addCriterion("chc_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanEqualTo(String value) {
            addCriterion("chc_linkman =", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotEqualTo(String value) {
            addCriterion("chc_linkman <>", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanGreaterThan(String value) {
            addCriterion("chc_linkman >", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("chc_linkman >=", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLessThan(String value) {
            addCriterion("chc_linkman <", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLessThanOrEqualTo(String value) {
            addCriterion("chc_linkman <=", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLike(String value) {
            addCriterion("chc_linkman like", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotLike(String value) {
            addCriterion("chc_linkman not like", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIn(List<String> values) {
            addCriterion("chc_linkman in", values, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotIn(List<String> values) {
            addCriterion("chc_linkman not in", values, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanBetween(String value1, String value2) {
            addCriterion("chc_linkman between", value1, value2, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotBetween(String value1, String value2) {
            addCriterion("chc_linkman not between", value1, value2, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcTelIsNull() {
            addCriterion("chc_tel is null");
            return (Criteria) this;
        }

        public Criteria andChcTelIsNotNull() {
            addCriterion("chc_tel is not null");
            return (Criteria) this;
        }

        public Criteria andChcTelEqualTo(String value) {
            addCriterion("chc_tel =", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotEqualTo(String value) {
            addCriterion("chc_tel <>", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelGreaterThan(String value) {
            addCriterion("chc_tel >", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelGreaterThanOrEqualTo(String value) {
            addCriterion("chc_tel >=", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLessThan(String value) {
            addCriterion("chc_tel <", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLessThanOrEqualTo(String value) {
            addCriterion("chc_tel <=", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLike(String value) {
            addCriterion("chc_tel like", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotLike(String value) {
            addCriterion("chc_tel not like", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelIn(List<String> values) {
            addCriterion("chc_tel in", values, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotIn(List<String> values) {
            addCriterion("chc_tel not in", values, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelBetween(String value1, String value2) {
            addCriterion("chc_tel between", value1, value2, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotBetween(String value1, String value2) {
            addCriterion("chc_tel not between", value1, value2, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcDescIsNull() {
            addCriterion("chc_desc is null");
            return (Criteria) this;
        }

        public Criteria andChcDescIsNotNull() {
            addCriterion("chc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andChcDescEqualTo(String value) {
            addCriterion("chc_desc =", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotEqualTo(String value) {
            addCriterion("chc_desc <>", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescGreaterThan(String value) {
            addCriterion("chc_desc >", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescGreaterThanOrEqualTo(String value) {
            addCriterion("chc_desc >=", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLessThan(String value) {
            addCriterion("chc_desc <", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLessThanOrEqualTo(String value) {
            addCriterion("chc_desc <=", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLike(String value) {
            addCriterion("chc_desc like", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotLike(String value) {
            addCriterion("chc_desc not like", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescIn(List<String> values) {
            addCriterion("chc_desc in", values, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotIn(List<String> values) {
            addCriterion("chc_desc not in", values, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescBetween(String value1, String value2) {
            addCriterion("chc_desc between", value1, value2, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotBetween(String value1, String value2) {
            addCriterion("chc_desc not between", value1, value2, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdIsNull() {
            addCriterion("chc_create_id is null");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdIsNotNull() {
            addCriterion("chc_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdEqualTo(Long value) {
            addCriterion("chc_create_id =", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdNotEqualTo(Long value) {
            addCriterion("chc_create_id <>", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdGreaterThan(Long value) {
            addCriterion("chc_create_id >", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chc_create_id >=", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdLessThan(Long value) {
            addCriterion("chc_create_id <", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("chc_create_id <=", value, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdIn(List<Long> values) {
            addCriterion("chc_create_id in", values, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdNotIn(List<Long> values) {
            addCriterion("chc_create_id not in", values, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdBetween(Long value1, Long value2) {
            addCriterion("chc_create_id between", value1, value2, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("chc_create_id not between", value1, value2, "chcCreateId");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIsNull() {
            addCriterion("chc_create_by is null");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIsNotNull() {
            addCriterion("chc_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andChcCreateByEqualTo(String value) {
            addCriterion("chc_create_by =", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotEqualTo(String value) {
            addCriterion("chc_create_by <>", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByGreaterThan(String value) {
            addCriterion("chc_create_by >", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("chc_create_by >=", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLessThan(String value) {
            addCriterion("chc_create_by <", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLessThanOrEqualTo(String value) {
            addCriterion("chc_create_by <=", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLike(String value) {
            addCriterion("chc_create_by like", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotLike(String value) {
            addCriterion("chc_create_by not like", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIn(List<String> values) {
            addCriterion("chc_create_by in", values, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotIn(List<String> values) {
            addCriterion("chc_create_by not in", values, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByBetween(String value1, String value2) {
            addCriterion("chc_create_by between", value1, value2, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotBetween(String value1, String value2) {
            addCriterion("chc_create_by not between", value1, value2, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateIsNull() {
            addCriterion("chc_create_date is null");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateIsNotNull() {
            addCriterion("chc_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateEqualTo(Date value) {
            addCriterion("chc_create_date =", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateNotEqualTo(Date value) {
            addCriterion("chc_create_date <>", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateGreaterThan(Date value) {
            addCriterion("chc_create_date >", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("chc_create_date >=", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateLessThan(Date value) {
            addCriterion("chc_create_date <", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("chc_create_date <=", value, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateIn(List<Date> values) {
            addCriterion("chc_create_date in", values, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateNotIn(List<Date> values) {
            addCriterion("chc_create_date not in", values, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateBetween(Date value1, Date value2) {
            addCriterion("chc_create_date between", value1, value2, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("chc_create_date not between", value1, value2, "chcCreateDate");
            return (Criteria) this;
        }

        public Criteria andChcDueIdIsNull() {
            addCriterion("chc_due_id is null");
            return (Criteria) this;
        }

        public Criteria andChcDueIdIsNotNull() {
            addCriterion("chc_due_id is not null");
            return (Criteria) this;
        }

        public Criteria andChcDueIdEqualTo(Long value) {
            addCriterion("chc_due_id =", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdNotEqualTo(Long value) {
            addCriterion("chc_due_id <>", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdGreaterThan(Long value) {
            addCriterion("chc_due_id >", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chc_due_id >=", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdLessThan(Long value) {
            addCriterion("chc_due_id <", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdLessThanOrEqualTo(Long value) {
            addCriterion("chc_due_id <=", value, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdIn(List<Long> values) {
            addCriterion("chc_due_id in", values, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdNotIn(List<Long> values) {
            addCriterion("chc_due_id not in", values, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdBetween(Long value1, Long value2) {
            addCriterion("chc_due_id between", value1, value2, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueIdNotBetween(Long value1, Long value2) {
            addCriterion("chc_due_id not between", value1, value2, "chcDueId");
            return (Criteria) this;
        }

        public Criteria andChcDueToIsNull() {
            addCriterion("chc_due_to is null");
            return (Criteria) this;
        }

        public Criteria andChcDueToIsNotNull() {
            addCriterion("chc_due_to is not null");
            return (Criteria) this;
        }

        public Criteria andChcDueToEqualTo(String value) {
            addCriterion("chc_due_to =", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotEqualTo(String value) {
            addCriterion("chc_due_to <>", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToGreaterThan(String value) {
            addCriterion("chc_due_to >", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToGreaterThanOrEqualTo(String value) {
            addCriterion("chc_due_to >=", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLessThan(String value) {
            addCriterion("chc_due_to <", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLessThanOrEqualTo(String value) {
            addCriterion("chc_due_to <=", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLike(String value) {
            addCriterion("chc_due_to like", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotLike(String value) {
            addCriterion("chc_due_to not like", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToIn(List<String> values) {
            addCriterion("chc_due_to in", values, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotIn(List<String> values) {
            addCriterion("chc_due_to not in", values, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToBetween(String value1, String value2) {
            addCriterion("chc_due_to between", value1, value2, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotBetween(String value1, String value2) {
            addCriterion("chc_due_to not between", value1, value2, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueDateIsNull() {
            addCriterion("chc_due_date is null");
            return (Criteria) this;
        }

        public Criteria andChcDueDateIsNotNull() {
            addCriterion("chc_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andChcDueDateEqualTo(Date value) {
            addCriterion("chc_due_date =", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateNotEqualTo(Date value) {
            addCriterion("chc_due_date <>", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateGreaterThan(Date value) {
            addCriterion("chc_due_date >", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("chc_due_date >=", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateLessThan(Date value) {
            addCriterion("chc_due_date <", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateLessThanOrEqualTo(Date value) {
            addCriterion("chc_due_date <=", value, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateIn(List<Date> values) {
            addCriterion("chc_due_date in", values, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateNotIn(List<Date> values) {
            addCriterion("chc_due_date not in", values, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateBetween(Date value1, Date value2) {
            addCriterion("chc_due_date between", value1, value2, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcDueDateNotBetween(Date value1, Date value2) {
            addCriterion("chc_due_date not between", value1, value2, "chcDueDate");
            return (Criteria) this;
        }

        public Criteria andChcStatusIsNull() {
            addCriterion("chc_status is null");
            return (Criteria) this;
        }

        public Criteria andChcStatusIsNotNull() {
            addCriterion("chc_status is not null");
            return (Criteria) this;
        }

        public Criteria andChcStatusEqualTo(String value) {
            addCriterion("chc_status =", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotEqualTo(String value) {
            addCriterion("chc_status <>", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThan(String value) {
            addCriterion("chc_status >", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThanOrEqualTo(String value) {
            addCriterion("chc_status >=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThan(String value) {
            addCriterion("chc_status <", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThanOrEqualTo(String value) {
            addCriterion("chc_status <=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLike(String value) {
            addCriterion("chc_status like", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotLike(String value) {
            addCriterion("chc_status not like", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusIn(List<String> values) {
            addCriterion("chc_status in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotIn(List<String> values) {
            addCriterion("chc_status not in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusBetween(String value1, String value2) {
            addCriterion("chc_status between", value1, value2, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotBetween(String value1, String value2) {
            addCriterion("chc_status not between", value1, value2, "chcStatus");
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
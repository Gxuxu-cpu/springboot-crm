package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class CstCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CstCustomerExample() {
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

        public Criteria andCustNoIsNull() {
            addCriterion("cust_no is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("cust_no =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("cust_no <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("cust_no >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_no >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("cust_no <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("cust_no <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("cust_no like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("cust_no not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("cust_no in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("cust_no not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("cust_no between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("cust_no not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNull() {
            addCriterion("cust_region is null");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNotNull() {
            addCriterion("cust_region is not null");
            return (Criteria) this;
        }

        public Criteria andCustRegionEqualTo(String value) {
            addCriterion("cust_region =", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotEqualTo(String value) {
            addCriterion("cust_region <>", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThan(String value) {
            addCriterion("cust_region >", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThanOrEqualTo(String value) {
            addCriterion("cust_region >=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThan(String value) {
            addCriterion("cust_region <", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThanOrEqualTo(String value) {
            addCriterion("cust_region <=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLike(String value) {
            addCriterion("cust_region like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotLike(String value) {
            addCriterion("cust_region not like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionIn(List<String> values) {
            addCriterion("cust_region in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotIn(List<String> values) {
            addCriterion("cust_region not in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionBetween(String value1, String value2) {
            addCriterion("cust_region between", value1, value2, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotBetween(String value1, String value2) {
            addCriterion("cust_region not between", value1, value2, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNull() {
            addCriterion("cust_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNotNull() {
            addCriterion("cust_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdEqualTo(Long value) {
            addCriterion("cust_manager_id =", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotEqualTo(Long value) {
            addCriterion("cust_manager_id <>", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThan(Long value) {
            addCriterion("cust_manager_id >", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_manager_id >=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThan(Long value) {
            addCriterion("cust_manager_id <", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("cust_manager_id <=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIn(List<Long> values) {
            addCriterion("cust_manager_id in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotIn(List<Long> values) {
            addCriterion("cust_manager_id not in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdBetween(Long value1, Long value2) {
            addCriterion("cust_manager_id between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("cust_manager_id not between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNull() {
            addCriterion("cust_manager_name is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNotNull() {
            addCriterion("cust_manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameEqualTo(String value) {
            addCriterion("cust_manager_name =", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotEqualTo(String value) {
            addCriterion("cust_manager_name <>", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThan(String value) {
            addCriterion("cust_manager_name >", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_manager_name >=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThan(String value) {
            addCriterion("cust_manager_name <", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThanOrEqualTo(String value) {
            addCriterion("cust_manager_name <=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLike(String value) {
            addCriterion("cust_manager_name like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotLike(String value) {
            addCriterion("cust_manager_name not like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIn(List<String> values) {
            addCriterion("cust_manager_name in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotIn(List<String> values) {
            addCriterion("cust_manager_name not in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameBetween(String value1, String value2) {
            addCriterion("cust_manager_name between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotBetween(String value1, String value2) {
            addCriterion("cust_manager_name not between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("cust_level is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("cust_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(Integer value) {
            addCriterion("cust_level =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(Integer value) {
            addCriterion("cust_level <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(Integer value) {
            addCriterion("cust_level >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_level >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(Integer value) {
            addCriterion("cust_level <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cust_level <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<Integer> values) {
            addCriterion("cust_level in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<Integer> values) {
            addCriterion("cust_level not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(Integer value1, Integer value2) {
            addCriterion("cust_level between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_level not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIsNull() {
            addCriterion("cust_level_label is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIsNotNull() {
            addCriterion("cust_level_label is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelEqualTo(String value) {
            addCriterion("cust_level_label =", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotEqualTo(String value) {
            addCriterion("cust_level_label <>", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelGreaterThan(String value) {
            addCriterion("cust_level_label >", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_level_label >=", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLessThan(String value) {
            addCriterion("cust_level_label <", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLessThanOrEqualTo(String value) {
            addCriterion("cust_level_label <=", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLike(String value) {
            addCriterion("cust_level_label like", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotLike(String value) {
            addCriterion("cust_level_label not like", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIn(List<String> values) {
            addCriterion("cust_level_label in", values, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotIn(List<String> values) {
            addCriterion("cust_level_label not in", values, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelBetween(String value1, String value2) {
            addCriterion("cust_level_label between", value1, value2, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotBetween(String value1, String value2) {
            addCriterion("cust_level_label not between", value1, value2, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNull() {
            addCriterion("cust_satisfy is null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNotNull() {
            addCriterion("cust_satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyEqualTo(Integer value) {
            addCriterion("cust_satisfy =", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotEqualTo(Integer value) {
            addCriterion("cust_satisfy <>", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThan(Integer value) {
            addCriterion("cust_satisfy >", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_satisfy >=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThan(Integer value) {
            addCriterion("cust_satisfy <", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThanOrEqualTo(Integer value) {
            addCriterion("cust_satisfy <=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIn(List<Integer> values) {
            addCriterion("cust_satisfy in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotIn(List<Integer> values) {
            addCriterion("cust_satisfy not in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyBetween(Integer value1, Integer value2) {
            addCriterion("cust_satisfy between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_satisfy not between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNull() {
            addCriterion("cust_credit is null");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNotNull() {
            addCriterion("cust_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreditEqualTo(Integer value) {
            addCriterion("cust_credit =", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotEqualTo(Integer value) {
            addCriterion("cust_credit <>", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThan(Integer value) {
            addCriterion("cust_credit >", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_credit >=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThan(Integer value) {
            addCriterion("cust_credit <", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThanOrEqualTo(Integer value) {
            addCriterion("cust_credit <=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditIn(List<Integer> values) {
            addCriterion("cust_credit in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotIn(List<Integer> values) {
            addCriterion("cust_credit not in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditBetween(Integer value1, Integer value2) {
            addCriterion("cust_credit between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_credit not between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNull() {
            addCriterion("cust_addr is null");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNotNull() {
            addCriterion("cust_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddrEqualTo(String value) {
            addCriterion("cust_addr =", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotEqualTo(String value) {
            addCriterion("cust_addr <>", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThan(String value) {
            addCriterion("cust_addr >", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("cust_addr >=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThan(String value) {
            addCriterion("cust_addr <", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThanOrEqualTo(String value) {
            addCriterion("cust_addr <=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLike(String value) {
            addCriterion("cust_addr like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotLike(String value) {
            addCriterion("cust_addr not like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrIn(List<String> values) {
            addCriterion("cust_addr in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotIn(List<String> values) {
            addCriterion("cust_addr not in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrBetween(String value1, String value2) {
            addCriterion("cust_addr between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotBetween(String value1, String value2) {
            addCriterion("cust_addr not between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNull() {
            addCriterion("cust_zip is null");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNotNull() {
            addCriterion("cust_zip is not null");
            return (Criteria) this;
        }

        public Criteria andCustZipEqualTo(String value) {
            addCriterion("cust_zip =", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotEqualTo(String value) {
            addCriterion("cust_zip <>", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThan(String value) {
            addCriterion("cust_zip >", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThanOrEqualTo(String value) {
            addCriterion("cust_zip >=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThan(String value) {
            addCriterion("cust_zip <", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThanOrEqualTo(String value) {
            addCriterion("cust_zip <=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLike(String value) {
            addCriterion("cust_zip like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotLike(String value) {
            addCriterion("cust_zip not like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipIn(List<String> values) {
            addCriterion("cust_zip in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotIn(List<String> values) {
            addCriterion("cust_zip not in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipBetween(String value1, String value2) {
            addCriterion("cust_zip between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotBetween(String value1, String value2) {
            addCriterion("cust_zip not between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("cust_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("cust_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("cust_tel =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("cust_tel <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("cust_tel >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_tel >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("cust_tel <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("cust_tel <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("cust_tel like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("cust_tel not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("cust_tel in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("cust_tel not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("cust_tel between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("cust_tel not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNull() {
            addCriterion("cust_fax is null");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNotNull() {
            addCriterion("cust_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCustFaxEqualTo(String value) {
            addCriterion("cust_fax =", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotEqualTo(String value) {
            addCriterion("cust_fax <>", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThan(String value) {
            addCriterion("cust_fax >", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThanOrEqualTo(String value) {
            addCriterion("cust_fax >=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThan(String value) {
            addCriterion("cust_fax <", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThanOrEqualTo(String value) {
            addCriterion("cust_fax <=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLike(String value) {
            addCriterion("cust_fax like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotLike(String value) {
            addCriterion("cust_fax not like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxIn(List<String> values) {
            addCriterion("cust_fax in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotIn(List<String> values) {
            addCriterion("cust_fax not in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxBetween(String value1, String value2) {
            addCriterion("cust_fax between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotBetween(String value1, String value2) {
            addCriterion("cust_fax not between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNull() {
            addCriterion("cust_website is null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNotNull() {
            addCriterion("cust_website is not null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteEqualTo(String value) {
            addCriterion("cust_website =", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotEqualTo(String value) {
            addCriterion("cust_website <>", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThan(String value) {
            addCriterion("cust_website >", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("cust_website >=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThan(String value) {
            addCriterion("cust_website <", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThanOrEqualTo(String value) {
            addCriterion("cust_website <=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLike(String value) {
            addCriterion("cust_website like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotLike(String value) {
            addCriterion("cust_website not like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIn(List<String> values) {
            addCriterion("cust_website in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotIn(List<String> values) {
            addCriterion("cust_website not in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteBetween(String value1, String value2) {
            addCriterion("cust_website between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotBetween(String value1, String value2) {
            addCriterion("cust_website not between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIsNull() {
            addCriterion("cust_licence_no is null");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIsNotNull() {
            addCriterion("cust_licence_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoEqualTo(String value) {
            addCriterion("cust_licence_no =", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotEqualTo(String value) {
            addCriterion("cust_licence_no <>", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoGreaterThan(String value) {
            addCriterion("cust_licence_no >", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_licence_no >=", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLessThan(String value) {
            addCriterion("cust_licence_no <", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLessThanOrEqualTo(String value) {
            addCriterion("cust_licence_no <=", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLike(String value) {
            addCriterion("cust_licence_no like", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotLike(String value) {
            addCriterion("cust_licence_no not like", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIn(List<String> values) {
            addCriterion("cust_licence_no in", values, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotIn(List<String> values) {
            addCriterion("cust_licence_no not in", values, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoBetween(String value1, String value2) {
            addCriterion("cust_licence_no between", value1, value2, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotBetween(String value1, String value2) {
            addCriterion("cust_licence_no not between", value1, value2, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIsNull() {
            addCriterion("cust_chieftain is null");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIsNotNull() {
            addCriterion("cust_chieftain is not null");
            return (Criteria) this;
        }

        public Criteria andCustChieftainEqualTo(String value) {
            addCriterion("cust_chieftain =", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotEqualTo(String value) {
            addCriterion("cust_chieftain <>", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainGreaterThan(String value) {
            addCriterion("cust_chieftain >", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainGreaterThanOrEqualTo(String value) {
            addCriterion("cust_chieftain >=", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLessThan(String value) {
            addCriterion("cust_chieftain <", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLessThanOrEqualTo(String value) {
            addCriterion("cust_chieftain <=", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLike(String value) {
            addCriterion("cust_chieftain like", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotLike(String value) {
            addCriterion("cust_chieftain not like", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIn(List<String> values) {
            addCriterion("cust_chieftain in", values, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotIn(List<String> values) {
            addCriterion("cust_chieftain not in", values, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainBetween(String value1, String value2) {
            addCriterion("cust_chieftain between", value1, value2, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotBetween(String value1, String value2) {
            addCriterion("cust_chieftain not between", value1, value2, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIsNull() {
            addCriterion("cust_bankroll is null");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIsNotNull() {
            addCriterion("cust_bankroll is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankrollEqualTo(Long value) {
            addCriterion("cust_bankroll =", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotEqualTo(Long value) {
            addCriterion("cust_bankroll <>", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollGreaterThan(Long value) {
            addCriterion("cust_bankroll >", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_bankroll >=", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollLessThan(Long value) {
            addCriterion("cust_bankroll <", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollLessThanOrEqualTo(Long value) {
            addCriterion("cust_bankroll <=", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIn(List<Long> values) {
            addCriterion("cust_bankroll in", values, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotIn(List<Long> values) {
            addCriterion("cust_bankroll not in", values, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollBetween(Long value1, Long value2) {
            addCriterion("cust_bankroll between", value1, value2, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotBetween(Long value1, Long value2) {
            addCriterion("cust_bankroll not between", value1, value2, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIsNull() {
            addCriterion("cust_turnover is null");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIsNotNull() {
            addCriterion("cust_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverEqualTo(Long value) {
            addCriterion("cust_turnover =", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotEqualTo(Long value) {
            addCriterion("cust_turnover <>", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverGreaterThan(Long value) {
            addCriterion("cust_turnover >", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_turnover >=", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverLessThan(Long value) {
            addCriterion("cust_turnover <", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverLessThanOrEqualTo(Long value) {
            addCriterion("cust_turnover <=", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIn(List<Long> values) {
            addCriterion("cust_turnover in", values, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotIn(List<Long> values) {
            addCriterion("cust_turnover not in", values, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverBetween(Long value1, Long value2) {
            addCriterion("cust_turnover between", value1, value2, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotBetween(Long value1, Long value2) {
            addCriterion("cust_turnover not between", value1, value2, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustBankIsNull() {
            addCriterion("cust_bank is null");
            return (Criteria) this;
        }

        public Criteria andCustBankIsNotNull() {
            addCriterion("cust_bank is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankEqualTo(String value) {
            addCriterion("cust_bank =", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotEqualTo(String value) {
            addCriterion("cust_bank <>", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankGreaterThan(String value) {
            addCriterion("cust_bank >", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankGreaterThanOrEqualTo(String value) {
            addCriterion("cust_bank >=", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLessThan(String value) {
            addCriterion("cust_bank <", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLessThanOrEqualTo(String value) {
            addCriterion("cust_bank <=", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLike(String value) {
            addCriterion("cust_bank like", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotLike(String value) {
            addCriterion("cust_bank not like", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankIn(List<String> values) {
            addCriterion("cust_bank in", values, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotIn(List<String> values) {
            addCriterion("cust_bank not in", values, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankBetween(String value1, String value2) {
            addCriterion("cust_bank between", value1, value2, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotBetween(String value1, String value2) {
            addCriterion("cust_bank not between", value1, value2, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIsNull() {
            addCriterion("cust_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIsNotNull() {
            addCriterion("cust_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountEqualTo(String value) {
            addCriterion("cust_bank_account =", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotEqualTo(String value) {
            addCriterion("cust_bank_account <>", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountGreaterThan(String value) {
            addCriterion("cust_bank_account >", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("cust_bank_account >=", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLessThan(String value) {
            addCriterion("cust_bank_account <", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLessThanOrEqualTo(String value) {
            addCriterion("cust_bank_account <=", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLike(String value) {
            addCriterion("cust_bank_account like", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotLike(String value) {
            addCriterion("cust_bank_account not like", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIn(List<String> values) {
            addCriterion("cust_bank_account in", values, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotIn(List<String> values) {
            addCriterion("cust_bank_account not in", values, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountBetween(String value1, String value2) {
            addCriterion("cust_bank_account between", value1, value2, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotBetween(String value1, String value2) {
            addCriterion("cust_bank_account not between", value1, value2, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIsNull() {
            addCriterion("cust_local_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIsNotNull() {
            addCriterion("cust_local_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoEqualTo(String value) {
            addCriterion("cust_local_tax_no =", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotEqualTo(String value) {
            addCriterion("cust_local_tax_no <>", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoGreaterThan(String value) {
            addCriterion("cust_local_tax_no >", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_local_tax_no >=", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLessThan(String value) {
            addCriterion("cust_local_tax_no <", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("cust_local_tax_no <=", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLike(String value) {
            addCriterion("cust_local_tax_no like", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotLike(String value) {
            addCriterion("cust_local_tax_no not like", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIn(List<String> values) {
            addCriterion("cust_local_tax_no in", values, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotIn(List<String> values) {
            addCriterion("cust_local_tax_no not in", values, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoBetween(String value1, String value2) {
            addCriterion("cust_local_tax_no between", value1, value2, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotBetween(String value1, String value2) {
            addCriterion("cust_local_tax_no not between", value1, value2, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIsNull() {
            addCriterion("cust_national_tax_no is null");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIsNotNull() {
            addCriterion("cust_national_tax_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoEqualTo(String value) {
            addCriterion("cust_national_tax_no =", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotEqualTo(String value) {
            addCriterion("cust_national_tax_no <>", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoGreaterThan(String value) {
            addCriterion("cust_national_tax_no >", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_national_tax_no >=", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLessThan(String value) {
            addCriterion("cust_national_tax_no <", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("cust_national_tax_no <=", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLike(String value) {
            addCriterion("cust_national_tax_no like", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotLike(String value) {
            addCriterion("cust_national_tax_no not like", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIn(List<String> values) {
            addCriterion("cust_national_tax_no in", values, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotIn(List<String> values) {
            addCriterion("cust_national_tax_no not in", values, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoBetween(String value1, String value2) {
            addCriterion("cust_national_tax_no between", value1, value2, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotBetween(String value1, String value2) {
            addCriterion("cust_national_tax_no not between", value1, value2, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNull() {
            addCriterion("cust_status is null");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNotNull() {
            addCriterion("cust_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustStatusEqualTo(String value) {
            addCriterion("cust_status =", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotEqualTo(String value) {
            addCriterion("cust_status <>", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThan(String value) {
            addCriterion("cust_status >", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cust_status >=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThan(String value) {
            addCriterion("cust_status <", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThanOrEqualTo(String value) {
            addCriterion("cust_status <=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLike(String value) {
            addCriterion("cust_status like", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotLike(String value) {
            addCriterion("cust_status not like", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusIn(List<String> values) {
            addCriterion("cust_status in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotIn(List<String> values) {
            addCriterion("cust_status not in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusBetween(String value1, String value2) {
            addCriterion("cust_status between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotBetween(String value1, String value2) {
            addCriterion("cust_status not between", value1, value2, "custStatus");
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
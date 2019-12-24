package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class StorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StorageExample() {
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

        public Criteria andStkIdIsNull() {
            addCriterion("stk_id is null");
            return (Criteria) this;
        }

        public Criteria andStkIdIsNotNull() {
            addCriterion("stk_id is not null");
            return (Criteria) this;
        }

        public Criteria andStkIdEqualTo(Long value) {
            addCriterion("stk_id =", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotEqualTo(Long value) {
            addCriterion("stk_id <>", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdGreaterThan(Long value) {
            addCriterion("stk_id >", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stk_id >=", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdLessThan(Long value) {
            addCriterion("stk_id <", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdLessThanOrEqualTo(Long value) {
            addCriterion("stk_id <=", value, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdIn(List<Long> values) {
            addCriterion("stk_id in", values, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotIn(List<Long> values) {
            addCriterion("stk_id not in", values, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdBetween(Long value1, Long value2) {
            addCriterion("stk_id between", value1, value2, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkIdNotBetween(Long value1, Long value2) {
            addCriterion("stk_id not between", value1, value2, "stkId");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIsNull() {
            addCriterion("stk_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIsNotNull() {
            addCriterion("stk_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseEqualTo(String value) {
            addCriterion("stk_warehouse =", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotEqualTo(String value) {
            addCriterion("stk_warehouse <>", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseGreaterThan(String value) {
            addCriterion("stk_warehouse >", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("stk_warehouse >=", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLessThan(String value) {
            addCriterion("stk_warehouse <", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLessThanOrEqualTo(String value) {
            addCriterion("stk_warehouse <=", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseLike(String value) {
            addCriterion("stk_warehouse like", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotLike(String value) {
            addCriterion("stk_warehouse not like", value, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseIn(List<String> values) {
            addCriterion("stk_warehouse in", values, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotIn(List<String> values) {
            addCriterion("stk_warehouse not in", values, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseBetween(String value1, String value2) {
            addCriterion("stk_warehouse between", value1, value2, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWarehouseNotBetween(String value1, String value2) {
            addCriterion("stk_warehouse not between", value1, value2, "stkWarehouse");
            return (Criteria) this;
        }

        public Criteria andStkWareIsNull() {
            addCriterion("stk_ware is null");
            return (Criteria) this;
        }

        public Criteria andStkWareIsNotNull() {
            addCriterion("stk_ware is not null");
            return (Criteria) this;
        }

        public Criteria andStkWareEqualTo(String value) {
            addCriterion("stk_ware =", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotEqualTo(String value) {
            addCriterion("stk_ware <>", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareGreaterThan(String value) {
            addCriterion("stk_ware >", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareGreaterThanOrEqualTo(String value) {
            addCriterion("stk_ware >=", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLessThan(String value) {
            addCriterion("stk_ware <", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLessThanOrEqualTo(String value) {
            addCriterion("stk_ware <=", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareLike(String value) {
            addCriterion("stk_ware like", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotLike(String value) {
            addCriterion("stk_ware not like", value, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareIn(List<String> values) {
            addCriterion("stk_ware in", values, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotIn(List<String> values) {
            addCriterion("stk_ware not in", values, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareBetween(String value1, String value2) {
            addCriterion("stk_ware between", value1, value2, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkWareNotBetween(String value1, String value2) {
            addCriterion("stk_ware not between", value1, value2, "stkWare");
            return (Criteria) this;
        }

        public Criteria andStkCountIsNull() {
            addCriterion("stk_count is null");
            return (Criteria) this;
        }

        public Criteria andStkCountIsNotNull() {
            addCriterion("stk_count is not null");
            return (Criteria) this;
        }

        public Criteria andStkCountEqualTo(Integer value) {
            addCriterion("stk_count =", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotEqualTo(Integer value) {
            addCriterion("stk_count <>", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountGreaterThan(Integer value) {
            addCriterion("stk_count >", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stk_count >=", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountLessThan(Integer value) {
            addCriterion("stk_count <", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountLessThanOrEqualTo(Integer value) {
            addCriterion("stk_count <=", value, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountIn(List<Integer> values) {
            addCriterion("stk_count in", values, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotIn(List<Integer> values) {
            addCriterion("stk_count not in", values, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountBetween(Integer value1, Integer value2) {
            addCriterion("stk_count between", value1, value2, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stk_count not between", value1, value2, "stkCount");
            return (Criteria) this;
        }

        public Criteria andStkMemoIsNull() {
            addCriterion("stk_memo is null");
            return (Criteria) this;
        }

        public Criteria andStkMemoIsNotNull() {
            addCriterion("stk_memo is not null");
            return (Criteria) this;
        }

        public Criteria andStkMemoEqualTo(String value) {
            addCriterion("stk_memo =", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotEqualTo(String value) {
            addCriterion("stk_memo <>", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoGreaterThan(String value) {
            addCriterion("stk_memo >", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoGreaterThanOrEqualTo(String value) {
            addCriterion("stk_memo >=", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLessThan(String value) {
            addCriterion("stk_memo <", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLessThanOrEqualTo(String value) {
            addCriterion("stk_memo <=", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoLike(String value) {
            addCriterion("stk_memo like", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotLike(String value) {
            addCriterion("stk_memo not like", value, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoIn(List<String> values) {
            addCriterion("stk_memo in", values, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotIn(List<String> values) {
            addCriterion("stk_memo not in", values, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoBetween(String value1, String value2) {
            addCriterion("stk_memo between", value1, value2, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkMemoNotBetween(String value1, String value2) {
            addCriterion("stk_memo not between", value1, value2, "stkMemo");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIsNull() {
            addCriterion("stk_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIsNotNull() {
            addCriterion("stk_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andStkProdIdEqualTo(Long value) {
            addCriterion("stk_prod_id =", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotEqualTo(Long value) {
            addCriterion("stk_prod_id <>", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdGreaterThan(Long value) {
            addCriterion("stk_prod_id >", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("stk_prod_id >=", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdLessThan(Long value) {
            addCriterion("stk_prod_id <", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdLessThanOrEqualTo(Long value) {
            addCriterion("stk_prod_id <=", value, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdIn(List<Long> values) {
            addCriterion("stk_prod_id in", values, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotIn(List<Long> values) {
            addCriterion("stk_prod_id not in", values, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdBetween(Long value1, Long value2) {
            addCriterion("stk_prod_id between", value1, value2, "stkProdId");
            return (Criteria) this;
        }

        public Criteria andStkProdIdNotBetween(Long value1, Long value2) {
            addCriterion("stk_prod_id not between", value1, value2, "stkProdId");
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
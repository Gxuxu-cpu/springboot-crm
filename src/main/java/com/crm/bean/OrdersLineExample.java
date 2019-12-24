package com.crm.bean;

import java.util.ArrayList;
import java.util.List;

public class OrdersLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersLineExample() {
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

        public Criteria andOddIdIsNull() {
            addCriterion("odd_id is null");
            return (Criteria) this;
        }

        public Criteria andOddIdIsNotNull() {
            addCriterion("odd_id is not null");
            return (Criteria) this;
        }

        public Criteria andOddIdEqualTo(Long value) {
            addCriterion("odd_id =", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotEqualTo(Long value) {
            addCriterion("odd_id <>", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdGreaterThan(Long value) {
            addCriterion("odd_id >", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdGreaterThanOrEqualTo(Long value) {
            addCriterion("odd_id >=", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdLessThan(Long value) {
            addCriterion("odd_id <", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdLessThanOrEqualTo(Long value) {
            addCriterion("odd_id <=", value, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdIn(List<Long> values) {
            addCriterion("odd_id in", values, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotIn(List<Long> values) {
            addCriterion("odd_id not in", values, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdBetween(Long value1, Long value2) {
            addCriterion("odd_id between", value1, value2, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddIdNotBetween(Long value1, Long value2) {
            addCriterion("odd_id not between", value1, value2, "oddId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIsNull() {
            addCriterion("odd_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIsNotNull() {
            addCriterion("odd_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdEqualTo(Long value) {
            addCriterion("odd_order_id =", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotEqualTo(Long value) {
            addCriterion("odd_order_id <>", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdGreaterThan(Long value) {
            addCriterion("odd_order_id >", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("odd_order_id >=", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdLessThan(Long value) {
            addCriterion("odd_order_id <", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("odd_order_id <=", value, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdIn(List<Long> values) {
            addCriterion("odd_order_id in", values, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotIn(List<Long> values) {
            addCriterion("odd_order_id not in", values, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdBetween(Long value1, Long value2) {
            addCriterion("odd_order_id between", value1, value2, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("odd_order_id not between", value1, value2, "oddOrderId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIsNull() {
            addCriterion("odd_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIsNotNull() {
            addCriterion("odd_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andOddProdIdEqualTo(Long value) {
            addCriterion("odd_prod_id =", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotEqualTo(Long value) {
            addCriterion("odd_prod_id <>", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdGreaterThan(Long value) {
            addCriterion("odd_prod_id >", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("odd_prod_id >=", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdLessThan(Long value) {
            addCriterion("odd_prod_id <", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdLessThanOrEqualTo(Long value) {
            addCriterion("odd_prod_id <=", value, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdIn(List<Long> values) {
            addCriterion("odd_prod_id in", values, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotIn(List<Long> values) {
            addCriterion("odd_prod_id not in", values, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdBetween(Long value1, Long value2) {
            addCriterion("odd_prod_id between", value1, value2, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddProdIdNotBetween(Long value1, Long value2) {
            addCriterion("odd_prod_id not between", value1, value2, "oddProdId");
            return (Criteria) this;
        }

        public Criteria andOddCountIsNull() {
            addCriterion("odd_count is null");
            return (Criteria) this;
        }

        public Criteria andOddCountIsNotNull() {
            addCriterion("odd_count is not null");
            return (Criteria) this;
        }

        public Criteria andOddCountEqualTo(Integer value) {
            addCriterion("odd_count =", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotEqualTo(Integer value) {
            addCriterion("odd_count <>", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountGreaterThan(Integer value) {
            addCriterion("odd_count >", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("odd_count >=", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountLessThan(Integer value) {
            addCriterion("odd_count <", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountLessThanOrEqualTo(Integer value) {
            addCriterion("odd_count <=", value, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountIn(List<Integer> values) {
            addCriterion("odd_count in", values, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotIn(List<Integer> values) {
            addCriterion("odd_count not in", values, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountBetween(Integer value1, Integer value2) {
            addCriterion("odd_count between", value1, value2, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddCountNotBetween(Integer value1, Integer value2) {
            addCriterion("odd_count not between", value1, value2, "oddCount");
            return (Criteria) this;
        }

        public Criteria andOddUnitIsNull() {
            addCriterion("odd_unit is null");
            return (Criteria) this;
        }

        public Criteria andOddUnitIsNotNull() {
            addCriterion("odd_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOddUnitEqualTo(String value) {
            addCriterion("odd_unit =", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitNotEqualTo(String value) {
            addCriterion("odd_unit <>", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitGreaterThan(String value) {
            addCriterion("odd_unit >", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitGreaterThanOrEqualTo(String value) {
            addCriterion("odd_unit >=", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitLessThan(String value) {
            addCriterion("odd_unit <", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitLessThanOrEqualTo(String value) {
            addCriterion("odd_unit <=", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitLike(String value) {
            addCriterion("odd_unit like", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitNotLike(String value) {
            addCriterion("odd_unit not like", value, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitIn(List<String> values) {
            addCriterion("odd_unit in", values, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitNotIn(List<String> values) {
            addCriterion("odd_unit not in", values, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitBetween(String value1, String value2) {
            addCriterion("odd_unit between", value1, value2, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddUnitNotBetween(String value1, String value2) {
            addCriterion("odd_unit not between", value1, value2, "oddUnit");
            return (Criteria) this;
        }

        public Criteria andOddPriceIsNull() {
            addCriterion("odd_price is null");
            return (Criteria) this;
        }

        public Criteria andOddPriceIsNotNull() {
            addCriterion("odd_price is not null");
            return (Criteria) this;
        }

        public Criteria andOddPriceEqualTo(Double value) {
            addCriterion("odd_price =", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceNotEqualTo(Double value) {
            addCriterion("odd_price <>", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceGreaterThan(Double value) {
            addCriterion("odd_price >", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("odd_price >=", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceLessThan(Double value) {
            addCriterion("odd_price <", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceLessThanOrEqualTo(Double value) {
            addCriterion("odd_price <=", value, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceIn(List<Double> values) {
            addCriterion("odd_price in", values, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceNotIn(List<Double> values) {
            addCriterion("odd_price not in", values, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceBetween(Double value1, Double value2) {
            addCriterion("odd_price between", value1, value2, "oddPrice");
            return (Criteria) this;
        }

        public Criteria andOddPriceNotBetween(Double value1, Double value2) {
            addCriterion("odd_price not between", value1, value2, "oddPrice");
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
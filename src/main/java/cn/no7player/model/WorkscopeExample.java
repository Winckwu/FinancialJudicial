package cn.no7player.model;

import java.util.ArrayList;
import java.util.List;

public class WorkscopeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkscopeExample() {
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

        public Criteria andWorkscopeIdIsNull() {
            addCriterion("workscope_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdIsNotNull() {
            addCriterion("workscope_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdEqualTo(Integer value) {
            addCriterion("workscope_id =", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdNotEqualTo(Integer value) {
            addCriterion("workscope_id <>", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdGreaterThan(Integer value) {
            addCriterion("workscope_id >", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workscope_id >=", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdLessThan(Integer value) {
            addCriterion("workscope_id <", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdLessThanOrEqualTo(Integer value) {
            addCriterion("workscope_id <=", value, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdIn(List<Integer> values) {
            addCriterion("workscope_id in", values, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdNotIn(List<Integer> values) {
            addCriterion("workscope_id not in", values, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdBetween(Integer value1, Integer value2) {
            addCriterion("workscope_id between", value1, value2, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workscope_id not between", value1, value2, "workscopeId");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddIsNull() {
            addCriterion("workscope_add is null");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddIsNotNull() {
            addCriterion("workscope_add is not null");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddEqualTo(String value) {
            addCriterion("workscope_add =", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddNotEqualTo(String value) {
            addCriterion("workscope_add <>", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddGreaterThan(String value) {
            addCriterion("workscope_add >", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddGreaterThanOrEqualTo(String value) {
            addCriterion("workscope_add >=", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddLessThan(String value) {
            addCriterion("workscope_add <", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddLessThanOrEqualTo(String value) {
            addCriterion("workscope_add <=", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddLike(String value) {
            addCriterion("workscope_add like", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddNotLike(String value) {
            addCriterion("workscope_add not like", value, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddIn(List<String> values) {
            addCriterion("workscope_add in", values, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddNotIn(List<String> values) {
            addCriterion("workscope_add not in", values, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddBetween(String value1, String value2) {
            addCriterion("workscope_add between", value1, value2, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andWorkscopeAddNotBetween(String value1, String value2) {
            addCriterion("workscope_add not between", value1, value2, "workscopeAdd");
            return (Criteria) this;
        }

        public Criteria andLawyerIdIsNull() {
            addCriterion("lawyer_id is null");
            return (Criteria) this;
        }

        public Criteria andLawyerIdIsNotNull() {
            addCriterion("lawyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerIdEqualTo(Integer value) {
            addCriterion("lawyer_id =", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdNotEqualTo(Integer value) {
            addCriterion("lawyer_id <>", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdGreaterThan(Integer value) {
            addCriterion("lawyer_id >", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lawyer_id >=", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdLessThan(Integer value) {
            addCriterion("lawyer_id <", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdLessThanOrEqualTo(Integer value) {
            addCriterion("lawyer_id <=", value, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdIn(List<Integer> values) {
            addCriterion("lawyer_id in", values, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdNotIn(List<Integer> values) {
            addCriterion("lawyer_id not in", values, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdBetween(Integer value1, Integer value2) {
            addCriterion("lawyer_id between", value1, value2, "lawyerId");
            return (Criteria) this;
        }

        public Criteria andLawyerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lawyer_id not between", value1, value2, "lawyerId");
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
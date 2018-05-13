package cn.no7player.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssignExample() {
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

        public Criteria andAssignIdIsNull() {
            addCriterion("assign_id is null");
            return (Criteria) this;
        }

        public Criteria andAssignIdIsNotNull() {
            addCriterion("assign_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssignIdEqualTo(Integer value) {
            addCriterion("assign_id =", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdNotEqualTo(Integer value) {
            addCriterion("assign_id <>", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdGreaterThan(Integer value) {
            addCriterion("assign_id >", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assign_id >=", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdLessThan(Integer value) {
            addCriterion("assign_id <", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdLessThanOrEqualTo(Integer value) {
            addCriterion("assign_id <=", value, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdIn(List<Integer> values) {
            addCriterion("assign_id in", values, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdNotIn(List<Integer> values) {
            addCriterion("assign_id not in", values, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdBetween(Integer value1, Integer value2) {
            addCriterion("assign_id between", value1, value2, "assignId");
            return (Criteria) this;
        }

        public Criteria andAssignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assign_id not between", value1, value2, "assignId");
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

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeIsNull() {
            addCriterion("depute_time is null");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeIsNotNull() {
            addCriterion("depute_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeEqualTo(Date value) {
            addCriterion("depute_time =", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeNotEqualTo(Date value) {
            addCriterion("depute_time <>", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeGreaterThan(Date value) {
            addCriterion("depute_time >", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("depute_time >=", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeLessThan(Date value) {
            addCriterion("depute_time <", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeLessThanOrEqualTo(Date value) {
            addCriterion("depute_time <=", value, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeIn(List<Date> values) {
            addCriterion("depute_time in", values, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeNotIn(List<Date> values) {
            addCriterion("depute_time not in", values, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeBetween(Date value1, Date value2) {
            addCriterion("depute_time between", value1, value2, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andDeputeTimeNotBetween(Date value1, Date value2) {
            addCriterion("depute_time not between", value1, value2, "deputeTime");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIsNull() {
            addCriterion("is_accept is null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIsNotNull() {
            addCriterion("is_accept is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptEqualTo(Boolean value) {
            addCriterion("is_accept =", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotEqualTo(Boolean value) {
            addCriterion("is_accept <>", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptGreaterThan(Boolean value) {
            addCriterion("is_accept >", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_accept >=", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptLessThan(Boolean value) {
            addCriterion("is_accept <", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptLessThanOrEqualTo(Boolean value) {
            addCriterion("is_accept <=", value, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptIn(List<Boolean> values) {
            addCriterion("is_accept in", values, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotIn(List<Boolean> values) {
            addCriterion("is_accept not in", values, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptBetween(Boolean value1, Boolean value2) {
            addCriterion("is_accept between", value1, value2, "isAccept");
            return (Criteria) this;
        }

        public Criteria andIsAcceptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_accept not between", value1, value2, "isAccept");
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
package cn.no7player.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CasesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CasesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCaseResultIsNull() {
            addCriterion("case_result is null");
            return (Criteria) this;
        }

        public Criteria andCaseResultIsNotNull() {
            addCriterion("case_result is not null");
            return (Criteria) this;
        }

        public Criteria andCaseResultEqualTo(String value) {
            addCriterion("case_result =", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultNotEqualTo(String value) {
            addCriterion("case_result <>", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultGreaterThan(String value) {
            addCriterion("case_result >", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultGreaterThanOrEqualTo(String value) {
            addCriterion("case_result >=", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultLessThan(String value) {
            addCriterion("case_result <", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultLessThanOrEqualTo(String value) {
            addCriterion("case_result <=", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultLike(String value) {
            addCriterion("case_result like", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultNotLike(String value) {
            addCriterion("case_result not like", value, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultIn(List<String> values) {
            addCriterion("case_result in", values, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultNotIn(List<String> values) {
            addCriterion("case_result not in", values, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultBetween(String value1, String value2) {
            addCriterion("case_result between", value1, value2, "caseResult");
            return (Criteria) this;
        }

        public Criteria andCaseResultNotBetween(String value1, String value2) {
            addCriterion("case_result not between", value1, value2, "caseResult");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNull() {
            addCriterion("service_type is null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIsNotNull() {
            addCriterion("service_type is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTypeEqualTo(String value) {
            addCriterion("service_type =", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotEqualTo(String value) {
            addCriterion("service_type <>", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThan(String value) {
            addCriterion("service_type >", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("service_type >=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThan(String value) {
            addCriterion("service_type <", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("service_type <=", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeLike(String value) {
            addCriterion("service_type like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotLike(String value) {
            addCriterion("service_type not like", value, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeIn(List<String> values) {
            addCriterion("service_type in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotIn(List<String> values) {
            addCriterion("service_type not in", values, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeBetween(String value1, String value2) {
            addCriterion("service_type between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andServiceTypeNotBetween(String value1, String value2) {
            addCriterion("service_type not between", value1, value2, "serviceType");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNull() {
            addCriterion("contract_num is null");
            return (Criteria) this;
        }

        public Criteria andContractNumIsNotNull() {
            addCriterion("contract_num is not null");
            return (Criteria) this;
        }

        public Criteria andContractNumEqualTo(String value) {
            addCriterion("contract_num =", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotEqualTo(String value) {
            addCriterion("contract_num <>", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThan(String value) {
            addCriterion("contract_num >", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("contract_num >=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThan(String value) {
            addCriterion("contract_num <", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLessThanOrEqualTo(String value) {
            addCriterion("contract_num <=", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumLike(String value) {
            addCriterion("contract_num like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotLike(String value) {
            addCriterion("contract_num not like", value, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumIn(List<String> values) {
            addCriterion("contract_num in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotIn(List<String> values) {
            addCriterion("contract_num not in", values, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumBetween(String value1, String value2) {
            addCriterion("contract_num between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andContractNumNotBetween(String value1, String value2) {
            addCriterion("contract_num not between", value1, value2, "contractNum");
            return (Criteria) this;
        }

        public Criteria andDebtPlatIsNull() {
            addCriterion("debt_plat is null");
            return (Criteria) this;
        }

        public Criteria andDebtPlatIsNotNull() {
            addCriterion("debt_plat is not null");
            return (Criteria) this;
        }

        public Criteria andDebtPlatEqualTo(String value) {
            addCriterion("debt_plat =", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatNotEqualTo(String value) {
            addCriterion("debt_plat <>", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatGreaterThan(String value) {
            addCriterion("debt_plat >", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatGreaterThanOrEqualTo(String value) {
            addCriterion("debt_plat >=", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatLessThan(String value) {
            addCriterion("debt_plat <", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatLessThanOrEqualTo(String value) {
            addCriterion("debt_plat <=", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatLike(String value) {
            addCriterion("debt_plat like", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatNotLike(String value) {
            addCriterion("debt_plat not like", value, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatIn(List<String> values) {
            addCriterion("debt_plat in", values, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatNotIn(List<String> values) {
            addCriterion("debt_plat not in", values, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatBetween(String value1, String value2) {
            addCriterion("debt_plat between", value1, value2, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andDebtPlatNotBetween(String value1, String value2) {
            addCriterion("debt_plat not between", value1, value2, "debtPlat");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andInverProjIsNull() {
            addCriterion("inver_proj is null");
            return (Criteria) this;
        }

        public Criteria andInverProjIsNotNull() {
            addCriterion("inver_proj is not null");
            return (Criteria) this;
        }

        public Criteria andInverProjEqualTo(String value) {
            addCriterion("inver_proj =", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjNotEqualTo(String value) {
            addCriterion("inver_proj <>", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjGreaterThan(String value) {
            addCriterion("inver_proj >", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjGreaterThanOrEqualTo(String value) {
            addCriterion("inver_proj >=", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjLessThan(String value) {
            addCriterion("inver_proj <", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjLessThanOrEqualTo(String value) {
            addCriterion("inver_proj <=", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjLike(String value) {
            addCriterion("inver_proj like", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjNotLike(String value) {
            addCriterion("inver_proj not like", value, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjIn(List<String> values) {
            addCriterion("inver_proj in", values, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjNotIn(List<String> values) {
            addCriterion("inver_proj not in", values, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjBetween(String value1, String value2) {
            addCriterion("inver_proj between", value1, value2, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverProjNotBetween(String value1, String value2) {
            addCriterion("inver_proj not between", value1, value2, "inverProj");
            return (Criteria) this;
        }

        public Criteria andInverNameIsNull() {
            addCriterion("inver_name is null");
            return (Criteria) this;
        }

        public Criteria andInverNameIsNotNull() {
            addCriterion("inver_name is not null");
            return (Criteria) this;
        }

        public Criteria andInverNameEqualTo(String value) {
            addCriterion("inver_name =", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameNotEqualTo(String value) {
            addCriterion("inver_name <>", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameGreaterThan(String value) {
            addCriterion("inver_name >", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameGreaterThanOrEqualTo(String value) {
            addCriterion("inver_name >=", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameLessThan(String value) {
            addCriterion("inver_name <", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameLessThanOrEqualTo(String value) {
            addCriterion("inver_name <=", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameLike(String value) {
            addCriterion("inver_name like", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameNotLike(String value) {
            addCriterion("inver_name not like", value, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameIn(List<String> values) {
            addCriterion("inver_name in", values, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameNotIn(List<String> values) {
            addCriterion("inver_name not in", values, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameBetween(String value1, String value2) {
            addCriterion("inver_name between", value1, value2, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverNameNotBetween(String value1, String value2) {
            addCriterion("inver_name not between", value1, value2, "inverName");
            return (Criteria) this;
        }

        public Criteria andInverIdcardIsNull() {
            addCriterion("inver_Idcard is null");
            return (Criteria) this;
        }

        public Criteria andInverIdcardIsNotNull() {
            addCriterion("inver_Idcard is not null");
            return (Criteria) this;
        }

        public Criteria andInverIdcardEqualTo(String value) {
            addCriterion("inver_Idcard =", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardNotEqualTo(String value) {
            addCriterion("inver_Idcard <>", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardGreaterThan(String value) {
            addCriterion("inver_Idcard >", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("inver_Idcard >=", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardLessThan(String value) {
            addCriterion("inver_Idcard <", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardLessThanOrEqualTo(String value) {
            addCriterion("inver_Idcard <=", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardLike(String value) {
            addCriterion("inver_Idcard like", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardNotLike(String value) {
            addCriterion("inver_Idcard not like", value, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardIn(List<String> values) {
            addCriterion("inver_Idcard in", values, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardNotIn(List<String> values) {
            addCriterion("inver_Idcard not in", values, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardBetween(String value1, String value2) {
            addCriterion("inver_Idcard between", value1, value2, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverIdcardNotBetween(String value1, String value2) {
            addCriterion("inver_Idcard not between", value1, value2, "inverIdcard");
            return (Criteria) this;
        }

        public Criteria andInverAddIsNull() {
            addCriterion("inver_add is null");
            return (Criteria) this;
        }

        public Criteria andInverAddIsNotNull() {
            addCriterion("inver_add is not null");
            return (Criteria) this;
        }

        public Criteria andInverAddEqualTo(String value) {
            addCriterion("inver_add =", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddNotEqualTo(String value) {
            addCriterion("inver_add <>", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddGreaterThan(String value) {
            addCriterion("inver_add >", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddGreaterThanOrEqualTo(String value) {
            addCriterion("inver_add >=", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddLessThan(String value) {
            addCriterion("inver_add <", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddLessThanOrEqualTo(String value) {
            addCriterion("inver_add <=", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddLike(String value) {
            addCriterion("inver_add like", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddNotLike(String value) {
            addCriterion("inver_add not like", value, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddIn(List<String> values) {
            addCriterion("inver_add in", values, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddNotIn(List<String> values) {
            addCriterion("inver_add not in", values, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddBetween(String value1, String value2) {
            addCriterion("inver_add between", value1, value2, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andInverAddNotBetween(String value1, String value2) {
            addCriterion("inver_add not between", value1, value2, "inverAdd");
            return (Criteria) this;
        }

        public Criteria andDebtNameIsNull() {
            addCriterion("debt_name is null");
            return (Criteria) this;
        }

        public Criteria andDebtNameIsNotNull() {
            addCriterion("debt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDebtNameEqualTo(String value) {
            addCriterion("debt_name =", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotEqualTo(String value) {
            addCriterion("debt_name <>", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameGreaterThan(String value) {
            addCriterion("debt_name >", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameGreaterThanOrEqualTo(String value) {
            addCriterion("debt_name >=", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLessThan(String value) {
            addCriterion("debt_name <", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLessThanOrEqualTo(String value) {
            addCriterion("debt_name <=", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameLike(String value) {
            addCriterion("debt_name like", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotLike(String value) {
            addCriterion("debt_name not like", value, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameIn(List<String> values) {
            addCriterion("debt_name in", values, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotIn(List<String> values) {
            addCriterion("debt_name not in", values, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameBetween(String value1, String value2) {
            addCriterion("debt_name between", value1, value2, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtNameNotBetween(String value1, String value2) {
            addCriterion("debt_name not between", value1, value2, "debtName");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardIsNull() {
            addCriterion("debt_Idcard is null");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardIsNotNull() {
            addCriterion("debt_Idcard is not null");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardEqualTo(String value) {
            addCriterion("debt_Idcard =", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardNotEqualTo(String value) {
            addCriterion("debt_Idcard <>", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardGreaterThan(String value) {
            addCriterion("debt_Idcard >", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("debt_Idcard >=", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardLessThan(String value) {
            addCriterion("debt_Idcard <", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardLessThanOrEqualTo(String value) {
            addCriterion("debt_Idcard <=", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardLike(String value) {
            addCriterion("debt_Idcard like", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardNotLike(String value) {
            addCriterion("debt_Idcard not like", value, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardIn(List<String> values) {
            addCriterion("debt_Idcard in", values, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardNotIn(List<String> values) {
            addCriterion("debt_Idcard not in", values, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardBetween(String value1, String value2) {
            addCriterion("debt_Idcard between", value1, value2, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtIdcardNotBetween(String value1, String value2) {
            addCriterion("debt_Idcard not between", value1, value2, "debtIdcard");
            return (Criteria) this;
        }

        public Criteria andDebtAddIsNull() {
            addCriterion("debt_add is null");
            return (Criteria) this;
        }

        public Criteria andDebtAddIsNotNull() {
            addCriterion("debt_add is not null");
            return (Criteria) this;
        }

        public Criteria andDebtAddEqualTo(String value) {
            addCriterion("debt_add =", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddNotEqualTo(String value) {
            addCriterion("debt_add <>", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddGreaterThan(String value) {
            addCriterion("debt_add >", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddGreaterThanOrEqualTo(String value) {
            addCriterion("debt_add >=", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddLessThan(String value) {
            addCriterion("debt_add <", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddLessThanOrEqualTo(String value) {
            addCriterion("debt_add <=", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddLike(String value) {
            addCriterion("debt_add like", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddNotLike(String value) {
            addCriterion("debt_add not like", value, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddIn(List<String> values) {
            addCriterion("debt_add in", values, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddNotIn(List<String> values) {
            addCriterion("debt_add not in", values, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddBetween(String value1, String value2) {
            addCriterion("debt_add between", value1, value2, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andDebtAddNotBetween(String value1, String value2) {
            addCriterion("debt_add not between", value1, value2, "debtAdd");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNull() {
            addCriterion("loan_term is null");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNotNull() {
            addCriterion("loan_term is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTermEqualTo(Integer value) {
            addCriterion("loan_term =", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotEqualTo(Integer value) {
            addCriterion("loan_term <>", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThan(Integer value) {
            addCriterion("loan_term >", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_term >=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThan(Integer value) {
            addCriterion("loan_term <", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThanOrEqualTo(Integer value) {
            addCriterion("loan_term <=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermIn(List<Integer> values) {
            addCriterion("loan_term in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotIn(List<Integer> values) {
            addCriterion("loan_term not in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermBetween(Integer value1, Integer value2) {
            addCriterion("loan_term between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_term not between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("loan_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(Date value) {
            addCriterionForJDBCDate("loan_date =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("loan_date <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(Date value) {
            addCriterionForJDBCDate("loan_date >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_date >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(Date value) {
            addCriterionForJDBCDate("loan_date <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loan_date <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<Date> values) {
            addCriterionForJDBCDate("loan_date in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("loan_date not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_date between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loan_date not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andRepayDataIsNull() {
            addCriterion("repay_data is null");
            return (Criteria) this;
        }

        public Criteria andRepayDataIsNotNull() {
            addCriterion("repay_data is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDataEqualTo(Date value) {
            addCriterionForJDBCDate("repay_data =", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("repay_data <>", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataGreaterThan(Date value) {
            addCriterionForJDBCDate("repay_data >", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repay_data >=", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataLessThan(Date value) {
            addCriterionForJDBCDate("repay_data <", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("repay_data <=", value, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataIn(List<Date> values) {
            addCriterionForJDBCDate("repay_data in", values, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("repay_data not in", values, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repay_data between", value1, value2, "repayData");
            return (Criteria) this;
        }

        public Criteria andRepayDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("repay_data not between", value1, value2, "repayData");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIsNull() {
            addCriterion("overdue_date is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIsNotNull() {
            addCriterion("overdue_date is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDateEqualTo(Date value) {
            addCriterionForJDBCDate("overdue_date =", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("overdue_date <>", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateGreaterThan(Date value) {
            addCriterionForJDBCDate("overdue_date >", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overdue_date >=", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateLessThan(Date value) {
            addCriterionForJDBCDate("overdue_date <", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("overdue_date <=", value, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateIn(List<Date> values) {
            addCriterionForJDBCDate("overdue_date in", values, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("overdue_date not in", values, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overdue_date between", value1, value2, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("overdue_date not between", value1, value2, "overdueDate");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNull() {
            addCriterion("overdue_days is null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIsNotNull() {
            addCriterion("overdue_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysEqualTo(Integer value) {
            addCriterion("overdue_days =", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotEqualTo(Integer value) {
            addCriterion("overdue_days <>", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThan(Integer value) {
            addCriterion("overdue_days >", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("overdue_days >=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThan(Integer value) {
            addCriterion("overdue_days <", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysLessThanOrEqualTo(Integer value) {
            addCriterion("overdue_days <=", value, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysIn(List<Integer> values) {
            addCriterion("overdue_days in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotIn(List<Integer> values) {
            addCriterion("overdue_days not in", values, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andOverdueDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("overdue_days not between", value1, value2, "overdueDays");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIsNull() {
            addCriterion("contract_money is null");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIsNotNull() {
            addCriterion("contract_money is not null");
            return (Criteria) this;
        }

        public Criteria andContractMoneyEqualTo(Float value) {
            addCriterion("contract_money =", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotEqualTo(Float value) {
            addCriterion("contract_money <>", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyGreaterThan(Float value) {
            addCriterion("contract_money >", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("contract_money >=", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyLessThan(Float value) {
            addCriterion("contract_money <", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyLessThanOrEqualTo(Float value) {
            addCriterion("contract_money <=", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIn(List<Float> values) {
            addCriterion("contract_money in", values, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotIn(List<Float> values) {
            addCriterion("contract_money not in", values, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyBetween(Float value1, Float value2) {
            addCriterion("contract_money between", value1, value2, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotBetween(Float value1, Float value2) {
            addCriterion("contract_money not between", value1, value2, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIsNull() {
            addCriterion("paid_principal is null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIsNotNull() {
            addCriterion("paid_principal is not null");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalEqualTo(Float value) {
            addCriterion("paid_principal =", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotEqualTo(Float value) {
            addCriterion("paid_principal <>", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalGreaterThan(Float value) {
            addCriterion("paid_principal >", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("paid_principal >=", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalLessThan(Float value) {
            addCriterion("paid_principal <", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalLessThanOrEqualTo(Float value) {
            addCriterion("paid_principal <=", value, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalIn(List<Float> values) {
            addCriterion("paid_principal in", values, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotIn(List<Float> values) {
            addCriterion("paid_principal not in", values, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalBetween(Float value1, Float value2) {
            addCriterion("paid_principal between", value1, value2, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidPrincipalNotBetween(Float value1, Float value2) {
            addCriterion("paid_principal not between", value1, value2, "paidPrincipal");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNull() {
            addCriterion("paid_interest is null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIsNotNull() {
            addCriterion("paid_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPaidInterestEqualTo(Float value) {
            addCriterion("paid_interest =", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotEqualTo(Float value) {
            addCriterion("paid_interest <>", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThan(Float value) {
            addCriterion("paid_interest >", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("paid_interest >=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThan(Float value) {
            addCriterion("paid_interest <", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestLessThanOrEqualTo(Float value) {
            addCriterion("paid_interest <=", value, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestIn(List<Float> values) {
            addCriterion("paid_interest in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotIn(List<Float> values) {
            addCriterion("paid_interest not in", values, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestBetween(Float value1, Float value2) {
            addCriterion("paid_interest between", value1, value2, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andPaidInterestNotBetween(Float value1, Float value2) {
            addCriterion("paid_interest not between", value1, value2, "paidInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestIsNull() {
            addCriterion("agreed_interest is null");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestIsNotNull() {
            addCriterion("agreed_interest is not null");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestEqualTo(Float value) {
            addCriterion("agreed_interest =", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestNotEqualTo(Float value) {
            addCriterion("agreed_interest <>", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestGreaterThan(Float value) {
            addCriterion("agreed_interest >", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("agreed_interest >=", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestLessThan(Float value) {
            addCriterion("agreed_interest <", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestLessThanOrEqualTo(Float value) {
            addCriterion("agreed_interest <=", value, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestIn(List<Float> values) {
            addCriterion("agreed_interest in", values, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestNotIn(List<Float> values) {
            addCriterion("agreed_interest not in", values, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestBetween(Float value1, Float value2) {
            addCriterion("agreed_interest between", value1, value2, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andAgreedInterestNotBetween(Float value1, Float value2) {
            addCriterion("agreed_interest not between", value1, value2, "agreedInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIsNull() {
            addCriterion("overdue_rate is null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIsNotNull() {
            addCriterion("overdue_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueRateEqualTo(Float value) {
            addCriterion("overdue_rate =", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotEqualTo(Float value) {
            addCriterion("overdue_rate <>", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThan(Float value) {
            addCriterion("overdue_rate >", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateGreaterThanOrEqualTo(Float value) {
            addCriterion("overdue_rate >=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThan(Float value) {
            addCriterion("overdue_rate <", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateLessThanOrEqualTo(Float value) {
            addCriterion("overdue_rate <=", value, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateIn(List<Float> values) {
            addCriterion("overdue_rate in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotIn(List<Float> values) {
            addCriterion("overdue_rate not in", values, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateBetween(Float value1, Float value2) {
            addCriterion("overdue_rate between", value1, value2, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverdueRateNotBetween(Float value1, Float value2) {
            addCriterion("overdue_rate not between", value1, value2, "overdueRate");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIsNull() {
            addCriterion("overdue_penalty is null");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIsNotNull() {
            addCriterion("overdue_penalty is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyEqualTo(Float value) {
            addCriterion("overdue_penalty =", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotEqualTo(Float value) {
            addCriterion("overdue_penalty <>", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyGreaterThan(Float value) {
            addCriterion("overdue_penalty >", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyGreaterThanOrEqualTo(Float value) {
            addCriterion("overdue_penalty >=", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyLessThan(Float value) {
            addCriterion("overdue_penalty <", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyLessThanOrEqualTo(Float value) {
            addCriterion("overdue_penalty <=", value, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyIn(List<Float> values) {
            addCriterion("overdue_penalty in", values, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotIn(List<Float> values) {
            addCriterion("overdue_penalty not in", values, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyBetween(Float value1, Float value2) {
            addCriterion("overdue_penalty between", value1, value2, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andOverduePenaltyNotBetween(Float value1, Float value2) {
            addCriterion("overdue_penalty not between", value1, value2, "overduePenalty");
            return (Criteria) this;
        }

        public Criteria andPlatFeeIsNull() {
            addCriterion("plat_fee is null");
            return (Criteria) this;
        }

        public Criteria andPlatFeeIsNotNull() {
            addCriterion("plat_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPlatFeeEqualTo(Float value) {
            addCriterion("plat_fee =", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeNotEqualTo(Float value) {
            addCriterion("plat_fee <>", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeGreaterThan(Float value) {
            addCriterion("plat_fee >", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("plat_fee >=", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeLessThan(Float value) {
            addCriterion("plat_fee <", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeLessThanOrEqualTo(Float value) {
            addCriterion("plat_fee <=", value, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeIn(List<Float> values) {
            addCriterion("plat_fee in", values, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeNotIn(List<Float> values) {
            addCriterion("plat_fee not in", values, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeBetween(Float value1, Float value2) {
            addCriterion("plat_fee between", value1, value2, "platFee");
            return (Criteria) this;
        }

        public Criteria andPlatFeeNotBetween(Float value1, Float value2) {
            addCriterion("plat_fee not between", value1, value2, "platFee");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIsNull() {
            addCriterion("overdue_principal is null");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIsNotNull() {
            addCriterion("overdue_principal is not null");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalEqualTo(Float value) {
            addCriterion("overdue_principal =", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotEqualTo(Float value) {
            addCriterion("overdue_principal <>", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalGreaterThan(Float value) {
            addCriterion("overdue_principal >", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalGreaterThanOrEqualTo(Float value) {
            addCriterion("overdue_principal >=", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalLessThan(Float value) {
            addCriterion("overdue_principal <", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalLessThanOrEqualTo(Float value) {
            addCriterion("overdue_principal <=", value, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalIn(List<Float> values) {
            addCriterion("overdue_principal in", values, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotIn(List<Float> values) {
            addCriterion("overdue_principal not in", values, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalBetween(Float value1, Float value2) {
            addCriterion("overdue_principal between", value1, value2, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverduePrincipalNotBetween(Float value1, Float value2) {
            addCriterion("overdue_principal not between", value1, value2, "overduePrincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNull() {
            addCriterion("overdue_interest is null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIsNotNull() {
            addCriterion("overdue_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestEqualTo(Float value) {
            addCriterion("overdue_interest =", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotEqualTo(Float value) {
            addCriterion("overdue_interest <>", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThan(Float value) {
            addCriterion("overdue_interest >", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestGreaterThanOrEqualTo(Float value) {
            addCriterion("overdue_interest >=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThan(Float value) {
            addCriterion("overdue_interest <", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestLessThanOrEqualTo(Float value) {
            addCriterion("overdue_interest <=", value, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestIn(List<Float> values) {
            addCriterion("overdue_interest in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotIn(List<Float> values) {
            addCriterion("overdue_interest not in", values, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestBetween(Float value1, Float value2) {
            addCriterion("overdue_interest between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andOverdueInterestNotBetween(Float value1, Float value2) {
            addCriterion("overdue_interest not between", value1, value2, "overdueInterest");
            return (Criteria) this;
        }

        public Criteria andFeeTotalIsNull() {
            addCriterion("fee_total is null");
            return (Criteria) this;
        }

        public Criteria andFeeTotalIsNotNull() {
            addCriterion("fee_total is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTotalEqualTo(Float value) {
            addCriterion("fee_total =", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalNotEqualTo(Float value) {
            addCriterion("fee_total <>", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalGreaterThan(Float value) {
            addCriterion("fee_total >", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("fee_total >=", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalLessThan(Float value) {
            addCriterion("fee_total <", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalLessThanOrEqualTo(Float value) {
            addCriterion("fee_total <=", value, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalIn(List<Float> values) {
            addCriterion("fee_total in", values, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalNotIn(List<Float> values) {
            addCriterion("fee_total not in", values, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalBetween(Float value1, Float value2) {
            addCriterion("fee_total between", value1, value2, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andFeeTotalNotBetween(Float value1, Float value2) {
            addCriterion("fee_total not between", value1, value2, "feeTotal");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCaseFileIsNull() {
            addCriterion("case_file is null");
            return (Criteria) this;
        }

        public Criteria andCaseFileIsNotNull() {
            addCriterion("case_file is not null");
            return (Criteria) this;
        }

        public Criteria andCaseFileEqualTo(String value) {
            addCriterion("case_file =", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileNotEqualTo(String value) {
            addCriterion("case_file <>", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileGreaterThan(String value) {
            addCriterion("case_file >", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileGreaterThanOrEqualTo(String value) {
            addCriterion("case_file >=", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileLessThan(String value) {
            addCriterion("case_file <", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileLessThanOrEqualTo(String value) {
            addCriterion("case_file <=", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileLike(String value) {
            addCriterion("case_file like", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileNotLike(String value) {
            addCriterion("case_file not like", value, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileIn(List<String> values) {
            addCriterion("case_file in", values, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileNotIn(List<String> values) {
            addCriterion("case_file not in", values, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileBetween(String value1, String value2) {
            addCriterion("case_file between", value1, value2, "caseFile");
            return (Criteria) this;
        }

        public Criteria andCaseFileNotBetween(String value1, String value2) {
            addCriterion("case_file not between", value1, value2, "caseFile");
            return (Criteria) this;
        }

        public Criteria andFiuserIdIsNull() {
            addCriterion("fiUser_id is null");
            return (Criteria) this;
        }

        public Criteria andFiuserIdIsNotNull() {
            addCriterion("fiUser_id is not null");
            return (Criteria) this;
        }

        public Criteria andFiuserIdEqualTo(Integer value) {
            addCriterion("fiUser_id =", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdNotEqualTo(Integer value) {
            addCriterion("fiUser_id <>", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdGreaterThan(Integer value) {
            addCriterion("fiUser_id >", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiUser_id >=", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdLessThan(Integer value) {
            addCriterion("fiUser_id <", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fiUser_id <=", value, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdIn(List<Integer> values) {
            addCriterion("fiUser_id in", values, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdNotIn(List<Integer> values) {
            addCriterion("fiUser_id not in", values, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdBetween(Integer value1, Integer value2) {
            addCriterion("fiUser_id between", value1, value2, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andFiuserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fiUser_id not between", value1, value2, "fiuserId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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
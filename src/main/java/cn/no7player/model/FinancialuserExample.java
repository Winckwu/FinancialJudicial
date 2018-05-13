package cn.no7player.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinancialuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinancialuserExample() {
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

        public Criteria andFiuserEmailIsNull() {
            addCriterion("fiUser_email is null");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailIsNotNull() {
            addCriterion("fiUser_email is not null");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailEqualTo(String value) {
            addCriterion("fiUser_email =", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailNotEqualTo(String value) {
            addCriterion("fiUser_email <>", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailGreaterThan(String value) {
            addCriterion("fiUser_email >", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("fiUser_email >=", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailLessThan(String value) {
            addCriterion("fiUser_email <", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailLessThanOrEqualTo(String value) {
            addCriterion("fiUser_email <=", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailLike(String value) {
            addCriterion("fiUser_email like", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailNotLike(String value) {
            addCriterion("fiUser_email not like", value, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailIn(List<String> values) {
            addCriterion("fiUser_email in", values, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailNotIn(List<String> values) {
            addCriterion("fiUser_email not in", values, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailBetween(String value1, String value2) {
            addCriterion("fiUser_email between", value1, value2, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserEmailNotBetween(String value1, String value2) {
            addCriterion("fiUser_email not between", value1, value2, "fiuserEmail");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdIsNull() {
            addCriterion("fiUser_pwd is null");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdIsNotNull() {
            addCriterion("fiUser_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdEqualTo(String value) {
            addCriterion("fiUser_pwd =", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdNotEqualTo(String value) {
            addCriterion("fiUser_pwd <>", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdGreaterThan(String value) {
            addCriterion("fiUser_pwd >", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("fiUser_pwd >=", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdLessThan(String value) {
            addCriterion("fiUser_pwd <", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdLessThanOrEqualTo(String value) {
            addCriterion("fiUser_pwd <=", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdLike(String value) {
            addCriterion("fiUser_pwd like", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdNotLike(String value) {
            addCriterion("fiUser_pwd not like", value, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdIn(List<String> values) {
            addCriterion("fiUser_pwd in", values, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdNotIn(List<String> values) {
            addCriterion("fiUser_pwd not in", values, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdBetween(String value1, String value2) {
            addCriterion("fiUser_pwd between", value1, value2, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserPwdNotBetween(String value1, String value2) {
            addCriterion("fiUser_pwd not between", value1, value2, "fiuserPwd");
            return (Criteria) this;
        }

        public Criteria andFiuserImageIsNull() {
            addCriterion("fiUser_image is null");
            return (Criteria) this;
        }

        public Criteria andFiuserImageIsNotNull() {
            addCriterion("fiUser_image is not null");
            return (Criteria) this;
        }

        public Criteria andFiuserImageEqualTo(String value) {
            addCriterion("fiUser_image =", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageNotEqualTo(String value) {
            addCriterion("fiUser_image <>", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageGreaterThan(String value) {
            addCriterion("fiUser_image >", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageGreaterThanOrEqualTo(String value) {
            addCriterion("fiUser_image >=", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageLessThan(String value) {
            addCriterion("fiUser_image <", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageLessThanOrEqualTo(String value) {
            addCriterion("fiUser_image <=", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageLike(String value) {
            addCriterion("fiUser_image like", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageNotLike(String value) {
            addCriterion("fiUser_image not like", value, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageIn(List<String> values) {
            addCriterion("fiUser_image in", values, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageNotIn(List<String> values) {
            addCriterion("fiUser_image not in", values, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageBetween(String value1, String value2) {
            addCriterion("fiUser_image between", value1, value2, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andFiuserImageNotBetween(String value1, String value2) {
            addCriterion("fiUser_image not between", value1, value2, "fiuserImage");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("corp_name is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("corp_name =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("corp_name <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("corp_name >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("corp_name >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("corp_name <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("corp_name <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("corp_name like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("corp_name not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("corp_name in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("corp_name not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("corp_name between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("corp_name not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameIsNull() {
            addCriterion("legalPerson_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameIsNotNull() {
            addCriterion("legalPerson_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameEqualTo(String value) {
            addCriterion("legalPerson_name =", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameNotEqualTo(String value) {
            addCriterion("legalPerson_name <>", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameGreaterThan(String value) {
            addCriterion("legalPerson_name >", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("legalPerson_name >=", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameLessThan(String value) {
            addCriterion("legalPerson_name <", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameLessThanOrEqualTo(String value) {
            addCriterion("legalPerson_name <=", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameLike(String value) {
            addCriterion("legalPerson_name like", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameNotLike(String value) {
            addCriterion("legalPerson_name not like", value, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameIn(List<String> values) {
            addCriterion("legalPerson_name in", values, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameNotIn(List<String> values) {
            addCriterion("legalPerson_name not in", values, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameBetween(String value1, String value2) {
            addCriterion("legalPerson_name between", value1, value2, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNameNotBetween(String value1, String value2) {
            addCriterion("legalPerson_name not between", value1, value2, "legalpersonName");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardIsNull() {
            addCriterion("legalPerson_IDcard is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardIsNotNull() {
            addCriterion("legalPerson_IDcard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardEqualTo(String value) {
            addCriterion("legalPerson_IDcard =", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardNotEqualTo(String value) {
            addCriterion("legalPerson_IDcard <>", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardGreaterThan(String value) {
            addCriterion("legalPerson_IDcard >", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("legalPerson_IDcard >=", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardLessThan(String value) {
            addCriterion("legalPerson_IDcard <", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardLessThanOrEqualTo(String value) {
            addCriterion("legalPerson_IDcard <=", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardLike(String value) {
            addCriterion("legalPerson_IDcard like", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardNotLike(String value) {
            addCriterion("legalPerson_IDcard not like", value, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardIn(List<String> values) {
            addCriterion("legalPerson_IDcard in", values, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardNotIn(List<String> values) {
            addCriterion("legalPerson_IDcard not in", values, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardBetween(String value1, String value2) {
            addCriterion("legalPerson_IDcard between", value1, value2, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIdcardNotBetween(String value1, String value2) {
            addCriterion("legalPerson_IDcard not between", value1, value2, "legalpersonIdcard");
            return (Criteria) this;
        }

        public Criteria andIdcardImageIsNull() {
            addCriterion("IDcard_image is null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageIsNotNull() {
            addCriterion("IDcard_image is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardImageEqualTo(String value) {
            addCriterion("IDcard_image =", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageNotEqualTo(String value) {
            addCriterion("IDcard_image <>", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageGreaterThan(String value) {
            addCriterion("IDcard_image >", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard_image >=", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageLessThan(String value) {
            addCriterion("IDcard_image <", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageLessThanOrEqualTo(String value) {
            addCriterion("IDcard_image <=", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageLike(String value) {
            addCriterion("IDcard_image like", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageNotLike(String value) {
            addCriterion("IDcard_image not like", value, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageIn(List<String> values) {
            addCriterion("IDcard_image in", values, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageNotIn(List<String> values) {
            addCriterion("IDcard_image not in", values, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageBetween(String value1, String value2) {
            addCriterion("IDcard_image between", value1, value2, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andIdcardImageNotBetween(String value1, String value2) {
            addCriterion("IDcard_image not between", value1, value2, "idcardImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageIsNull() {
            addCriterion("busiLicen_image is null");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageIsNotNull() {
            addCriterion("busiLicen_image is not null");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageEqualTo(String value) {
            addCriterion("busiLicen_image =", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageNotEqualTo(String value) {
            addCriterion("busiLicen_image <>", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageGreaterThan(String value) {
            addCriterion("busiLicen_image >", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageGreaterThanOrEqualTo(String value) {
            addCriterion("busiLicen_image >=", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageLessThan(String value) {
            addCriterion("busiLicen_image <", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageLessThanOrEqualTo(String value) {
            addCriterion("busiLicen_image <=", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageLike(String value) {
            addCriterion("busiLicen_image like", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageNotLike(String value) {
            addCriterion("busiLicen_image not like", value, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageIn(List<String> values) {
            addCriterion("busiLicen_image in", values, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageNotIn(List<String> values) {
            addCriterion("busiLicen_image not in", values, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageBetween(String value1, String value2) {
            addCriterion("busiLicen_image between", value1, value2, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andBusilicenImageNotBetween(String value1, String value2) {
            addCriterion("busiLicen_image not between", value1, value2, "busilicenImage");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(Integer value) {
            addCriterion("check_result =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(Integer value) {
            addCriterion("check_result <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(Integer value) {
            addCriterion("check_result >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_result >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(Integer value) {
            addCriterion("check_result <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(Integer value) {
            addCriterion("check_result <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<Integer> values) {
            addCriterion("check_result in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<Integer> values) {
            addCriterion("check_result not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(Integer value1, Integer value2) {
            addCriterion("check_result between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(Integer value1, Integer value2) {
            addCriterion("check_result not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeIsNull() {
            addCriterion("submitInfo_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeIsNotNull() {
            addCriterion("submitInfo_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeEqualTo(Date value) {
            addCriterion("submitInfo_time =", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeNotEqualTo(Date value) {
            addCriterion("submitInfo_time <>", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeGreaterThan(Date value) {
            addCriterion("submitInfo_time >", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submitInfo_time >=", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeLessThan(Date value) {
            addCriterion("submitInfo_time <", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("submitInfo_time <=", value, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeIn(List<Date> values) {
            addCriterion("submitInfo_time in", values, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeNotIn(List<Date> values) {
            addCriterion("submitInfo_time not in", values, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeBetween(Date value1, Date value2) {
            addCriterion("submitInfo_time between", value1, value2, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andSubmitinfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("submitInfo_time not between", value1, value2, "submitinfoTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
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
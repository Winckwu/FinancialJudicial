package cn.no7player.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawyerExample() {
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

        public Criteria andLawyerTelpIsNull() {
            addCriterion("lawyer_telp is null");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpIsNotNull() {
            addCriterion("lawyer_telp is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpEqualTo(String value) {
            addCriterion("lawyer_telp =", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpNotEqualTo(String value) {
            addCriterion("lawyer_telp <>", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpGreaterThan(String value) {
            addCriterion("lawyer_telp >", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer_telp >=", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpLessThan(String value) {
            addCriterion("lawyer_telp <", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpLessThanOrEqualTo(String value) {
            addCriterion("lawyer_telp <=", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpLike(String value) {
            addCriterion("lawyer_telp like", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpNotLike(String value) {
            addCriterion("lawyer_telp not like", value, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpIn(List<String> values) {
            addCriterion("lawyer_telp in", values, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpNotIn(List<String> values) {
            addCriterion("lawyer_telp not in", values, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpBetween(String value1, String value2) {
            addCriterion("lawyer_telp between", value1, value2, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerTelpNotBetween(String value1, String value2) {
            addCriterion("lawyer_telp not between", value1, value2, "lawyerTelp");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdIsNull() {
            addCriterion("lawyer_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdIsNotNull() {
            addCriterion("lawyer_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdEqualTo(String value) {
            addCriterion("lawyer_pwd =", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdNotEqualTo(String value) {
            addCriterion("lawyer_pwd <>", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdGreaterThan(String value) {
            addCriterion("lawyer_pwd >", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer_pwd >=", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdLessThan(String value) {
            addCriterion("lawyer_pwd <", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdLessThanOrEqualTo(String value) {
            addCriterion("lawyer_pwd <=", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdLike(String value) {
            addCriterion("lawyer_pwd like", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdNotLike(String value) {
            addCriterion("lawyer_pwd not like", value, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdIn(List<String> values) {
            addCriterion("lawyer_pwd in", values, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdNotIn(List<String> values) {
            addCriterion("lawyer_pwd not in", values, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdBetween(String value1, String value2) {
            addCriterion("lawyer_pwd between", value1, value2, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerPwdNotBetween(String value1, String value2) {
            addCriterion("lawyer_pwd not between", value1, value2, "lawyerPwd");
            return (Criteria) this;
        }

        public Criteria andLawyerImageIsNull() {
            addCriterion("lawyer_image is null");
            return (Criteria) this;
        }

        public Criteria andLawyerImageIsNotNull() {
            addCriterion("lawyer_image is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerImageEqualTo(String value) {
            addCriterion("lawyer_image =", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageNotEqualTo(String value) {
            addCriterion("lawyer_image <>", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageGreaterThan(String value) {
            addCriterion("lawyer_image >", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer_image >=", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageLessThan(String value) {
            addCriterion("lawyer_image <", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageLessThanOrEqualTo(String value) {
            addCriterion("lawyer_image <=", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageLike(String value) {
            addCriterion("lawyer_image like", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageNotLike(String value) {
            addCriterion("lawyer_image not like", value, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageIn(List<String> values) {
            addCriterion("lawyer_image in", values, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageNotIn(List<String> values) {
            addCriterion("lawyer_image not in", values, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageBetween(String value1, String value2) {
            addCriterion("lawyer_image between", value1, value2, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerImageNotBetween(String value1, String value2) {
            addCriterion("lawyer_image not between", value1, value2, "lawyerImage");
            return (Criteria) this;
        }

        public Criteria andLawyerNameIsNull() {
            addCriterion("lawyer_name is null");
            return (Criteria) this;
        }

        public Criteria andLawyerNameIsNotNull() {
            addCriterion("lawyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerNameEqualTo(String value) {
            addCriterion("lawyer_name =", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameNotEqualTo(String value) {
            addCriterion("lawyer_name <>", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameGreaterThan(String value) {
            addCriterion("lawyer_name >", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer_name >=", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameLessThan(String value) {
            addCriterion("lawyer_name <", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameLessThanOrEqualTo(String value) {
            addCriterion("lawyer_name <=", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameLike(String value) {
            addCriterion("lawyer_name like", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameNotLike(String value) {
            addCriterion("lawyer_name not like", value, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameIn(List<String> values) {
            addCriterion("lawyer_name in", values, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameNotIn(List<String> values) {
            addCriterion("lawyer_name not in", values, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameBetween(String value1, String value2) {
            addCriterion("lawyer_name between", value1, value2, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andLawyerNameNotBetween(String value1, String value2) {
            addCriterion("lawyer_name not between", value1, value2, "lawyerName");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNull() {
            addCriterion("IDcard_number is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIsNotNull() {
            addCriterion("IDcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberEqualTo(String value) {
            addCriterion("IDcard_number =", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotEqualTo(String value) {
            addCriterion("IDcard_number <>", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThan(String value) {
            addCriterion("IDcard_number >", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDcard_number >=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThan(String value) {
            addCriterion("IDcard_number <", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("IDcard_number <=", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberLike(String value) {
            addCriterion("IDcard_number like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotLike(String value) {
            addCriterion("IDcard_number not like", value, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberIn(List<String> values) {
            addCriterion("IDcard_number in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotIn(List<String> values) {
            addCriterion("IDcard_number not in", values, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberBetween(String value1, String value2) {
            addCriterion("IDcard_number between", value1, value2, "idcardNumber");
            return (Criteria) this;
        }

        public Criteria andIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("IDcard_number not between", value1, value2, "idcardNumber");
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

        public Criteria andLawyerLicenseIsNull() {
            addCriterion("lawyer_license is null");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseIsNotNull() {
            addCriterion("lawyer_license is not null");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseEqualTo(String value) {
            addCriterion("lawyer_license =", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseNotEqualTo(String value) {
            addCriterion("lawyer_license <>", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseGreaterThan(String value) {
            addCriterion("lawyer_license >", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("lawyer_license >=", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseLessThan(String value) {
            addCriterion("lawyer_license <", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseLessThanOrEqualTo(String value) {
            addCriterion("lawyer_license <=", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseLike(String value) {
            addCriterion("lawyer_license like", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseNotLike(String value) {
            addCriterion("lawyer_license not like", value, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseIn(List<String> values) {
            addCriterion("lawyer_license in", values, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseNotIn(List<String> values) {
            addCriterion("lawyer_license not in", values, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseBetween(String value1, String value2) {
            addCriterion("lawyer_license between", value1, value2, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andLawyerLicenseNotBetween(String value1, String value2) {
            addCriterion("lawyer_license not between", value1, value2, "lawyerLicense");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNull() {
            addCriterion("office is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIsNotNull() {
            addCriterion("office is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeEqualTo(String value) {
            addCriterion("office =", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotEqualTo(String value) {
            addCriterion("office <>", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThan(String value) {
            addCriterion("office >", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("office >=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThan(String value) {
            addCriterion("office <", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLessThanOrEqualTo(String value) {
            addCriterion("office <=", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeLike(String value) {
            addCriterion("office like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotLike(String value) {
            addCriterion("office not like", value, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeIn(List<String> values) {
            addCriterion("office in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotIn(List<String> values) {
            addCriterion("office not in", values, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeBetween(String value1, String value2) {
            addCriterion("office between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andOfficeNotBetween(String value1, String value2) {
            addCriterion("office not between", value1, value2, "office");
            return (Criteria) this;
        }

        public Criteria andWorkExpIsNull() {
            addCriterion("work_exp is null");
            return (Criteria) this;
        }

        public Criteria andWorkExpIsNotNull() {
            addCriterion("work_exp is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExpEqualTo(String value) {
            addCriterion("work_exp =", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotEqualTo(String value) {
            addCriterion("work_exp <>", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpGreaterThan(String value) {
            addCriterion("work_exp >", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpGreaterThanOrEqualTo(String value) {
            addCriterion("work_exp >=", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLessThan(String value) {
            addCriterion("work_exp <", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLessThanOrEqualTo(String value) {
            addCriterion("work_exp <=", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpLike(String value) {
            addCriterion("work_exp like", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotLike(String value) {
            addCriterion("work_exp not like", value, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpIn(List<String> values) {
            addCriterion("work_exp in", values, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotIn(List<String> values) {
            addCriterion("work_exp not in", values, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpBetween(String value1, String value2) {
            addCriterion("work_exp between", value1, value2, "workExp");
            return (Criteria) this;
        }

        public Criteria andWorkExpNotBetween(String value1, String value2) {
            addCriterion("work_exp not between", value1, value2, "workExp");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasIsNull() {
            addCriterion("specialized_areas is null");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasIsNotNull() {
            addCriterion("specialized_areas is not null");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasEqualTo(String value) {
            addCriterion("specialized_areas =", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasNotEqualTo(String value) {
            addCriterion("specialized_areas <>", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasGreaterThan(String value) {
            addCriterion("specialized_areas >", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasGreaterThanOrEqualTo(String value) {
            addCriterion("specialized_areas >=", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasLessThan(String value) {
            addCriterion("specialized_areas <", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasLessThanOrEqualTo(String value) {
            addCriterion("specialized_areas <=", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasLike(String value) {
            addCriterion("specialized_areas like", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasNotLike(String value) {
            addCriterion("specialized_areas not like", value, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasIn(List<String> values) {
            addCriterion("specialized_areas in", values, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasNotIn(List<String> values) {
            addCriterion("specialized_areas not in", values, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasBetween(String value1, String value2) {
            addCriterion("specialized_areas between", value1, value2, "specializedAreas");
            return (Criteria) this;
        }

        public Criteria andSpecializedAreasNotBetween(String value1, String value2) {
            addCriterion("specialized_areas not between", value1, value2, "specializedAreas");
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

        public Criteria andJoinCaseIsNull() {
            addCriterion("join_case is null");
            return (Criteria) this;
        }

        public Criteria andJoinCaseIsNotNull() {
            addCriterion("join_case is not null");
            return (Criteria) this;
        }

        public Criteria andJoinCaseEqualTo(String value) {
            addCriterion("join_case =", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseNotEqualTo(String value) {
            addCriterion("join_case <>", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseGreaterThan(String value) {
            addCriterion("join_case >", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseGreaterThanOrEqualTo(String value) {
            addCriterion("join_case >=", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseLessThan(String value) {
            addCriterion("join_case <", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseLessThanOrEqualTo(String value) {
            addCriterion("join_case <=", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseLike(String value) {
            addCriterion("join_case like", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseNotLike(String value) {
            addCriterion("join_case not like", value, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseIn(List<String> values) {
            addCriterion("join_case in", values, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseNotIn(List<String> values) {
            addCriterion("join_case not in", values, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseBetween(String value1, String value2) {
            addCriterion("join_case between", value1, value2, "joinCase");
            return (Criteria) this;
        }

        public Criteria andJoinCaseNotBetween(String value1, String value2) {
            addCriterion("join_case not between", value1, value2, "joinCase");
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
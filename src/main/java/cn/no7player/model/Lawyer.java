package cn.no7player.model;

import java.util.Date;

public class Lawyer {
    private Integer lawyerId;

    private String lawyerTelp;

    private String lawyerPwd;

    private String lawyerImage;

    private String lawyerName;

    private String idcardNumber;

    private String idcardImage;

    private String lawyerLicense;

    private String office;

    private String workExp;

    private String specializedAreas;

    private Integer checkResult;

    private Date registerTime;

    private Date submitinfoTime;

    private Date checkTime;

    private String operator;

    private String joinCase;

    private String checkAdvice;

    public Integer getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Integer lawyerId) {
        this.lawyerId = lawyerId;
    }

    public String getLawyerTelp() {
        return lawyerTelp;
    }

    public void setLawyerTelp(String lawyerTelp) {
        this.lawyerTelp = lawyerTelp == null ? null : lawyerTelp.trim();
    }

    public String getLawyerPwd() {
        return lawyerPwd;
    }

    public void setLawyerPwd(String lawyerPwd) {
        this.lawyerPwd = lawyerPwd == null ? null : lawyerPwd.trim();
    }

    public String getLawyerImage() {
        return lawyerImage;
    }

    public void setLawyerImage(String lawyerImage) {
        this.lawyerImage = lawyerImage == null ? null : lawyerImage.trim();
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName == null ? null : lawyerName.trim();
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber == null ? null : idcardNumber.trim();
    }

    public String getIdcardImage() {
        return idcardImage;
    }

    public void setIdcardImage(String idcardImage) {
        this.idcardImage = idcardImage == null ? null : idcardImage.trim();
    }

    public String getLawyerLicense() {
        return lawyerLicense;
    }

    public void setLawyerLicense(String lawyerLicense) {
        this.lawyerLicense = lawyerLicense == null ? null : lawyerLicense.trim();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office == null ? null : office.trim();
    }

    public String getWorkExp() {
        return workExp;
    }

    public void setWorkExp(String workExp) {
        this.workExp = workExp == null ? null : workExp.trim();
    }

    public String getSpecializedAreas() {
        return specializedAreas;
    }

    public void setSpecializedAreas(String specializedAreas) {
        this.specializedAreas = specializedAreas == null ? null : specializedAreas.trim();
    }

    public Integer getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getSubmitinfoTime() {
        return submitinfoTime;
    }

    public void setSubmitinfoTime(Date submitinfoTime) {
        this.submitinfoTime = submitinfoTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getJoinCase() {
        return joinCase;
    }

    public void setJoinCase(String joinCase) {
        this.joinCase = joinCase == null ? null : joinCase.trim();
    }

    public String getCheckAdvice() {
        return checkAdvice;
    }

    public void setCheckAdvice(String checkAdvice) {
        this.checkAdvice = checkAdvice == null ? null : checkAdvice.trim();
    }
}
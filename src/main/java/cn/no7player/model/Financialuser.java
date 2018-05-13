package cn.no7player.model;

import java.util.Date;

public class Financialuser {
    private Integer fiuserId;

    private String fiuserEmail;

    private String fiuserPwd;

    private String fiuserImage;

    private String corpName;

    private String legalpersonName;

    private String legalpersonIdcard;

    private String idcardImage;

    private String busilicenImage;

    private Integer checkResult;

    private Date registerTime;

    private Date submitinfoTime;

    private Date checkTime;

    private String operator;

    private String checkAdvice;

    public Integer getFiuserId() {
        return fiuserId;
    }

    public void setFiuserId(Integer fiuserId) {
        this.fiuserId = fiuserId;
    }

    public String getFiuserEmail() {
        return fiuserEmail;
    }

    public void setFiuserEmail(String fiuserEmail) {
        this.fiuserEmail = fiuserEmail == null ? null : fiuserEmail.trim();
    }

    public String getFiuserPwd() {
        return fiuserPwd;
    }

    public void setFiuserPwd(String fiuserPwd) {
        this.fiuserPwd = fiuserPwd == null ? null : fiuserPwd.trim();
    }

    public String getFiuserImage() {
        return fiuserImage;
    }

    public void setFiuserImage(String fiuserImage) {
        this.fiuserImage = fiuserImage == null ? null : fiuserImage.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getLegalpersonName() {
        return legalpersonName;
    }

    public void setLegalpersonName(String legalpersonName) {
        this.legalpersonName = legalpersonName == null ? null : legalpersonName.trim();
    }

    public String getLegalpersonIdcard() {
        return legalpersonIdcard;
    }

    public void setLegalpersonIdcard(String legalpersonIdcard) {
        this.legalpersonIdcard = legalpersonIdcard == null ? null : legalpersonIdcard.trim();
    }

    public String getIdcardImage() {
        return idcardImage;
    }

    public void setIdcardImage(String idcardImage) {
        this.idcardImage = idcardImage == null ? null : idcardImage.trim();
    }

    public String getBusilicenImage() {
        return busilicenImage;
    }

    public void setBusilicenImage(String busilicenImage) {
        this.busilicenImage = busilicenImage == null ? null : busilicenImage.trim();
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

    public String getCheckAdvice() {
        return checkAdvice;
    }

    public void setCheckAdvice(String checkAdvice) {
        this.checkAdvice = checkAdvice == null ? null : checkAdvice.trim();
    }
}
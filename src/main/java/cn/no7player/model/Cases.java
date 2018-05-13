package cn.no7player.model;

import java.util.Date;

public class Cases {
    private Integer caseId;

    private Integer lawyerId;

    private Date deputeTime;

    private String caseResult;

    private String serviceType;

    private String contractNum;

    private String debtPlat;

    private String productName;

    private String inverProj;

    private String inverName;

    private String inverIdcard;

    private String inverAdd;

    private String debtName;

    private String debtIdcard;

    private String debtAdd;

    private Integer loanTerm;

    private Date loanDate;

    private Date repayData;

    private Date overdueDate;

    private Integer overdueDays;

    private Float contractMoney;

    private Float paidPrincipal;

    private Float paidInterest;

    private Float agreedInterest;

    private Float overdueRate;

    private Float overduePenalty;

    private Float platFee;

    private Float overduePrincipal;

    private Float overdueInterest;

    private Float feeTotal;

    private Integer score;

    private String caseFile;

    private Integer fiuserId;

    private String operator;

    private String remark;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Integer lawyerId) {
        this.lawyerId = lawyerId;
    }

    public Date getDeputeTime() {
        return deputeTime;
    }

    public void setDeputeTime(Date deputeTime) {
        this.deputeTime = deputeTime;
    }

    public String getCaseResult() {
        return caseResult;
    }

    public void setCaseResult(String caseResult) {
        this.caseResult = caseResult == null ? null : caseResult.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum == null ? null : contractNum.trim();
    }

    public String getDebtPlat() {
        return debtPlat;
    }

    public void setDebtPlat(String debtPlat) {
        this.debtPlat = debtPlat == null ? null : debtPlat.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getInverProj() {
        return inverProj;
    }

    public void setInverProj(String inverProj) {
        this.inverProj = inverProj == null ? null : inverProj.trim();
    }

    public String getInverName() {
        return inverName;
    }

    public void setInverName(String inverName) {
        this.inverName = inverName == null ? null : inverName.trim();
    }

    public String getInverIdcard() {
        return inverIdcard;
    }

    public void setInverIdcard(String inverIdcard) {
        this.inverIdcard = inverIdcard == null ? null : inverIdcard.trim();
    }

    public String getInverAdd() {
        return inverAdd;
    }

    public void setInverAdd(String inverAdd) {
        this.inverAdd = inverAdd == null ? null : inverAdd.trim();
    }

    public String getDebtName() {
        return debtName;
    }

    public void setDebtName(String debtName) {
        this.debtName = debtName == null ? null : debtName.trim();
    }

    public String getDebtIdcard() {
        return debtIdcard;
    }

    public void setDebtIdcard(String debtIdcard) {
        this.debtIdcard = debtIdcard == null ? null : debtIdcard.trim();
    }

    public String getDebtAdd() {
        return debtAdd;
    }

    public void setDebtAdd(String debtAdd) {
        this.debtAdd = debtAdd == null ? null : debtAdd.trim();
    }

    public Integer getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Date getRepayData() {
        return repayData;
    }

    public void setRepayData(Date repayData) {
        this.repayData = repayData;
    }

    public Date getOverdueDate() {
        return overdueDate;
    }

    public void setOverdueDate(Date overdueDate) {
        this.overdueDate = overdueDate;
    }

    public Integer getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Float getContractMoney() {
        return contractMoney;
    }

    public void setContractMoney(Float contractMoney) {
        this.contractMoney = contractMoney;
    }

    public Float getPaidPrincipal() {
        return paidPrincipal;
    }

    public void setPaidPrincipal(Float paidPrincipal) {
        this.paidPrincipal = paidPrincipal;
    }

    public Float getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(Float paidInterest) {
        this.paidInterest = paidInterest;
    }

    public Float getAgreedInterest() {
        return agreedInterest;
    }

    public void setAgreedInterest(Float agreedInterest) {
        this.agreedInterest = agreedInterest;
    }

    public Float getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(Float overdueRate) {
        this.overdueRate = overdueRate;
    }

    public Float getOverduePenalty() {
        return overduePenalty;
    }

    public void setOverduePenalty(Float overduePenalty) {
        this.overduePenalty = overduePenalty;
    }

    public Float getPlatFee() {
        return platFee;
    }

    public void setPlatFee(Float platFee) {
        this.platFee = platFee;
    }

    public Float getOverduePrincipal() {
        return overduePrincipal;
    }

    public void setOverduePrincipal(Float overduePrincipal) {
        this.overduePrincipal = overduePrincipal;
    }

    public Float getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Float overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Float getFeeTotal() {
        return feeTotal;
    }

    public void setFeeTotal(Float feeTotal) {
        this.feeTotal = feeTotal;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCaseFile() {
        return caseFile;
    }

    public void setCaseFile(String caseFile) {
        this.caseFile = caseFile == null ? null : caseFile.trim();
    }

    public Integer getFiuserId() {
        return fiuserId;
    }

    public void setFiuserId(Integer fiuserId) {
        this.fiuserId = fiuserId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
package cn.no7player.model;

import java.util.Date;

public class Assign {
    private Integer assignId;

    private Integer lawyerId;

    private Integer caseId;

    private Date deputeTime;

    private Boolean isAccept;

    public Integer getAssignId() {
        return assignId;
    }

    public void setAssignId(Integer assignId) {
        this.assignId = assignId;
    }

    public Integer getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Integer lawyerId) {
        this.lawyerId = lawyerId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Date getDeputeTime() {
        return deputeTime;
    }

    public void setDeputeTime(Date deputeTime) {
        this.deputeTime = deputeTime;
    }

    public Boolean getIsAccept() {
        return isAccept;
    }

    public void setIsAccept(Boolean isAccept) {
        this.isAccept = isAccept;
    }
}
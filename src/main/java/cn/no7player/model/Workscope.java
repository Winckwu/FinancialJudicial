package cn.no7player.model;

public class Workscope {
    private Integer workscopeId;

    private String workscopeAdd;

    private Integer lawyerId;

    public Integer getWorkscopeId() {
        return workscopeId;
    }

    public void setWorkscopeId(Integer workscopeId) {
        this.workscopeId = workscopeId;
    }

    public String getWorkscopeAdd() {
        return workscopeAdd;
    }

    public void setWorkscopeAdd(String workscopeAdd) {
        this.workscopeAdd = workscopeAdd == null ? null : workscopeAdd.trim();
    }

    public Integer getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Integer lawyerId) {
        this.lawyerId = lawyerId;
    }
}
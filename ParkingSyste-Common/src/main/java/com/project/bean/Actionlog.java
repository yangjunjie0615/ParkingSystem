package com.project.bean;

import java.io.Serializable;

/**
 * actionlog
 * @author 
 */
public class Actionlog implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 操作时间
     */
    private String operatetime;

    /**
     * 操作信息
     */
    private String actionmessage;

    /**
     * 用户
     */
    private Integer uid;

    /**
     * 操作内容
     */
    private String acioninfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(String operatetime) {
        this.operatetime = operatetime;
    }

    public String getActionmessage() {
        return actionmessage;
    }

    public void setActionmessage(String actionmessage) {
        this.actionmessage = actionmessage;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAcioninfo() {
        return acioninfo;
    }

    public void setAcioninfo(String acioninfo) {
        this.acioninfo = acioninfo;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Actionlog other = (Actionlog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOperatetime() == null ? other.getOperatetime() == null : this.getOperatetime().equals(other.getOperatetime()))
            && (this.getActionmessage() == null ? other.getActionmessage() == null : this.getActionmessage().equals(other.getActionmessage()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getAcioninfo() == null ? other.getAcioninfo() == null : this.getAcioninfo().equals(other.getAcioninfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOperatetime() == null) ? 0 : getOperatetime().hashCode());
        result = prime * result + ((getActionmessage() == null) ? 0 : getActionmessage().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getAcioninfo() == null) ? 0 : getAcioninfo().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", operatetime=").append(operatetime);
        sb.append(", actionmessage=").append(actionmessage);
        sb.append(", uid=").append(uid);
        sb.append(", acioninfo=").append(acioninfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
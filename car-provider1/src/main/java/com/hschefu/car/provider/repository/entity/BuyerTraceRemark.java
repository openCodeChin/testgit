package com.hschefu.car.provider.repository.entity;

import java.util.Date;

public class BuyerTraceRemark {

	 private Long buyertraceremarkid;

	    private Long buyertraceid;

	    private String remark;

	    private Date createtime;

	    private Long employeeid;

	    private String employeename;

	    public Long getBuyertraceremarkid() {
	        return buyertraceremarkid;
	    }

	    public void setBuyertraceremarkid(Long buyertraceremarkid) {
	        this.buyertraceremarkid = buyertraceremarkid;
	    }

	    public Long getBuyertraceid() {
	        return buyertraceid;
	    }

	    public void setBuyertraceid(Long buyertraceid) {
	        this.buyertraceid = buyertraceid;
	    }

	    public String getRemark() {
	        return remark;
	    }

	    public void setRemark(String remark) {
	        this.remark = remark == null ? null : remark.trim();
	    }

	    public Date getCreatetime() {
	        return createtime;
	    }

	    public void setCreatetime(Date createtime) {
	        this.createtime = createtime;
	    }

	    public Long getEmployeeid() {
	        return employeeid;
	    }

	    public void setEmployeeid(Long employeeid) {
	        this.employeeid = employeeid;
	    }

	    public String getEmployeename() {
	        return employeename;
	    }

	    public void setEmployeename(String employeename) {
	        this.employeename = employeename == null ? null : employeename.trim();
	    }
}

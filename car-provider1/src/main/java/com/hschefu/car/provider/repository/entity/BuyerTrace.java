package com.hschefu.car.provider.repository.entity;

import java.util.Date;

public class BuyerTrace {
	
	 private Long buyertraceid;

	    private String buyername;

	    private String mobile;

	    private Long carmodelid;

	    private String carmodelname;

	    private String sex;

	    private String buycityid;

	    private String buycityname;

	    private Integer relationstatus;

	    private Long storeid;

	    private String storename;

	    private Long brandid;

	    private String brandcnname;

	    private String brandenname;

	    private Integer status;

	    private Long userid;

	    private String sn;

	    private Date createtime;

	    private String lastremark;

	    private Long lastemployeeid;

	    private String lastemployeename;

	    private String lasttime;

	    private Long installmentid;

	    public Long getBuyertraceid() {
	        return buyertraceid;
	    }

	    public void setBuyertraceid(Long buyertraceid) {
	        this.buyertraceid = buyertraceid;
	    }

	    public String getBuyername() {
	        return buyername;
	    }

	    public void setBuyername(String buyername) {
	        this.buyername = buyername == null ? null : buyername.trim();
	    }

	    public String getMobile() {
	        return mobile;
	    }

	    public void setMobile(String mobile) {
	        this.mobile = mobile == null ? null : mobile.trim();
	    }

	    public Long getCarmodelid() {
	        return carmodelid;
	    }

	    public void setCarmodelid(Long carmodelid) {
	        this.carmodelid = carmodelid;
	    }

	    public String getCarmodelname() {
	        return carmodelname;
	    }

	    public void setCarmodelname(String carmodelname) {
	        this.carmodelname = carmodelname == null ? null : carmodelname.trim();
	    }

	    public String getSex() {
	        return sex;
	    }

	    public void setSex(String sex) {
	        this.sex = sex == null ? null : sex.trim();
	    }

	    public String getBuycityid() {
	        return buycityid;
	    }

	    public void setBuycityid(String buycityid) {
	        this.buycityid = buycityid == null ? null : buycityid.trim();
	    }

	    public String getBuycityname() {
	        return buycityname;
	    }

	    public void setBuycityname(String buycityname) {
	        this.buycityname = buycityname == null ? null : buycityname.trim();
	    }

	    public Integer getRelationstatus() {
	        return relationstatus;
	    }

	    public void setRelationstatus(Integer relationstatus) {
	        this.relationstatus = relationstatus;
	    }

	    public Long getStoreid() {
	        return storeid;
	    }

	    public void setStoreid(Long storeid) {
	        this.storeid = storeid;
	    }

	    public String getStorename() {
	        return storename;
	    }

	    public void setStorename(String storename) {
	        this.storename = storename == null ? null : storename.trim();
	    }

	    public Long getBrandid() {
	        return brandid;
	    }

	    public void setBrandid(Long brandid) {
	        this.brandid = brandid;
	    }

	    public String getBrandcnname() {
	        return brandcnname;
	    }

	    public void setBrandcnname(String brandcnname) {
	        this.brandcnname = brandcnname == null ? null : brandcnname.trim();
	    }

	    public String getBrandenname() {
	        return brandenname;
	    }

	    public void setBrandenname(String brandenname) {
	        this.brandenname = brandenname == null ? null : brandenname.trim();
	    }

	    public Integer getStatus() {
	        return status;
	    }

	    public void setStatus(Integer status) {
	        this.status = status;
	    }

	    public Long getUserid() {
	        return userid;
	    }

	    public void setUserid(Long userid) {
	        this.userid = userid;
	    }

	    public String getSn() {
	        return sn;
	    }

	    public void setSn(String sn) {
	        this.sn = sn == null ? null : sn.trim();
	    }

	    public Date getCreatetime() {
	        return createtime;
	    }

	    public void setCreatetime(Date createtime) {
	        this.createtime = createtime;
	    }

	    public String getLastremark() {
	        return lastremark;
	    }

	    public void setLastremark(String lastremark) {
	        this.lastremark = lastremark == null ? null : lastremark.trim();
	    }

	    public Long getLastemployeeid() {
	        return lastemployeeid;
	    }

	    public void setLastemployeeid(Long lastemployeeid) {
	        this.lastemployeeid = lastemployeeid;
	    }

	    public String getLastemployeename() {
	        return lastemployeename;
	    }

	    public void setLastemployeename(String lastemployeename) {
	        this.lastemployeename = lastemployeename == null ? null : lastemployeename.trim();
	    }

	    public String getLasttime() {
	        return lasttime;
	    }

	    public void setLasttime(String lasttime) {
	        this.lasttime = lasttime == null ? null : lasttime.trim();
	    }

	    public Long getInstallmentid() {
	        return installmentid;
	    }

	    public void setInstallmentid(Long installmentid) {
	        this.installmentid = installmentid;
	    }

}

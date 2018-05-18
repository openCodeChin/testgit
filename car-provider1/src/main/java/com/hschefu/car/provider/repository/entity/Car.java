package com.hschefu.car.provider.repository.entity;

import java.util.Date;

public class Car {
    private Long carid;

    private Long carmodelid;

    private String carmodelname;

    private String releasetime;

    private Double price;

    private String imageurls;

    private String registerdate;

    private Double mileage;

    private String cityid;

    private String cityname;

    private Integer status;

    private String level;

    private String examiningreport;

    private String color;

    private String audit;

    private String extrainfo;

    private Long detectorid;

    private String detectorname;

    private Long appraiserid;

    private String appraisername;

    private String carsn;

    private Long repid;

    private String repname;

    private Long buyerid;

    private String buyername;

    private Long sellerid;

    private String sellername;

    private Long salerid;

    private String salername;

    private Double appraiseprice;

    private Double vendorprice;

    private String labels;

    private String sensitive;

    private String lpncityid;

    private String lpncityname;

    private Integer belongtype;

    private Long storeid;

    private String storename;

    private Integer shelfapply;

    private Integer maintainstatus;

    private Integer bindorder;

    private Double minprice;

    private String orderid;

    private Date createtime;

    private Double lastprice;

    private Integer seenumber;

    private String appraisepricecontent;

    public Long getCarid() {
        return carid;
    }

    public void setCarid(Long carid) {
        this.carid = carid;
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

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime == null ? null : releasetime.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageurls() {
        return imageurls;
    }

    public void setImageurls(String imageurls) {
        this.imageurls = imageurls == null ? null : imageurls.trim();
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate == null ? null : registerdate.trim();
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getExaminingreport() {
        return examiningreport;
    }

    public void setExaminingreport(String examiningreport) {
        this.examiningreport = examiningreport == null ? null : examiningreport.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getAudit() {
        return audit;
    }

    public void setAudit(String audit) {
        this.audit = audit == null ? null : audit.trim();
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo == null ? null : extrainfo.trim();
    }

    public Long getDetectorid() {
        return detectorid;
    }

    public void setDetectorid(Long detectorid) {
        this.detectorid = detectorid;
    }

    public String getDetectorname() {
        return detectorname;
    }

    public void setDetectorname(String detectorname) {
        this.detectorname = detectorname == null ? null : detectorname.trim();
    }

    public Long getAppraiserid() {
        return appraiserid;
    }

    public void setAppraiserid(Long appraiserid) {
        this.appraiserid = appraiserid;
    }

    public String getAppraisername() {
        return appraisername;
    }

    public void setAppraisername(String appraisername) {
        this.appraisername = appraisername == null ? null : appraisername.trim();
    }

    public String getCarsn() {
        return carsn;
    }

    public void setCarsn(String carsn) {
        this.carsn = carsn == null ? null : carsn.trim();
    }

    public Long getRepid() {
        return repid;
    }

    public void setRepid(Long repid) {
        this.repid = repid;
    }

    public String getRepname() {
        return repname;
    }

    public void setRepname(String repname) {
        this.repname = repname == null ? null : repname.trim();
    }

    public Long getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Long buyerid) {
        this.buyerid = buyerid;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }

    public Long getSellerid() {
        return sellerid;
    }

    public void setSellerid(Long sellerid) {
        this.sellerid = sellerid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public Long getSalerid() {
        return salerid;
    }

    public void setSalerid(Long salerid) {
        this.salerid = salerid;
    }

    public String getSalername() {
        return salername;
    }

    public void setSalername(String salername) {
        this.salername = salername == null ? null : salername.trim();
    }

    public Double getAppraiseprice() {
        return appraiseprice;
    }

    public void setAppraiseprice(Double appraiseprice) {
        this.appraiseprice = appraiseprice;
    }

    public Double getVendorprice() {
        return vendorprice;
    }

    public void setVendorprice(Double vendorprice) {
        this.vendorprice = vendorprice;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    public String getSensitive() {
        return sensitive;
    }

    public void setSensitive(String sensitive) {
        this.sensitive = sensitive == null ? null : sensitive.trim();
    }

    public String getLpncityid() {
        return lpncityid;
    }

    public void setLpncityid(String lpncityid) {
        this.lpncityid = lpncityid == null ? null : lpncityid.trim();
    }

    public String getLpncityname() {
        return lpncityname;
    }

    public void setLpncityname(String lpncityname) {
        this.lpncityname = lpncityname == null ? null : lpncityname.trim();
    }

    public Integer getBelongtype() {
        return belongtype;
    }

    public void setBelongtype(Integer belongtype) {
        this.belongtype = belongtype;
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

    public Integer getShelfapply() {
        return shelfapply;
    }

    public void setShelfapply(Integer shelfapply) {
        this.shelfapply = shelfapply;
    }

    public Integer getMaintainstatus() {
        return maintainstatus;
    }

    public void setMaintainstatus(Integer maintainstatus) {
        this.maintainstatus = maintainstatus;
    }

    public Integer getBindorder() {
        return bindorder;
    }

    public void setBindorder(Integer bindorder) {
        this.bindorder = bindorder;
    }

    public Double getMinprice() {
        return minprice;
    }

    public void setMinprice(Double minprice) {
        this.minprice = minprice;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Double getLastprice() {
        return lastprice;
    }

    public void setLastprice(Double lastprice) {
        this.lastprice = lastprice;
    }

    public Integer getSeenumber() {
        return seenumber;
    }

    public void setSeenumber(Integer seenumber) {
        this.seenumber = seenumber;
    }

    public String getAppraisepricecontent() {
        return appraisepricecontent;
    }

    public void setAppraisepricecontent(String appraisepricecontent) {
        this.appraisepricecontent = appraisepricecontent == null ? null : appraisepricecontent.trim();
    }
}
package com.hschefu.car.provider.repository.entity;

import java.util.Date;

public class Brand {
    private Long brandid;

    private String brandpinyin;

    private String brandcnname;

    private String brandenname;

    private String brandimg;

    private Integer brandsort;

    private String brandnationality;

    private String brandinitial;

    private Date createtime;

    private Integer brandstatus;

    private Long manufacturerid;

    private String manufacturercnname;

    private String manufacturerenname;

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getBrandpinyin() {
        return brandpinyin;
    }

    public void setBrandpinyin(String brandpinyin) {
        this.brandpinyin = brandpinyin == null ? null : brandpinyin.trim();
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

    public String getBrandimg() {
        return brandimg;
    }

    public void setBrandimg(String brandimg) {
        this.brandimg = brandimg == null ? null : brandimg.trim();
    }

    public Integer getBrandsort() {
        return brandsort;
    }

    public void setBrandsort(Integer brandsort) {
        this.brandsort = brandsort;
    }

    public String getBrandnationality() {
        return brandnationality;
    }

    public void setBrandnationality(String brandnationality) {
        this.brandnationality = brandnationality == null ? null : brandnationality.trim();
    }

    public String getBrandinitial() {
        return brandinitial;
    }

    public void setBrandinitial(String brandinitial) {
        this.brandinitial = brandinitial == null ? null : brandinitial.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getBrandstatus() {
        return brandstatus;
    }

    public void setBrandstatus(Integer brandstatus) {
        this.brandstatus = brandstatus;
    }

    public Long getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(Long manufacturerid) {
        this.manufacturerid = manufacturerid;
    }

    public String getManufacturercnname() {
        return manufacturercnname;
    }

    public void setManufacturercnname(String manufacturercnname) {
        this.manufacturercnname = manufacturercnname == null ? null : manufacturercnname.trim();
    }

    public String getManufacturerenname() {
        return manufacturerenname;
    }

    public void setManufacturerenname(String manufacturerenname) {
        this.manufacturerenname = manufacturerenname == null ? null : manufacturerenname.trim();
    }
}
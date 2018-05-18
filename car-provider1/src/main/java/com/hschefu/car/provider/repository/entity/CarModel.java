package com.hschefu.car.provider.repository.entity;

import java.util.Date;

public class CarModel {
    private Long carmodelid;

    private String carmodelname;

    private Long brandid;

    private String brandenname;

    private String brandcnname;

    private Long carsystemid;

    private String carsystemname;

    private String carsystemcategory;

    private Long carsystemyearid;

    private String year;

    private Double price;

    private Integer seatnumber;

    private String images;

    private String gearbox;

    private String displacement;

    private String fueltype;

    private String emission;

    private Date createtime;

    private Date modifytime;

    private String configurevalue;

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

    public Long getBrandid() {
        return brandid;
    }

    public void setBrandid(Long brandid) {
        this.brandid = brandid;
    }

    public String getBrandenname() {
        return brandenname;
    }

    public void setBrandenname(String brandenname) {
        this.brandenname = brandenname == null ? null : brandenname.trim();
    }

    public String getBrandcnname() {
        return brandcnname;
    }

    public void setBrandcnname(String brandcnname) {
        this.brandcnname = brandcnname == null ? null : brandcnname.trim();
    }

    public Long getCarsystemid() {
        return carsystemid;
    }

    public void setCarsystemid(Long carsystemid) {
        this.carsystemid = carsystemid;
    }

    public String getCarsystemname() {
        return carsystemname;
    }

    public void setCarsystemname(String carsystemname) {
        this.carsystemname = carsystemname == null ? null : carsystemname.trim();
    }

    public String getCarsystemcategory() {
        return carsystemcategory;
    }

    public void setCarsystemcategory(String carsystemcategory) {
        this.carsystemcategory = carsystemcategory == null ? null : carsystemcategory.trim();
    }

    public Long getCarsystemyearid() {
        return carsystemyearid;
    }

    public void setCarsystemyearid(Long carsystemyearid) {
        this.carsystemyearid = carsystemyearid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(Integer seatnumber) {
        this.seatnumber = seatnumber;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox == null ? null : gearbox.trim();
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement == null ? null : displacement.trim();
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype == null ? null : fueltype.trim();
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission == null ? null : emission.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getConfigurevalue() {
        return configurevalue;
    }

    public void setConfigurevalue(String configurevalue) {
        this.configurevalue = configurevalue == null ? null : configurevalue.trim();
    }
}
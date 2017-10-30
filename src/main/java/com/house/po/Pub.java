package com.house.po;

import java.math.BigDecimal;
import java.util.Date;

public class Pub {
    private Integer pubid;

    private Byte pubtype;

    private String title;

    private Integer area;

    private String province;

    private String city;

    private String county;

    private String info;

    private String housetype;

    private BigDecimal price;

    private Byte pricetype;

    private String houselimit;

    private String tel;

    private String telname;

    private String image;

    private Integer userid;

    private Date inserttime;

    private Date updatetime;

    private Byte isexist;

    private String description;

    public Integer getPubid() {
        return pubid;
    }

    public void setPubid(Integer pubid) {
        this.pubid = pubid;
    }

    public Byte getPubtype() {
        return pubtype;
    }

    public void setPubtype(Byte pubtype) {
        this.pubtype = pubtype;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getHousetype() {
        return housetype;
    }

    public void setHousetype(String housetype) {
        this.housetype = housetype == null ? null : housetype.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getPricetype() {
        return pricetype;
    }

    public void setPricetype(Byte pricetype) {
        this.pricetype = pricetype;
    }

    public String getHouselimit() {
        return houselimit;
    }

    public void setHouselimit(String houselimit) {
        this.houselimit = houselimit == null ? null : houselimit.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTelname() {
        return telname;
    }

    public void setTelname(String telname) {
        this.telname = telname == null ? null : telname.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getIsexist() {
        return isexist;
    }

    public void setIsexist(Byte isexist) {
        this.isexist = isexist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
package com.house.po;

import java.util.Date;

public class Collect {
    private Integer collectid;

    private Integer userid;

    private Integer pubid;

    private Date inserttime;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPubid() {
        return pubid;
    }

    public void setPubid(Integer pubid) {
        this.pubid = pubid;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }
}
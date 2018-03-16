package com.domain;

/**
 * Created by Administrator on 2018/3/14.
 */
public class HisChargeInterface extends  RequestBean {
    private Integer id;

    private String oldid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldid() {
        return oldid;
    }

    public void setOldid(String oldid) {
        this.oldid = oldid;
    }
}

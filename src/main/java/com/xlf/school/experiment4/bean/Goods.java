package com.xlf.school.experiment4.bean;

import java.io.Serializable;

/**
 * Goods
 * <p>
 * 商品类, 用于存储商品信息
 *
 * @version v1.0.0
 * @since v1.0.0
 * @author xiao_lfeng
 */
public class Goods implements Serializable {
    private static final long serialVersionUID = 0;
    private int gid;
    private String gname;
    private double gprice;
    private int gcount;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public double getGprice() {
        return gprice;
    }

    public void setGprice(double gprice) {
        this.gprice = gprice;
    }

    public int getGcount() {
        return gcount;
    }

    public void setGcount(int gcount) {
        this.gcount = gcount;
    }
}

package com.wang.pojo;

import java.util.Date;

public class Goods {
    private int gid;
    private String goodsName;
    private double goodsPrice;
    private Date goodstime;

    public Goods() {
    }

    public Goods(int gid, String goodsName, double goodsPrice, Date goodstime) {
        this.gid = gid;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodstime = goodstime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gid=" + gid +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodstime=" + goodstime +
                '}';
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getGoodstime() {
        return goodstime;
    }

    public void setGoodstime(Date goodstime) {
        this.goodstime = goodstime;
    }
}

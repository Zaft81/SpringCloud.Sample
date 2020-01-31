package com.ddal.shopitem.entity;

import java.math.BigDecimal;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
public class ShopItem {
    private String id;
    private String title;
    private String pic;
    private String desc;
    private BigDecimal price;

    public ShopItem(){}

    public ShopItem(String id, String title, String pic, String desc, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.desc = desc;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}

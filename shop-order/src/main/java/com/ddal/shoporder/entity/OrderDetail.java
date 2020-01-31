package com.ddal.shoporder.entity;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
public class OrderDetail {
    private String orderId;
    private ShopItem shopItem;

    public OrderDetail(){}

    public OrderDetail(String orderId, ShopItem shopItem) {
        this.orderId = orderId;
        this.shopItem = shopItem;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShopItem getShopItem() {
        return shopItem;
    }

    public void setShopItem(ShopItem shopItem) {
        this.shopItem = shopItem;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", shopItem=" + shopItem +
                '}';
    }
}

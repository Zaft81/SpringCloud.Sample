package com.ddal.shoporder.entity;

import java.util.Date;
import java.util.List;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
public class Order {

    private String orderId;
    private String userId;
    private Date createDate;
    private Date updateDate;

    private List<OrderDetail> orderDetails;

    public Order(){}

    public Order(String orderId, String userId, Date createDate, Date updateDate, List<OrderDetail> orderDetails) {
        this.orderId = orderId;
        this.userId = userId;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", orderDetails=" + orderDetails +
                '}';
    }
}

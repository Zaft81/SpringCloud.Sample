package com.ddal.shoporder.service;

import com.ddal.shoporder.entity.Order;
import com.ddal.shoporder.entity.OrderDetail;
import com.ddal.shoporder.entity.ShopItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
@Service
public class OrderService {
    private static final Map<String, Order> ORDER_MAP = new HashMap<>();
    static {
        Order order = new Order();
        order.setOrderId("20200130");
        order.setUserId("user01");
        order.setCreateDate(new Date());
        order.setUpdateDate(new Date());

        List<OrderDetail> orderDetails = new ArrayList<>();
        ShopItem shopItem = new ShopItem();
        shopItem.setId("1");
        orderDetails.add(new OrderDetail(order.getOrderId(),shopItem));
        ShopItem shopItem2 = new ShopItem();
        shopItem2.setId("3");
        orderDetails.add(new OrderDetail(order.getOrderId(),shopItem2));
        ShopItem shopItem3 = new ShopItem();
        shopItem3.setId("11");
        orderDetails.add(new OrderDetail(order.getOrderId(),shopItem3));

        order.setOrderDetails(orderDetails);
        ORDER_MAP.put(order.getOrderId(),order);
    }

    @Autowired
    private ShopItemService shopItemService;

    public Order getByOrderId(String orderId) {
        Order order = ORDER_MAP.get(orderId);
        if (order == null){
            return null;
        }
        List<OrderDetail> orderDetails = order.getOrderDetails();
        orderDetails.forEach(orderDetail -> {
            ShopItem item = shopItemService.getByItemID(orderDetail.getShopItem().getId());
            if(item != null){
                orderDetail.setShopItem(item);
            }
        });
        return order;
    }
}

package com.ddal.shoporder.controller;

import com.ddal.shoporder.entity.Order;
import com.ddal.shoporder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "order/{orderId}")
    public Order getByOrderId(@PathVariable("orderId") String orderId){
        return orderService.getByOrderId(orderId);
    }
}

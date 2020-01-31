package com.ddal.shopitem.controller;

import com.ddal.shopitem.entity.ShopItem;
import com.ddal.shopitem.service.ShopItemService;
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
public class ShopItemController {
    @Autowired
    private ShopItemService shopItemService;

    @GetMapping(value="shopitem/{id}")
    public ShopItem getById(@PathVariable("id") String id){
        return shopItemService.getById(id);
    }
}

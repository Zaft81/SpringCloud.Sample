package com.ddal.shoporder.feign.fallback;

import com.ddal.shoporder.entity.ShopItem;
import com.ddal.shoporder.feign.ShopItemFeignClient;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 专门用于服务降级，集中处理ShopItemService中HystrixCommand的fallbackMethod
 * @author Ryan
 * @version 1.0
 * @date 2/8/2020
 */
public class ShopItemServiceFallback implements ShopItemFeignClient {
    @Override
    public ShopItem queryShopItemById(String id) {
        return getShopItem();
    }

    @Override
    public List<ShopItem> queryShopItemList(String title, BigDecimal price) {
        System.out.println("服务降级......");
        List<ShopItem> list = new ArrayList<>();
        list.add(getShopItem());
        return list;
    }

    @Override
    public List<ShopItem> queryShopItemList2(Map<String, Object> params) {
        System.out.println("服务降级......");
        List<ShopItem> list = new ArrayList<>();
        list.add(getShopItem());
        return list;
    }

    private ShopItem getShopItem(){
        return new ShopItem(null,"服务降级","","",null);
    }
}

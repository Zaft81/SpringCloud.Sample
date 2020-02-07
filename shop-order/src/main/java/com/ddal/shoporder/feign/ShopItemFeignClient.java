package com.ddal.shoporder.feign;

import com.ddal.shoporder.entity.ShopItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用Feign，优雅的调用rest接口
 */
@FeignClient(value="shop-item")
public interface ShopItemFeignClient {

    @RequestMapping(value = "/shopitem/{id}",method = RequestMethod.GET)
    ShopItem queryShopItemById(String id);
}

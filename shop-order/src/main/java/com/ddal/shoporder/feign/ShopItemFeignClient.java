package com.ddal.shoporder.feign;

import com.ddal.shoporder.entity.ShopItem;
import com.ddal.shoporder.feign.fallback.ShopItemServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 调用Feign，优雅的调用rest接口
 */
@FeignClient(value="shop-item",fallback = ShopItemServiceFallback.class)
public interface ShopItemFeignClient {

    /**
     * 单参数构造
     * @param id
     * @return
     */
    @RequestMapping(value = "/shopitem/{id}",method = RequestMethod.GET)
    ShopItem queryShopItemById(@PathVariable("id") String id);

    /**
     * 多参数构造：指定多个参数
     * @param title
     * @param price
     * @return
     */
    @RequestMapping(value="/shopitemlist")
    List<ShopItem> queryShopItemList(@RequestParam("title") String title, @RequestParam("price")BigDecimal price);

    /**
     * 多参数构造：通过Map指定参数
     * @param params
     * @return
     */
    @RequestMapping(value="shopitemlist2")
    List<ShopItem> queryShopItemList2(@RequestParam Map<String, Object> params);

}

package com.ddal.shopitem.entity.service;

import com.ddal.shopitem.entity.ShopItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
@Service
public class ShopItemService {

    private static final Map<String, ShopItem> ITEM_MAP = new HashMap<>();
    static {
        ITEM_MAP.put("1",new ShopItem("1","商品1","pic1","商品描述1",new BigDecimal(100)));
        ITEM_MAP.put("2",new ShopItem("2","商品2","pic2","商品描述2",new BigDecimal(200)));
        ITEM_MAP.put("3",new ShopItem("3","商品3","pic3","商品描述3",new BigDecimal(300)));
        ITEM_MAP.put("4",new ShopItem("4","商品4","pic4","商品描述4",new BigDecimal(400)));
        ITEM_MAP.put("5",new ShopItem("5","商品5","pic5","商品描述5",new BigDecimal(500)));
        ITEM_MAP.put("6",new ShopItem("6","商品6","pic6","商品描述6",new BigDecimal(600)));
        ITEM_MAP.put("7",new ShopItem("7","商品7","pic7","商品描述7",new BigDecimal(700)));
        ITEM_MAP.put("8",new ShopItem("8","商品8","pic8","商品描述8",new BigDecimal(800)));
        ITEM_MAP.put("9",new ShopItem("9","商品9","pic9","商品描述9",new BigDecimal(900)));
    }

    public ShopItem getById(String id) {
        return ITEM_MAP.get(id);
    }
}

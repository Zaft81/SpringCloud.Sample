package com.ddal.shoporder.service;

import com.ddal.shoporder.entity.ShopItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ryan
 * @version 1.0
 * @date 1/30/2020
 */
@Service
public class ShopItemService {

    //Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    public ShopItem getByItemID(String id){


//        String serviceId = "app-item";
//        List<ServiceInstance> instances = this.discoveryClient.getInstances(serviceId);
//        if(instances.isEmpty()){
//            return null;
//        }
//        // 为了演示，在这里只获取第一个实例
//        ServiceInstance serviceInstance = instances.get(0);
//        String url = serviceInstance.getHost() + ":" + serviceInstance.getPort();
//        return this.restTemplate.getForObject("http://" + url + "/item/" + id, Item.class);



        //该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced，见OrderConfig.java)
        String itemUrl = "http://shop-item/shopitem/{id}";
        return restTemplate.getForObject(itemUrl,ShopItem.class,id);
    }
}

package com.ddal.shoporder.service;

import com.ddal.shoporder.entity.ShopItem;
import com.ddal.shoporder.feign.ShopItemFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @Autowired
    private ShopItemFeignClient shopItemFeignClient;

    /**
     * HystrixCommand进行容错处理
     * fallbackMethod的方法参数的个数和类型必须与原方法保持一致
     * @param id
     * @return
     */
    //不在此处单独处理fallbackMethod，统一到ShopItemServiceFallback中处理
    //@HystrixCommand(fallbackMethod = "getByItemIDFallbackMethod")
    public ShopItem getByItemID(String id){

//        //单注册中心方式
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
        //String itemUrl = "http://shop-item/shopitem/{id}";
        //return restTemplate.getForObject(itemUrl,ShopItem.class,id);


        //以下为通过Feign方式调用
        return shopItemFeignClient.queryShopItemById(id);

    }

    /**
     * 请求失败执行的方法
     * 方法参数个数和类型必须与原方法一致
     *
     * @param id
     * @return
     */
    public ShopItem getByItemIDFallbackMethod(String id){
        return new ShopItem(id,"查询出错!",null,null,null);
    }
}

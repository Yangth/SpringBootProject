package com.scme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/2.
 */
@RestController
public class Ehcach_Cotroller {
    @Autowired
    private CacheManager cacheManager;

    @RequestMapping("clear_cach")
    public String cach_clear(){
        cacheManager.getCache("baseCache").clear();
        return "success";
    }

}

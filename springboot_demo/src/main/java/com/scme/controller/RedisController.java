package com.scme.controller;

import com.scme.service.Rediservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/15.
 */
@RestController
public class RedisController {

    @Autowired
    private Rediservice rediservice;

    @RequestMapping("setstring")
    public String setredisString(String name,String value){
        rediservice.setObject(name,value);
       String returnval=getredisString(name);
       return returnval;
    }

    @RequestMapping("getstring")
    public String getredisString(String key){
        String value=rediservice.getString(key);
        return value;
    }
}

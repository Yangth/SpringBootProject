package com.scme.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/9.
 */
@RestController
public class IndexController {
    @Value("${server.port}")
    String serverPort;

    @Value("${itmayiedu}")
    String appname;

    @RequestMapping("/")
    public String index(){
        return "this is "+serverPort;
    }

    @RequestMapping("/app")
    public String getapp(){
        return "this is "+appname;
    }
}

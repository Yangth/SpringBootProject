package com.scme.controller;

import com.scme.mapper.BlogMapper;
import com.scme.pojo.bloginfo;
import com.scme.service.Blogservice;
import com.scme.test01.service.UserServiceTest01;
import com.scme.test02.service.UserServiceTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/9.
 */
@Controller
public class BlogController {
    @Autowired
    Blogservice blogservice;

    @Autowired
    UserServiceTest01 userServiceTest01;

    @Autowired
    UserServiceTest02 userServiceTest02;

    @RequestMapping("/blog")
    public String gblog(Map<String, Object> result){
        List<bloginfo> list=blogservice.getblog();
        result.put("bloglist",list);
        return "bloglist";
    }

    @RequestMapping("/getblog")
    @ResponseBody
    public String getblog(Map<String, Object> result){
        List<bloginfo> list=blogservice.getblog();
        result.put("bloglist",list);
        return result.toString();
    }

    @RequestMapping("/insertblog")
    @ResponseBody
    public String insertblog(String title,String content, Integer id){
        return  blogservice.insertBlog(title,content,id);
    }

    @RequestMapping("/insertblog1")
    @ResponseBody
    public String insertblog1(String title,String content, String id){
        return  userServiceTest01.insertTest001(title,content,id);
    }

    @RequestMapping("/insertblog2")
    @ResponseBody
    public String insertblog2(String title,String content, Integer id){
        return  userServiceTest02.insertTest002(title,content,id);
    }
}

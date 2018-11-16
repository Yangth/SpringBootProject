package com.scme.service;

import com.scme.mapper.BlogMapper;
import com.scme.pojo.bloginfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2018/10/15.
 */
@Service
@CacheConfig(cacheNames = {"baseCache"})
public class Blogservice {
    @Autowired
    BlogMapper blogMapper;

    @Cacheable
    public List<bloginfo> getblog(){
        return  blogMapper.getblogM();
    }

    public String insertBlog(String title,String content, Integer id){
     Integer result = blogMapper.insertM(title,content,id);
     if (result>0)
         return "success";
     return "false";
    }
}

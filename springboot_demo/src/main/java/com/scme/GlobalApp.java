package com.scme;

import com.scme.datasource.DBConfig1;
import com.scme.datasource.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2018/10/9.
 */

@SpringBootApplication
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@MapperScan("com.scme.mapper")
@EnableCaching
public class GlobalApp {
    public static void main(String[] args) {
        SpringApplication.run(GlobalApp.class);
    }
}

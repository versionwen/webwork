package com.webwork;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/24 20:41
 */
@SpringBootApplication
@MapperScan("com.webwork.repository")
public class User {
    public static void main(String[] args) {
        SpringApplication.run(User.class,args);
    }
}

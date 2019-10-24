package com.webwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author version
 * @version 1.0
 * @date 2019/10/24 19:36
 */
@SpringBootApplication
@EnableEurekaServer
public class Registerapplication {
    public static void main(String[] args) {
        SpringApplication.run(Registerapplication.class,args);
    }
}

package com.zhxd.mp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Mp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mp1Application.class, args);
    }

}

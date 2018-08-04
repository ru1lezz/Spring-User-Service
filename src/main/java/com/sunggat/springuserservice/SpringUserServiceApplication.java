package com.sunggat.springuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUserServiceApplication.class, args);
    }
}

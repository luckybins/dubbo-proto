package com.example.dubbo.proto;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProtoApplication {

    public static void main(String[] args) {
        System.setProperty("dubbo.tri.builtin.service.init", "true");
        SpringApplication.run(DubboProtoApplication.class, args);
    }

}

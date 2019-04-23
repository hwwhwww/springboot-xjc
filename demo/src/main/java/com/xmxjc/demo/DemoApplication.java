package com.xmxjc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("我的第一个分支");
        SpringApplication.run(DemoApplication.class, args);
    }

}

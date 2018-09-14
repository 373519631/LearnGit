package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        User user=new User();
        user.setName("张三");
        System.out.println(user.getId()+" : "+user.getName());

        SpringApplication.run(DemoApplication.class, args);
    }


}
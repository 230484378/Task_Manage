package com.example.springboot06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan
@SpringBootApplication
public class SpringBoot06Application {

    public static void main(String[] args) {
        System.out.println("中文");
        SpringApplication.run(SpringBoot06Application.class, args);
    }

}

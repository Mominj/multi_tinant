package com.example.multi_tinant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiTinantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiTinantApplication.class, args);
        System.out.println("run...");
    }

}

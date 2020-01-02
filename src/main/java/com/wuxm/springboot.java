package com.wuxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class springboot {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(springboot.class);
        application.run(args);
    }
}

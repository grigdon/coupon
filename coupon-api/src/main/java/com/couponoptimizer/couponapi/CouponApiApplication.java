package com.couponoptimizer.couponapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Exclude database auto-configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CouponApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponApiApplication.class, args);
    }
}
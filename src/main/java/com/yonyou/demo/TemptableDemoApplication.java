package com.yonyou.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.yonyou.demo.dao")
@EnableTransactionManagement
public class TemptableDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemptableDemoApplication.class, args);
    }
}

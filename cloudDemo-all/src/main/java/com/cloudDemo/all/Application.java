package com.cloudDemo.all;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.cloudDemo",
        "com.cloudDemo.core",
        "com.cloudDemo.db",
        "com.cloudDemo.api"})
@MapperScan("com.cloudDemo.db.dao")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
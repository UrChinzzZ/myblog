package com.urchin.bg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.urchin.bg.dao")
public class BgApplication {
    public static void main(String[] args) {
        SpringApplication.run(BgApplication.class, args);
    }
}

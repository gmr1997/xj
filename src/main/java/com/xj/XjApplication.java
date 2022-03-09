package com.xj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xj.mapper")
@SpringBootApplication
public class XjApplication {

    public static void main(String[] args) {
        SpringApplication.run(XjApplication.class, args);
    }

}

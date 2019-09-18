package com.quming;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.quming.mapper")
public class QumingQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(QumingQuickApplication.class, args);
    }

}

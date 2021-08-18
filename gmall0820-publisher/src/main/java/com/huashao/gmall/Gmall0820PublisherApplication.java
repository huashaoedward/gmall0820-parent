package com.huashao.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//注解，让去该位置扫描mapper
@MapperScan(basePackages = "com.huashao.gmall.mapper")
public class Gmall0820PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Gmall0820PublisherApplication.class, args);
    }

}

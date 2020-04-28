package com.chenzhenhu.cloud.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ScaAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaAccountApplication.class, args);
    }

}

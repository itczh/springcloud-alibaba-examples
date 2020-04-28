package com.chenzhenhu.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ScaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaOrderApplication.class, args);
    }

}

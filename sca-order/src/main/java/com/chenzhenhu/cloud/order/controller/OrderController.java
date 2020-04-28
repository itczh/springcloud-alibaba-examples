package com.chenzhenhu.cloud.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author john
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/hello")
    public String hello() {
        return "hello order";
    }
}

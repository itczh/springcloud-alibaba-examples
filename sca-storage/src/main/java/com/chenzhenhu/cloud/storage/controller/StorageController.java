package com.chenzhenhu.cloud.storage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author john
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @GetMapping("/hello")
    public String hello() {
        return "storage hello";
    }
}

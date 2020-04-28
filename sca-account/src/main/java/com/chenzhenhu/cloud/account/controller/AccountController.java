package com.chenzhenhu.cloud.account.controller;

import com.chenzhenhu.cloud.account.entity.AccountEntity;
import com.chenzhenhu.cloud.account.feignclient.OrderFeignClient;
import com.chenzhenhu.cloud.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author john
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    private final OrderFeignClient orderFeignClient;

    public AccountController(AccountService accountService, OrderFeignClient orderFeignClient) {
        this.accountService = accountService;
        this.orderFeignClient = orderFeignClient;
    }

    @GetMapping("/hello")
    public String hello() {
        String orderHello = orderFeignClient.hello();
        return "account hello -> " + orderHello;
    }

    @PostMapping("/save")
    public Integer save(@RequestBody AccountEntity entity) {
        accountService.save(entity);
        return  entity.getId();
    }

    @PostMapping("/update")
    public String update(@RequestBody AccountEntity entity) {
        accountService.update(entity);
        return "已更新";
    }
}

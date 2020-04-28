package com.chenzhenhu.cloud.account.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author john
 */
@FeignClient(name = "sca-order", fallback = OrderFeignClientFallback.class)
public interface OrderFeignClient {

    @GetMapping("/order/hello")
    String hello();
}

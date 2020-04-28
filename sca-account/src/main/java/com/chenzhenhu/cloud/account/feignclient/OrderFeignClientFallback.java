package com.chenzhenhu.cloud.account.feignclient;

/**
 * @author john
 */
public class OrderFeignClientFallback implements OrderFeignClient {
    @Override
    public String hello() {
        return null;
    }
}

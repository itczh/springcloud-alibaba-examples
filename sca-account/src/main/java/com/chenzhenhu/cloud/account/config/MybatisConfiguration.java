package com.chenzhenhu.cloud.account.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author john
 */
@Configuration
@MapperScan(basePackages = "com.chenzhenhu.cloud.account.mapper")
public class MybatisConfiguration {
}

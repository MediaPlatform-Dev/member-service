package com.k1m743hyun.memberservice.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.k1m743hyun.memberservice.client")
@Configuration
public class FeignClientConfig {

}

package com.k1m743hyun.memberservice.client;

import com.k1m743hyun.memberservice.domain.dto.OrderDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order")
public interface OrderFeignClient {

    @GetMapping("/orders")
    List<OrderDto> getOrders();
}

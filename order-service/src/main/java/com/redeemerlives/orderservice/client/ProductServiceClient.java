package com.redeemerlives.orderservice.client;

import com.redeemerlives.orderservice.dto.OrderRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(
        name = "products-service",
        url = "http://localhost:8222/api/v1/products"
)
public interface ProductServiceClient {

    @PostMapping("/place-order")
    String placeOrder(@RequestBody List<OrderRequest> orderRequests);

}

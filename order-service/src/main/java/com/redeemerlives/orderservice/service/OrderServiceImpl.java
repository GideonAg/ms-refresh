package com.redeemerlives.orderservice.service;

import com.redeemerlives.orderservice.client.ProductServiceClient;
import com.redeemerlives.orderservice.dto.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final ProductServiceClient productServiceClient;

    @Override
    public String placeOrder(List<OrderRequest> orderRequests) {
        return productServiceClient.placeOrder(orderRequests);
    }
}

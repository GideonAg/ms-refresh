package com.redeemerlives.orderservice.service;

import com.redeemerlives.orderservice.dto.OrderRequest;

import java.util.List;

public interface OrderService {
    String placeOrder(List<OrderRequest> orderRequests);
}

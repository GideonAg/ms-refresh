package com.redeemerlives.orderservice.controller;

import com.redeemerlives.orderservice.dto.OrderRequest;
import com.redeemerlives.orderservice.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<String> placeOrder(@Valid @RequestBody List<OrderRequest> orderRequests) {
        return ResponseEntity.ok(orderService.placeOrder(orderRequests));
    }

}

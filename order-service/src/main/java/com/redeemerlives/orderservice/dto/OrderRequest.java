package com.redeemerlives.orderservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

@Builder
public record OrderRequest(
        @NotNull(message = "Valid product id is required")
        Integer id,

        @NotBlank(message = "Valid product name is required")
        String productName,

        @Positive(message = "Quantity should be above zero")
        Integer quantity
) {
}

package com.lakshmispring.product_service.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductResponse {

    private String productId;
    private String productName;
    private String description;
    private BigDecimal price;

}

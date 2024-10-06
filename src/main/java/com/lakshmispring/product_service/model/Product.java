package com.lakshmispring.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {


    private String productId;
    private String productName;
    private String description;
    private BigDecimal price;

}

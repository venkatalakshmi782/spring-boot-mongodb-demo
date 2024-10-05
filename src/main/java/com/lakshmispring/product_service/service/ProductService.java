package com.lakshmispring.product_service.service;

import com.lakshmispring.product_service.dto.ProductRequest;
import com.lakshmispring.product_service.dto.ProductResponse;
import com.lakshmispring.product_service.model.Product;
import com.lakshmispring.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;



    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice()).build();
        productRepository.save(product);
        log.info("Product " +product.getProductId()+"is saved");
    }

    public List<ProductResponse> getAllProducts(){
      List<Product>  productList = productRepository.findAll();

    return  productList.stream().map(this::mapToProductResponse).collect(Collectors.toList());
    }

    public ProductResponse mapToProductResponse(Product product){
      return  ProductResponse.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .description(product.getDescription()).build();

    }
}

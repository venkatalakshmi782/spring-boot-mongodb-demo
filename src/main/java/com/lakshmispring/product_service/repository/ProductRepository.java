package com.lakshmispring.product_service.repository;

import com.lakshmispring.product_service.model.Product;


import java.util.ArrayList;
import java.util.List;

public interface ProductRepository  {

    public default void save(Product product){
      System.out.println("product saved");
    }

    public default List<Product> findAll(){
        List<Product> productList = new ArrayList<>();

        Product product = new Product();
        product.setProductId("101");
        product.setProductName("Iphone13");
        productList.add(product);
        return productList;
    }
}

package com.mu.graphql.service;

import com.mu.graphql.dto.ProductDto;
import com.mu.graphql.input.ProductInput;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductDto> findAllProduct();
    ProductDto findByProduct(String code);
    List<ProductDto> insertProduct(ProductInput dto);
}

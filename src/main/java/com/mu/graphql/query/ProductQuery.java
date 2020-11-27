package com.mu.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mu.graphql.dto.ProductDto;
import com.mu.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQuery implements GraphQLQueryResolver {

    @Autowired
    private ProductService productService;

    public List<ProductDto> findAllProduct(){
        return productService.findAllProduct();
    }

    public ProductDto findByProduct(String code){
        return productService.findByProduct(code);
    }

}

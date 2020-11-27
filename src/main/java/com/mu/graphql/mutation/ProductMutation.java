package com.mu.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mu.graphql.dto.ProductDto;
import com.mu.graphql.input.ProductInput;
import com.mu.graphql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMutation implements GraphQLMutationResolver {

    @Autowired
    private ProductService productService;

    public List<ProductDto> insertProduct(ProductInput input){
        return productService.insertProduct(input);
    }
}

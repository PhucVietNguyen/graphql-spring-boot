package com.mu.graphql.service.impl;

import com.mu.graphql.dto.ProductDto;
import com.mu.graphql.input.ProductInput;
import com.mu.graphql.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDto> findAllProduct() {
        List<ProductDto> list = getListProduct();
        return list;
    }

    @Override
    public ProductDto findByProduct(String code) {
        List<ProductDto> list = getListProduct();
        for(ProductDto dto : list){
            if(dto.getCode().equals(code))
                return dto;
        }
        return null;
    }

    @Override
    public List<ProductDto> insertProduct(ProductInput input) {
        ProductDto dto = new ProductDto(input.getCode(),input.getName(), input.getTotal());
        List<ProductDto> list = getListProduct();
        list.add(dto);
        return list;
    }

    List<ProductDto> getListProduct(){
        List<ProductDto> list = new ArrayList<>();
        ProductDto dto1 = new ProductDto("code1", "Sony",10);
        ProductDto dto2 = new ProductDto("code2", "Toshiba",7);
        ProductDto dto3 = new ProductDto("code3", "Honda",1);
        list.add(dto1);
        list.add(dto2);
        list.add(dto3);
        return list;
    }
}

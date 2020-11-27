package com.mu.graphql.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProductDto implements Serializable {

    private String code;
    private String name;
    private Integer total;
}

package com.mu.graphql.input;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class ProductInput implements Serializable {

    private String code;
    private String name;
    private Integer total;
}

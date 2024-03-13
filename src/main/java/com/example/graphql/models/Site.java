package com.example.graphql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Site {

    private String id;
    private String description;
    private List<Product> products;

}

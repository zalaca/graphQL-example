package com.example.graphql.resolvers;

import com.example.graphql.models.Product;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductQueryResolver implements GraphQLQueryResolver {

    private final List<Product> products = Arrays.asList(
            new Product("1", "Laptop", 1000.00),
            new Product("2", "Smartphone", 800.00),
            new Product("3", "Tablet", 500.00)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(String id) {
        Product result = null;
        for (Product product : products) {
            if (product.getId().equals(id)) {
                result =  product;
            }
        }
        return result;
    }
}
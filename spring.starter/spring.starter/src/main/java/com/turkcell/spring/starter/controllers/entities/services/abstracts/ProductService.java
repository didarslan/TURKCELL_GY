package com.turkcell.spring.starter.controllers.entities.services.abstracts;

import com.turkcell.spring.starter.controllers.entities.Product;

import java.util.List;

public interface ProductService
{
    void add(Product product);
    List<Product> getAll();
}

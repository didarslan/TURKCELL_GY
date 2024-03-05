package com.turkcell.spring.starter.controllers.entities.repositories.abstracts;

import com.turkcell.spring.starter.controllers.entities.Product;

import java.util.List;

public interface ProductRepository
{
    void add(Product product);
    List<Product> getAll();

}

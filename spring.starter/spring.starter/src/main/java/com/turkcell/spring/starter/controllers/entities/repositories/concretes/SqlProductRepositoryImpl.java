package com.turkcell.spring.starter.controllers.entities.repositories.concretes;

import com.turkcell.spring.starter.controllers.entities.Product;
import com.turkcell.spring.starter.controllers.entities.repositories.abstracts.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class SqlProductRepositoryImpl implements ProductRepository
{
    private List<Product> productList = new ArrayList<>();
    @Override
    public void add(Product product)
    {
        productList.add(product);


    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}

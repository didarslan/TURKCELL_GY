package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.controllers.entities.Product;
import com.turkcell.spring.starter.controllers.entities.services.abstracts.ProductService;
import com.turkcell.spring.starter.controllers.entities.services.concretes.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
// Endpoint Yönetir
@RestController
@RequestMapping("/api/products")
public class ProductsController
{
    // Dependency Injection

    @Autowired //Alani bagimlilik listesinden coz
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void add(@RequestBody Product product)
    {
        // Business Flow
        productService.add(product);
    }

    @GetMapping
    public List<Product> get()
    {

        return productService.getAll();
    }

}

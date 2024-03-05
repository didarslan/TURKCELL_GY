package com.turkcell.spring.starter.controllers.entities.repositories.concretes;

// Veri erişimini yönet
// deneme
import com.turkcell.spring.starter.controllers.entities.Product;
import com.turkcell.spring.starter.controllers.entities.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductRepositoryImpl implements ProductRepository
{
    private ProductRepository productRepository;

    public ProductRepositoryImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public void add(Product product)
    {
        if(product.getUnitPrice() < 0)
            throw new RuntimeException("Urunun fiyati 0'dan kucuk olamaz.");
        productRepository.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}

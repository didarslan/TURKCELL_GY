package com.turkcell.spring.starter.controllers.entities.services.concretes;

import com.turkcell.spring.starter.controllers.entities.Product;
import com.turkcell.spring.starter.controllers.entities.services.abstracts.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService
{
    // İş akışını yönet

    @Override
    public void add(Product product)  // Is akisini yonet, Gerekli durumda DataAccess'e pasla.
    {
        if (product.getUnitPrice() < 0)
            throw new RuntimeException("Urun fiyati sifirdan kucuk olamaz.");
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}

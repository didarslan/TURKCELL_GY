package org.example.dependencyinjection;

import org.example.dependencyinjection.logging.BaseLogger;
import org.example.dependencyinjection.logging.DatabaseLogger;
import org.example.dependencyinjection.logging.FileLogger;
import org.example.dependencyinjection.logging.Logger;

public class Main
{
    public static void main(String[] args)
    {
        ProductRepository productRepository = new MongoDbProductRepository();
        ProductRepository productRepository1 = new MySqlProductRepository();

        BaseLogger fileLogger = new FileLogger();
        BaseLogger dbLogger = new DatabaseLogger();

        //Loose-coupling
        ProductService productService = new ProductServiceImpl(productRepository, fileLogger); //MySql
        productService.add();

        ProductService productService1 = new ProductServiceImpl(productRepository1, dbLogger); //Mongodb
        productService1.add();
    }
}

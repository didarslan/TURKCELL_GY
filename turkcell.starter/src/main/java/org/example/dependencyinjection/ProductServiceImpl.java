package org.example.dependencyinjection;

import org.example.dependencyinjection.logging.BaseLogger;
import org.example.dependencyinjection.logging.Logger;

public class ProductServiceImpl implements ProductService
{
    ProductRepository productRepository;
    //Urun ekleme isleminin validasyon, is kurallari
    // Repository => Urun ekleme isleminin veritabani kismi
    BaseLogger logger;
    //CTOR
    public ProductServiceImpl(ProductRepository productRepository, Logger logger) {

        this.productRepository = productRepository;
        this.logger = (BaseLogger) logger;
    }

    @Override
    public void add() {
        System.out.println("Servis islemleri bitti, repository islemleri basliyor..");
        // Repository nesnesi = Bagimlilik
        productRepository.addtoDb();
        logger.logMessage("Add islemi loglandi.");

        MySqlProductRepository mySqlProductRepository = new MySqlProductRepository();
        mySqlProductRepository.addtoDb();

    }
}

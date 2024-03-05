package org.example.dependencyinjection;

public class MySqlProductRepository implements ProductRepository
{

    @Override
    public void addtoDb() {
        System.out.println("Mysql veritabanina ürün ekleniyor ");
    }
}

package org.example.dependencyinjection;

public class MongoDbProductRepository implements ProductRepository
{

    @Override
    public void addtoDb() {
        System.out.println("Mongodb veritabanina urun ekleniyor..");
    }
}

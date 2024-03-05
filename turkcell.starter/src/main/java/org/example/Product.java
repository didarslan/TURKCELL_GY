package org.example;

// Access Modifiers
public class Product
{
    //Constructor = CTOR
    //Eger hiç CTOR tanımı yoksa no-argument ctor default olarak tanımlıdır
    public Product()
    {
        System.out.println("Bos CTOR çalıştı");
    }
    // Argüman almayan yapı => noargsCtor

    public Product(int number)
    {
        System.out.println("Number gönderilen CTOR çalıştı");
    }

    public Product(String name, double unitPrice, boolean onSale, double salePercentage)
    {
        // this. => class'in genelini (kendisini) ifade eder
        this.name = name;
        this.unitPrice = unitPrice;
        this.onSale = onSale;
        this.salePercentage = salePercentage;
    }
    // Argümanları içeren yapı => allArgsCtor

    //Encapsulation: Verilere direkt erisimi kisitlayip okuma/yazma erisimi olarak ayirmak
    String name;
    double unitPrice;
    boolean onSale;
    double salePercentage;

    //Getter-Setter Methods:
    //Getter method: Bir property'nin okunmasi icin kullanilan method
    //Setter: Bir property'nin yazilmasi icin kullanilan method
    //read-only / write-only

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if(name.length() < 3) return;
        this.name=name;
    }

    public void buy()
    {
        System.out.println(name+"Urun satildi");
    }
}


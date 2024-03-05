package org.example;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Variables
        //type-safe
        String metin = "Merhaba, Turkcell";
        System.out.println(metin);

        metin ="Merhaba, Turkcell 2";
        System.out.println(metin);

        int ogrenciSayisi=45;
        double ogrenciNotOrtalamasi=50.5;
        boolean dersBitti = false;

        // Value Type
        int ogrenciSayisi2 = ogrenciSayisi; // deger atamasi
        ogrenciSayisi2 = ogrenciSayisi2 + 10;
        System.out.println(ogrenciSayisi2);
        System.out.println(ogrenciSayisi);

        System.out.println("****************");

        int[] ogrenciNotlari = {45, 50, 55, 60, 65,70};
        int[] ogrenciNotlari2 = ogrenciNotlari;
        ogrenciNotlari2[0]=100;

        // Set
        // Reference Type
        for (int i = 0; i < ogrenciNotlari.length ; i++) {
            System.out.println(ogrenciNotlari[i]);
        }
        System.out.println(ogrenciNotlari);
        System.out.println(ogrenciNotlari2);

        System.out.println("****************");

        //Karsilastirma Operatorleri

        int not = 50 ;
        if(not<50) //true
        {
            System.out.println("Gecti");
        }
        else if (not==50)
        {
            System.out.println("Sinirdan gecti");
        }
        else
        {
            System.out.println("Kaldi");
        }

        System.out.println("****************");

        //OOP
        //OOP Concepts

        // instance

        Product product1 = new Product();
        product1.setName("Laptop");
        product1.onSale=true; //write-get
        product1.salePercentage=5;
        product1.unitPrice=50;
        product1.buy();

        System.out.println(product1.getName()); //read-get

        Product product3 = new Product("Klavye", 500, false, 0);

        CorporateCustomer corporateCustomer = new CorporateCustomer();

        IndividualCustomer individualCustomer = new IndividualCustomer();

        corporateCustomer.setCustomerNo("ABC");
        corporateCustomer.setTaxNo("123");

        individualCustomer.setCustomerNo("GHJ");
        individualCustomer.setNationalityId("456");

        //Customer individualCustomer2 = new IndividualCustomer();
        CustomerService customerService = new CustomerService();
        customerService.add();
        customerService.update();
        customerService.add();
        customerService.add();
        customerService.add();
        customerService.add();

    }
}
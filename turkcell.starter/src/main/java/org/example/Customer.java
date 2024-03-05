package org.example;

//CamelCase
public class Customer
{
    // Inheritance => Kalitim, Miras
    private String customerNo;
    private String nationalityId; //bireysel musteri
    private String taxNo; //kurumsal musteri

    public String getCustomerNo()
    {
        return customerNo;
    }

    public void setCustomerNo(String customerNo)
    {
        this.customerNo = customerNo;
    }
}

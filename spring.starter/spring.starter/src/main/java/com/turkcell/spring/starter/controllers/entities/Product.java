package com.turkcell.spring.starter.controllers.entities;

// Model tanımını yönetir
public class Product
{
    private int id;
    private String name;
    private double unitPrice;
    private int stock;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

// Event-Driven Development
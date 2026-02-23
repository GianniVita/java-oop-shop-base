package org.lessons.java.shop;



import java.util.Random;

public class Product {

    private final int code;
    private String name;
    private String brand;
    private double price;
    private double vat;

    public Product(int code,String name, String brand, double price, double vat) {
        Random rand = new Random();
        this.code = rand.nextInt(999999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

}
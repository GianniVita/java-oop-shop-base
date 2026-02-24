package org.lessons.java.shop;



import java.util.Random;

public class Product {

    private final int code;
    private String name;
    private String brand;
    private double price;
    private double vat;

    Product(int code,String name, String brand, double price, double vat) {
        Random rand = new Random();
        this.code = rand.nextInt(999999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    public int getCode(){
        return code;
    }

    public String getName(){
        return name;
    }

    public String getBrand(){
        return brand;
    }
    
    public double getPrice() {
        return price;
    }
    public double getVat(){
        return vat;
     }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setVat(double vat){
        this.vat = vat;
    }

}
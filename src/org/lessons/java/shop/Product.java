package org.lessons.java.shop;





public class Product {

    private int code;
    private String name;
    private String brand;
    private double price;
    private double vat;

    public Product(int code,String name, String brand, double price, double vat) {
        
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    public Product(String name, String brand, double price, double vat){
        this((int)(Math.random()*999999),name,brand,price,vat);
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
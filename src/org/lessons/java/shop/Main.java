package org.lessons.java.shop;



public class Main {
    public static void main(String[] args) {

        Product reformer = new Product(0,"Pilates Premium Reformer", "BASI Pilates", 1.990, 0.22 );

        System.out.println(reformer.getCode());
        System.out.println(reformer.getName());
        System.out.println(reformer.getBrand());
        System.out.println(reformer.getPrice());
        System.out.println(reformer.getVat());

    }
}

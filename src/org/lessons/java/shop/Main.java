package org.lessons.java.shop;



public class Main {
    public static void main(String[] args) {

        Product Reformer = new Product("Pilates Premium Reformer", "BASI Pilates", 1.990, 0.22 );

        System.out.println(Reformer.getCode());
        System.out.println(Reformer.getName());
        System.out.println(Reformer.getBrand());
        System.out.println(Reformer.getPrice());
        System.out.println(Reformer.getVat());

    }
}

package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

         Product Reformer = new Product("Reformer",
        
        "The Pilates Reformer is a specialized machine featuring a sliding carriage, springs, ropes, and a pulley system designed to provide resistance and support for a full-body, low-impact workout.", 
        new double(1599.00),
        new double(0.22));
        
    System.out.println(Reformer.getFullProductName());
    System.out.println(Reformer.getPriceNoVat());
    System.out.println(Reformer.getPriceWithVat());


    }
}

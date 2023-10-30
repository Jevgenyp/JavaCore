package org.Lesson4.hw.hw2;


import static org.Lesson4.hw.hw2.Shop.purchase;

public class Main {
    public static void main(String[] args) {
        int successfulOrders = 0;

        try {
            purchase("John", "Laptop", 2);
            successfulOrders++;
        } catch (Exception e) {
            System.out.println("Purchase error: " + e.getMessage());
        }

        try {
            purchase("Jane", "Mouse", 3);
            successfulOrders++;
        } catch (Exception e) {
            System.out.println("Purchase error: " + e.getMessage());
        }

        System.out.println("Total successful purchases: " + successfulOrders);
    }
}
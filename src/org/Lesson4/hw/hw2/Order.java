package org.Lesson4.hw.hw2;

class Order {
    Customer customer;
    Product product;
    int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}

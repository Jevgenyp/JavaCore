package org.Lesson4.hw.hw2;

class Shop {
    static Customer[] customers = {
            new Customer("John"),
            new Customer("Jane")
    };

    static Product[] products = {
            new Product("Laptop", 1000.0),
            new Product("Mouse", 20.0)
    };

    static Order[] orders = new Order[10];

    public static Order purchase(String customerName, String productName, int quantity) throws Exception {
        Customer customer = null;
        Product product = null;

        for (Customer c : customers) {
            if (c.name.equals(customerName)) {
                customer = c;
                break;
            }
        }

        for (Product p : products) {
            if (p.productName.equals(productName)) {
                product = p;
                break;
            }
        }

        if (customer == null) {
            throw new Exception("Customer not found");
        }

        if (product == null) {
            throw new Exception("Product not found");
        }

        if (quantity <= 0) {
            throw new Exception("Invalid quantity");
        }

        Order order = new Order(customer, product, quantity);
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                break;
            }
        }

        return order;
    }
}

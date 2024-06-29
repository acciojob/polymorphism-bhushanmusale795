package com.driver;

// Main.java

// Main.java

// Main.java

// Main.java

// Main.java

// Main.java

// Main.java

// Main.java

public class Main {

    // Nested class Product
    public static class Product {
        // Member variables
        private int productId;
        private String productName;
        private double price;

        // Constructor
        public Product(int productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        // Getter and Setter methods
        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    // Method to calculate product of two integers
    public int product(int x, int y) {
        return x * y;
    }

    // Overloaded method to calculate product of two doubles
    public double product(double x, double y) {
        return x * y;
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of Product called p
        Product p = new Product(1, "Laptop", 999.99);

        // Using getter methods to retrieve information
        System.out.println("Product ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getProductName());
        System.out.println("Product Price: $" + p.getPrice());

        // Calling the product methods using p
        Main main = new Main();

        // Call the product method for two integers
        int result1 = main.product(5, 7);
        System.out.println("Product of 5 and 7 (integers) is: " + result1);

        // Call the overloaded product method for two doubles
        double result2 = main.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 (doubles) is: " + result2);
    }
}

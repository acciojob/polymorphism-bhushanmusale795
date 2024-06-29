package com.driver;

// Main class containing the Product class
public class Main {

    // Inner class Product
    public static class Product {

        // Method to calculate product of two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Overloaded method to calculate product of three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Overloaded method to calculate product of two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }

    // Main method to demonstrate polymorphism
    public static void main(String[] args) {
        // Task 2: Create an object of Product
        Product p = new Product();

        // Task 3: Call method product(int x, int y) from Product class object p
        int result1 = p.product(5, 7);
        System.out.println("Product of 5 and 7 (integers): " + result1);

        // Task 4: Call method product(int x, int y, int z) from Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 (integers): " + result2);

        // Task 5: Call method product(double x, double y) from Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 (doubles): " + result3);
    }
}

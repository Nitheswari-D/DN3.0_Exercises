package ecommerceplatform;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create products with new values
        Product[] products = {
            new Product("P101", "Washing Machine", "Home Appliances"),
            new Product("P102", "Refrigerator", "Home Appliances"),
            new Product("P103", "Microwave Oven", "Kitchen Appliances"),
            new Product("P104", "Air Conditioner", "Home Appliances"),
            new Product("P105", "Blender", "Kitchen Appliances")
        };

        // Sort the products array for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        // Linear Search
        Product linearResult = LinearSearch.linearSearch(products, "P103");
        System.out.println("Linear Search Result: " + (linearResult != null ? linearResult : "Product not found"));

        // Binary Search
        Product binaryResult = BinarySearch.binarySearch(products, "P103");
        System.out.println("Binary Search Result: " + (binaryResult != null ? binaryResult : "Product not found"));
    }
}

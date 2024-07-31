package inventory;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product(1, "Product 1", 10, 99.99);
        Product product2 = new Product(2, "Product 2", 5, 49.99);
        Product product3 = new Product(3, "Product 3", 20, 19.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("Initial inventory:");
        inventory.displayProducts();

        product1.setPrice(89.99);
        inventory.updateProduct(product1);
        System.out.println("\nInventory after updating product 1:");
        inventory.displayProducts();

        inventory.deleteProduct(2);
        System.out.println("\nInventory after deleting product 2:");
        inventory.displayProducts();
    }
}


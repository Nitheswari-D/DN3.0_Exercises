package ecommerceplatform;

public class LinearSearch {
    public static Product linearSearch(Product[] products, String targetId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetId)) {
                return product;
            }
        }
        return null; // If product is not found
    }
}

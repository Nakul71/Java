import ecommerce.Product;  

public class L6q4 {
    public static void main(String[] args) {
        Product product = new Product("Ipad", 1500.0, 10);

        product.getProductDetails();

        product.showProfit();
    }
}

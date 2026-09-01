public class Calculator {
    public static void main(String[] args) {
        int quantity = 5;
        double price = 19.99;
        boolean inStock = true;
        char category = 'A';
        String productName = "Notebook";

        System.out.println(
                "Product: " + productName +
                        ", price: " + price +
                        ", quantity: " + quantity +
                        ", in stock: " + inStock +
                        ", category: " + category
        );
    }
}
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

        System.out.println("Total 1: " + calculateTotal(20.0, 2));
        System.out.println("Total 2: " + calculateTotal(20.0, 10));
        System.out.println("Total 3: " + calculateTotal(15.5, 12));
        System.out.println("Total 4: " + calculateTotal(-5.0, 3));
    }

    public static double calculateTotal(double price, int quantity) {

        if (price < 0 || quantity < 0) {
            System.out.println("Warning: price or quantity cannot be negative.");
            return 0;
        }

        double total = price * quantity;

        if (quantity >= 10) {
            total = total * 0.90;
        }

        return total;
    }
}
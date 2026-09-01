import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupery", 96);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 432);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book book : books) {
            System.out.println(book.describe());
        }

        int countOver300 = 0;

        for (Book book : books) {
            if (book.getPages() > 300) {
                countOver300++;
            }
        }

        System.out.println(
                "Books with more than 300 pages: " + countOver300
        );



        Map<String, Integer> stock = new HashMap<>();

        stock.put("1984", 5);
        stock.put("The Hobbit", 3);
        stock.put("The Little Prince", 7);
        stock.put("Pride and Prejudice", 4);

        System.out.println(
                "Copies of The Hobbit: " + stock.get("The Hobbit")
        );

        System.out.println("Book stock:");

        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }

        int totalCopies = 0;

        for (int copies : stock.values()) {
            totalCopies += copies;
        }

        System.out.println("Total number of copies: " + totalCopies);
    }
}
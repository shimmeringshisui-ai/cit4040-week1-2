import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Books with more than 300 pages: " + countOver300);
    }
}
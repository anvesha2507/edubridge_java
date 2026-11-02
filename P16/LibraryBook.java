package P16;
public class LibraryBook {
    String title;
    String author;
    double price;

    static int bookCount = 0;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    static void displayBookCount() {
        System.out.println("Total Books: " + bookCount);
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs." + price);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Harry Potter", "J.K. Rowling", 500);
        LibraryBook b2 = new LibraryBook("The Alchemist", "Paulo Coelho", 350);

        b1.display();
        b2.display();

        LibraryBook.displayBookCount();
    }
}

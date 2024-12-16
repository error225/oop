import java.util.Scanner;


class Publication {
    String title;
    int price, copies;

    
    public Publication(String title, int price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    
    void saleCopy() {
        System.out.println("Total Sale of " + title + " : " + (price * copies));
    }
}


class Book extends Publication {
    String author;

    
    public Book(String title, int price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    
    @Override
    void saleCopy() {
        System.out.println("Total Sale of Book '" + title + "' by " + author + ": " + (price * copies));
    }

    // Method to order additional copies of the book
    void orderCopies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of copies ordered for the book: ");
        copies = sc.nextInt();
    }
}

// Magazine class extending Publication, implementing saleCopy() and orderQty()
class Magazine extends Publication {

    // Constructor for Magazine-specific properties
    public Magazine(String title, int price, int copies) {
        super(title, price, copies);
    }

    // Override saleCopy() for Magazine-specific logic
    @Override
    void saleCopy() {
        System.out.println("Total Sale of Magazine '" + title + "': " + (price * copies));
    }

    // Method to order additional copies of the magazine
    void orderQty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of copies ordered for the magazine: ");
        copies = sc.nextInt();
    }
}

public class Store {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Test the Book class
        System.out.println("Enter details for the Book: ");
        System.out.print("Title: ");
        String bookTitle = sc.nextLine();
        System.out.print("Price: ");
        int bookPrice = sc.nextInt();
        System.out.print("Copies: ");
        int bookCopies = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Author: ");
        String bookAuthor = sc.nextLine();

        // Create a Book object and order copies
        Book book = new Book(bookTitle, bookPrice, bookCopies, bookAuthor);
        book.orderCopies();  // Order more copies for the book
        book.saleCopy();     // Calculate and display the total sale for the book

        // Test the Magazine class
        System.out.println("\nEnter details for the Magazine: ");
        System.out.print("Title: ");
        String magazineTitle = sc.nextLine();
        System.out.print("Price: ");
        int magazinePrice = sc.nextInt();
        System.out.print("Copies: ");
        int magazineCopies = sc.nextInt();

        // Create a Magazine object and order copies
        Magazine magazine = new Magazine(magazineTitle, magazinePrice, magazineCopies);
        magazine.orderQty();  // Order more copies for the magazine
        magazine.saleCopy();  // Calculate and display the total sale for the magazine
        
        sc.close(); // Close the scanner object
    }
}

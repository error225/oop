// Title: Polymorphism 

// Aim: Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, 
// Copies are common instance variables and saleCopy is common method. The differences are, Book class has 
// author and orderCopies(). Magazine Class has orderQty. Write a program to find how many copies of the given 
// books are ordered and display total sale of publication.

class Publication {
    public String title;
    public double price;
    public int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public double saleCopy(int numberOfCopies) {
        return price * numberOfCopies;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Copies: " + copies);
    }
}

class Book extends Publication {
    private String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int numberOfCopies) {
        this.copies += numberOfCopies;
        System.out.println(numberOfCopies + " copies of the book ordered.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class Magazine extends Publication {
    private int orderQty;

    public Magazine(String title, double price, int copies, int orderQty) {
        super(title, price, copies);
        this.orderQty = orderQty;
    }

    public void orderQty(int quantity) {
        this.orderQty += quantity;
        this.copies += quantity;
        System.out.println(quantity + " copies of the magazine ordered.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Order Quantity: " + orderQty);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        
        Book book = new Book("Java Programming", 500.0, 50, "John Doe");
        Magazine magazine = new Magazine("Tech Monthly", 150.0, 30, 10);

        book.displayDetails();
        System.out.println("Sale of 10 copies: Rs." + book.saleCopy(10));
        book.orderCopies(20);
        System.out.println("Total copies after order: " + book.copies);

        System.out.println();

        magazine.displayDetails();
        System.out.println("Sale of 5 copies: Rs." + magazine.saleCopy(5));
        magazine.orderQty(15);
        System.out.println("Total copies after order: " + magazine.copies);

        System.out.println();

        double totalSale = book.saleCopy(book.copies) + magazine.saleCopy(magazine.copies);
        System.out.println("Total Sale of Publication: Rs." + totalSale);
    }
}

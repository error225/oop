import java.util.Scanner;

class Publication {
    public String title;
    public double price;
    public int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    public double saleCopy(int copiesSold) {
        return copiesSold * price;
    }
}

class Book extends Publication {
    public String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public void orderCopies(int copiesOrdered) {
        copies += copiesOrdered;
        System.out.println(copiesOrdered + " copies of book ordered. Total copies: " + copies);
    }
}

class Magazine extends Publication {
    public Magazine(String title, double price, int copies) {
        super(title, price, copies);
    }

    public void orderQty(int qtyOrdered) {
        copies += qtyOrdered;
        System.out.println(qtyOrdered + " copies of magazine ordered. Total copies: " + copies);
    }
}

public class TwoPublication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Book instance
        System.out.println("Enter Book details (title, price, copies, author):");
        Book book = new Book(sc.next(), sc.nextDouble(), sc.nextInt(), sc.next());

        // Create Magazine instance
        System.out.println("Enter Magazine details (title, price, copies):");
        Magazine magazine = new Magazine(sc.next(), sc.nextDouble(), sc.nextInt());

        // Order copies for Book
        System.out.print("Enter number of book copies to order: ");
        book.orderCopies(sc.nextInt());

        // Order quantity for Magazine
        System.out.print("Enter number of magazine copies to order: ");
        magazine.orderQty(sc.nextInt());

        // Display total sales
        System.out.print("Enter number of book copies sold: ");
        int bookSold = sc.nextInt();
        double bookSales = book.saleCopy(bookSold);
        
        System.out.print("Enter number of magazine copies sold: ");
        int magazineSold = sc.nextInt();
        double magazineSales = magazine.saleCopy(magazineSold);

        System.out.println("\nTotal Sales:");
        System.out.println("Book Sales: $" + bookSales);
        System.out.println("Magazine Sales: $" + magazineSales);

        sc.close();
    }
}

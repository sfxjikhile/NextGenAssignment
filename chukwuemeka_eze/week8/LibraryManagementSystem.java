package week8;

class Book {
    private String authorName;
    private String title;
    private double price;
    private int numberOfPages;
    private int stock;

    public Book(String authorName, String title, double price, int numberOfPages, int stock) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.stock = stock;
    }

    public void displayDetails() {
        System.out.println("Author Name: " + authorName);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Stock: " + stock);
    }
}

class SoftwareBook extends Book {
    private String softwareVersion;
    private String softwareName;

    public SoftwareBook(String authorName, String title, double price, int numberOfPages, int stock,
                        String softwareVersion, String softwareName) {
        super(authorName, title, price, numberOfPages, stock);
        this.softwareVersion = softwareVersion;
        this.softwareName = softwareName;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Software Version: " + softwareVersion);
        System.out.println("Software Name: " + softwareName);
    }
}

class HardwareBook extends Book {
    private String hardwareCategory;
    private String publisher;

    public HardwareBook(String authorName, String title, double price, int numberOfPages, int stock,
                        String hardwareCategory, String publisher) {
        super(authorName, title, price, numberOfPages, stock);
        this.hardwareCategory = hardwareCategory;
        this.publisher = publisher;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hardware Category: " + hardwareCategory);
        System.out.println("Publisher: " + publisher);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        SoftwareBook softwareBook = new SoftwareBook("John Doe", "Introduction to Java", 39.99, 500, 10, "1.2.3", "Java Programming");
        HardwareBook hardwareBook = new HardwareBook("Jane Smith", "Computer Hardware Fundamentals", 49.99, 400, 5, "Computer Science", "ABC Publishing");

        System.out.println("Software Book Details:");
        softwareBook.displayDetails();

        System.out.println("\nHardware Book Details:");
        hardwareBook.displayDetails();
    }
}


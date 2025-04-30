public class Book {
    String title;
    String author;
    String ISBN;
    String publicationDate;
    String publisher;
    boolean available;

    public Book(String title, String author, String ISBN, String publicationDate, String publisher) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " has been returned.");
    }

    public boolean isAvailable() {
        return available;
    }

    public void display() {
        System.out.println("Book Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("ISBN : " + ISBN);
        System.out.println("Publication Date : " + publicationDate);
        System.out.println("Publisher : " + publisher);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }
}
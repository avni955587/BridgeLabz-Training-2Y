package thisfinal;

class Book {
  
    private static String libraryName = "City Central Library";

    
    private final String isbn;

    private String title;
    private String author;


    Book(String title, String author, String isbn) {
        this.title = title;    
        this.author = author;
        this.isbn = isbn;       
    }

  
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

  
    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + isbn);
        System.out.println("---------------------------");
    }

   
    public String getIsbn() {
        return isbn;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        
        Book.displayLibraryName();
        System.out.println();

        
        Book book1 = new Book("The Java Handbook", "Patrick Naughton", "ISBN-001");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "ISBN-002");

       
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        if (book2 instanceof Book) {
            book2.displayDetails();
        }

        
        System.out.println("Unique ISBN of book1: " + book1.getIsbn());
    }
}

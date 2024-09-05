import java.util.Scanner;

class Book {
   
    String title;
    String author;
    int edition;

    
    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

   
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }
}

public class Main {
    public static void main(String[] args) {
      
        Book[] books = new Book[6];
        books[0] = new Book("Effective Java", "Joshua Bloch", 3);
        books[1] = new Book("Clean Code", "Robert C. Martin", 1);
        books[2] = new Book("The Pragmatic Programmer", "Andrew Hunt", 2);
        books[3] = new Book("Java: The Complete Reference", "Herbert Schildt", 11);
        books[4] = new Book("Design Patterns", "Erich Gamma", 1);
        books[5] = new Book("Refactoring", "Martin Fowler", 2);

       
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].title.compareTo(books[j].title) > 0) {
                    
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name: ");
        String authorInput = scanner.nextLine();

        
        System.out.println("\nBooks written by " + authorInput + ":");
        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equalsIgnoreCase(authorInput)) {
                books[i].displayDetails();
                found = true;
            }
        }

       
        if (!found) {
            System.out.println("No books found by this author.");
        }

    }
}

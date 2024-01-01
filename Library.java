import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;

    public Library(ArrayList<Book> books, ArrayList<Patron> patrons) {
        this.books = books;
        this.patrons = patrons;
    }

    public void addBook(Book... book) {
        for (Book b : book) {
            books.add(b);
        }
        System.out.println("Book is added to library successfully");
    }

    public void removeBook(Book... book) {
        for (Book b : book) {
            books.remove(b);
        }
        System.out.println("Book is removed from library successfully");
    }

    public void addPatron(Patron... patron) {
        for (Patron p : patron) {
            patrons.add(p);
        }
        System.out.println("Patron is added to library successfully");
    }

    public void removePatron(Patron... patron) {
        for (Patron p : patron) {
            patrons.remove(p);
        }
        System.out.println("Patron is removed from library successfully");
    }

    @Override
    public String toString() {
        return "Library [books: " + books + ", patrons: " + patrons + "]";
    }

}

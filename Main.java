import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("0201314525", "Algorithms in C part 1-4", "Robert Sedgewick", "Education", 100, 75);
        Book book2 = new Book("151239582X", "The Call of the Wild", "Jack London", "Novel", 150, 0);
        Book book3 = new Book("148127032X", "Nobody's Boy", "Hector Malot", "Novel", 150, 50);

        Patron patron1 = new Patron("John Doe", "john.doe@example.com", "+1 (555) 123-4567", "PA101");
        Patron patron2 = new Patron("Jane Smith", "jane.smith@example.com", "+1 (555) 234-5678", "PA202");
        Patron patron3 = new Patron("Alex Johnson", "alex.johnson@example.com", "+1 (555) 345-6789", "PA303");

        Borrower borrower1 = new Borrower("Alice Miller", "alice.miller@example.com", "+1 (555) 789-0122", "BO101");
        Borrower borrower2 = new Borrower("Brian Wilson", "brian.wilson@example.com", "+1 (555) 890-1233", "BO202");
        Borrower borrower3 = new Borrower("Catherine Davis", "catherine.davis@example.com", "+1 (555) 901-2344",
                "BO303");
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Patron> patronList = new ArrayList<>();

        Library library = new Library(bookList, patronList);
        library.addBook(book1, book2, book3);
        library.addPatron(patron1, patron2, patron3);

        patron1.viewBorrowedBook(book1);
        borrower1.borrowBook(book1);
        patron1.viewBorrowedBook(book1);

        patron2.viewBorrowedBook(book2);
        borrower2.borrowBook(book2);
        patron2.viewBorrowedBook(book2);

        patron3.viewBorrowedBook(book3);
        borrower3.borrowBook(book3);
        patron3.viewBorrowedBook(book3);

    }
}

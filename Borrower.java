public class Borrower extends User {
    String borrowerId;

    public Borrower(String name, String email, String phoneNumber, String borrowerId) {
        super(name, email, phoneNumber);
        this.borrowerId = borrowerId;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Override
    public String toString() {
        return "Borrower [borrowerId=" + borrowerId + "]";
    }

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            int availableCopies = book.getAvailableCopies();
            book.setAvailableCopies(--availableCopies);
            System.out.println("Book is borrowed successfully");
        } else {
            System.out.println("This book is unavailble at the moment");
        }
    }

    public void returnBook(Book book) {
        if (book.getAvailableCopies() < book.getTotalCopies()) {
            int availableCopies = book.getAvailableCopies();
            book.setAvailableCopies(++availableCopies);
            System.out.println("Book is returned successfully");
        } else {
            System.out.println(
                    "All copies of this book is available, you might have borrowed the book from somewhere else");
        }
    }

}

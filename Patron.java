public class Patron extends User {
    private String patronId;

    public Patron(String name, String email, String phoneNumber, String patronId) {
        super(name, email, phoneNumber);
        this.patronId = patronId;
    }

    public String getPatronId() {
        return patronId;
    }

    public void setPatronId(String patronId) {
        this.patronId = patronId;
    }

    @Override
    public String toString() {
        return "Patron [patronId=" + patronId + "]";
    }

    public void viewBorrowedBook(Book book) {
        int borrowedBook = book.getTotalCopies() - book.getAvailableCopies();
        System.out.println(getName() + " is viewing the number of borrowed books");
        System.out.println(
                "The copies of the book named " + book.getTitle() + " by " + book.getAuthor() + "left is "
                        + borrowedBook);
    }
}

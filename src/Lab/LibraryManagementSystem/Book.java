package Lab.LibraryManagementSystem;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    public static boolean isAvailable;

    public Book(String isbn, String title, String author, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public Book(Book otherBook) {
        this.isbn = otherBook.isbn;
        this.title = otherBook.title;
        this.author = otherBook.author;
        this.isAvailable = otherBook.isAvailable;
    }

    @Override
    public boolean lend(User user) {
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user) {
        isAvailable = true;
        user.returnBook();
    }
    public abstract void displayBookDetails();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

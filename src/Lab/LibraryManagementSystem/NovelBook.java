package Lab.LibraryManagementSystem;

public class NovelBook extends Book {
    public String genre;

    public NovelBook(String isbn, String title, String author, boolean isAvailable, String genre) {
        super(isbn, title, author, isAvailable);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Genre: " + genre);
    }
}

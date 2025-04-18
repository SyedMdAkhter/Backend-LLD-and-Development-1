package LibraryManagementSystem;

public class NovelBook extends Book {
    private String genre;

    public NovelBook(String genre) {
        this.genre = genre;
    }

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    public NovelBook(Book other, String genre) {
        super(other);
        this.genre = genre;
    }

    @Override
    public void displayBookdetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Genre: " + genre);
    }
}

package LibraryManagementSystem;

public class TextBook extends Book {
    private String subject;
    private int edition;

    public TextBook(String subject, int edition) {
        this.subject = subject;
        this.edition = edition;
    }

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    public TextBook(Book other, String subject, int edition) {
        super(other);
        this.subject = subject;
        this.edition = edition;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public void displayBookdetails() {
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
    }
}

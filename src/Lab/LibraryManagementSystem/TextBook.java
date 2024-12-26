package Lab.LibraryManagementSystem;

public class TextBook extends Book {
    public String subject;
    public String edition;

    public TextBook(String isbn, String title, String author, boolean isAvailable, String subject, String edition) {
        super(isbn, title, author, isAvailable);
        this.subject = subject;
        this.edition = edition;
    }
    public void displayBookDetails(){
        System.out.println("subject : "+subject);
        System.out.println("edition : "+edition);
    }

}

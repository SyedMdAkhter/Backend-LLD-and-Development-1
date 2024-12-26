package Lab.LibraryManagementSystem;



public class Librarian extends User {
    private int borrowedBooksCount;
    private String employeeNumber;
    public Librarian( String employeeNumber,String name,String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }
    public void addNewBook(Book book){
        System.out.println("New Book Added");

    }
    public void removeBook(Book book){
        System.out.println("Book Removed");

    }
    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }

    public void borrowBooks(Book book){
        if(book.isAvailable){
            borrowedBooksCount++;
            book.isAvailable = false;
            System.out.println(book+" is borrowed");
        }
        else{
            System.out.println(book+" is not available");
        }
    }


}

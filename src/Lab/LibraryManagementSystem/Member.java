package Lab.LibraryManagementSystem;

public class Member extends User {
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT=5;

    public Member(){
        super();
        borrowedBooksCount = 0;

    }
    public Member(String name,String contactInfo){
        super(name,contactInfo);
        borrowedBooksCount = 0;

    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Name: "+getName());
        System.out.println("Borrowed Books: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }
    public void borrowBooks(Book book){
        if(book.isAvailable()){
            System.out.println("book is available");
            if(canBorrowBooks()){
                borrowedBooksCount++;
                System.out.println(book.getTitle()+" is borrowed");
            }
        }
        else{
            System.out.println(book.getTitle()+" is not available");
        }

    }
}

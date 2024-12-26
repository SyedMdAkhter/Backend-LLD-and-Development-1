package Lab.LibraryManagementSystem;

import java.util.List;

import static Lab.LibraryManagementSystem.LibraryManagementSystem.bookInventory;
import static Lab.LibraryManagementSystem.LibraryManagementSystem.registeredUsers;

public class Client {
    public static void main(String[] args) {
        TextBook book1 = new TextBook("3214","Medieval History","Harkishan das",true,"History","2nd");
        NovelBook book2 = new NovelBook("3423","Midnights Children","Salman Rashdie",true,"Fiction");
        NovelBook book3 = new NovelBook("2345","The Moor's last sigh","Haroon Rashid",true,"Fiction");
        LibraryManagementSystem.addBook(book1);
        LibraryManagementSystem.addBook(book2);
        LibraryManagementSystem.addBook(book3);
        Member member1 = new Member("Mohit","7334567890");
        Member member2 = new Member("Rohit","7334567891");
        LibraryManagementSystem.registerUser(member1);
        LibraryManagementSystem.registerUser(member2);
        Librarian librarian1 = new Librarian("2314","Sukhwinder","7861234567");
        LibraryManagementSystem.registerUser(librarian1);
        Librarian librarian2 = new Librarian("3423","Sukhjinder","7861234568");
        LibraryManagementSystem.registerUser(librarian2);

        for(int i =0;i< bookInventory.size();i++){
            System.out.println("Books inventory List : "+bookInventory.get(i).getTitle());
        }
        for(int i =0;i<registeredUsers.size();i++){
            System.out.println("Registered User : "+registeredUsers.get(i).getName());
        }

        book1.lend(member1);
        System.out.println("Book lent to :"+member1.getName());
        book2.lend(librarian2);
        System.out.println("Book lent to :"+librarian2.getName());

        //member2.borrowBooks(book3);
        book3.lend(member2);
        System.out.println("Book lent to :"+member2.getName());

        List<Book> searchList = LibraryManagementSystem.searchBooks("2345");
        System.out.println("Book Found : "+searchList.get(0).getTitle());




    }
}

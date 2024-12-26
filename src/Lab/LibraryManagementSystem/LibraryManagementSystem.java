package Lab.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory = new ArrayList<>();
    static List<User> registeredUsers = new ArrayList<>();

    public static void addBook(Book book){
        bookInventory.add(book);
    }
    public static void registerUser(User user){
        registeredUsers.add(user);
    }
    public static List<Book> searchBooks(String criteria){
        List<Book> resultList = new ArrayList<>();
        for(Book book : bookInventory){
            if(book.getTitle().toLowerCase().contains(criteria.toLowerCase())||book.getAuthor().toLowerCase().contains(criteria.toLowerCase())){
                resultList.add(book);
            }
        }
        return resultList;
    }

    public static List<Book> searchBooks(String criteria, String type) {
        List<Book> resultList = new ArrayList<>();
        if (type.equals("TextBook")) {
            for (Book book : bookInventory) {
                if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) ||
                        book.getTitle().toLowerCase().contains(criteria.toLowerCase())) {
                    resultList.add(book);
                }
            }
        } else if (type.equals("NovelBook")) {
            for (Book book : bookInventory) {
                if (book.getAuthor().toLowerCase().contains(criteria.toLowerCase()) ||
                        book.getTitle().toLowerCase().contains(criteria.toLowerCase())) {
                    resultList.add(book);
                }
            }
        }
        return resultList;
    }


}

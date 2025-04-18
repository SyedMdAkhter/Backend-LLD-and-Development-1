package LibraryManagementSystem;

import java.util.UUID;

public abstract class User {

    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User(){
        this.userId = generateUniqueID();

    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueID();
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public User(User user){
        this.userId = generateUniqueID();
        this.name = user.getName();
        this.contactInfo = user.getContactInfo();

    }

    private String generateUniqueID(){
        ++totalUsers;
        return userId + "_" + totalUsers;
    }

    public String getUserId() {
        return userId;
    }

//    public void setUserId(String userId) {
//        this.userId = userId;
//    }

    public String getName() {
        return name;
    }


    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}

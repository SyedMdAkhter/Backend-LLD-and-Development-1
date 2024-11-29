package OOP;

public class BankAccount {

    private double balance;
    private String ownerName;

    BankAccount(){
        ownerName = null;
        this.balance = 0;
    }
    BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        balance = balance + amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }

    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        if (ownerName != null) {
            this.ownerName = ownerName;
        }
    }
}

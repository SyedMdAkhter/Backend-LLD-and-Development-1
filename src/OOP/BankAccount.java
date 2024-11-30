package OOP;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private String ownerName;
    private List<String> transactionHistory = new ArrayList<>();

    public BankAccount(){
        ownerName = null;
        balance = 0;
    }
    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;

        }
        balance = balance + amount;
        transactionHistory.add("Deposit " + amount + " to " + ownerName);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        transactionHistory.add("Withdraw " + amount + " from " + ownerName);

    }

    public double getBalance(String token) {
        if(token.equals("$123")){
            return balance;
        }
        throw new RuntimeException("Invalid token");
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
    public void printTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

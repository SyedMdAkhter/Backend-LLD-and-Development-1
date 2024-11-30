package OOP;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setOwnerName("John");
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.deposit(300);
        bankAccount.withdraw(100);
        bankAccount.getBalance("$123");
        bankAccount.printTransactionHistory();
    }
}

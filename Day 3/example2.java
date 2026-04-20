class BankAccount {

     Private variable (hidden data)
    private double balance;

     Setter method (deposit money)
    public void deposit(double amount) {
        if (amount  0) {
            balance = balance + amount;
        }
    }

     Getter method (check balance)
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(1000);  add money

        System.out.println(Balance  + acc.getBalance());
    }
}
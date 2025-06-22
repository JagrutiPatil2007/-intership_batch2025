package day2.java;

public class BankAccount {
    
    private String accountNumber;
    private String accountHolder;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "John Doe", 1000);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Final Balance: " + account.getBalance());
    }
}


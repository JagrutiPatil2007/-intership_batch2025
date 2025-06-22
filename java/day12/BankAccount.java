package day12.java;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
        
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
    	
    BankAccount account = new BankAccount("A123", 1000.00);
    account.displayBalance();
    account.deposit(500);
    account.withdraw(200);
    account.displayBalance();}
}

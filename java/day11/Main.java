package Day11.java;
class BankAccount{
String accountNumber;
String holderName;
double balance;

BankAccount(String accountNumber, String holderName, double balance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
}

void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Holder Name: " + holderName);
    System.out.println("Balance: $" + balance);
}
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }
}

public class Main {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Dell", "XPS 13", 999.99);
        laptop1.displayDetails();

        
        Product product1 = new Product("Phone", 101, 699.00);
        Product product2 = new Product("Headphones", 102, 199.99);
        Product product3 = new Product("Keyboard", 103, 49.99);

        product1.displayDetails();
        product2.displayDetails();
        product3.displayDetails();

       
        SavingsAccount savings1 = new SavingsAccount("123456789", "Alice Johnson", 5000.00, 2.5);
        savings1.displayAccountDetails();
	}

}

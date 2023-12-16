//Bank Account management

public class BankAccount {

    String accountNumber;
    String accountHolder;
    int balance;

    void Deposit(int amount) {
        balance += amount;
    }

    void Withdraw(int amount) {
        if(balance - amount>0)
            balance -= amount;

        else
            System.out.println("Insufficient fund");
    }

    int getBalance() {
        return balance;    
    }

    void Display() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder);
    }
    public static void main(String[] args) {

        BankAccount person1 = new BankAccount();
        person1.accountNumber = "20MCA10122";
        person1.accountHolder = "Satakshi Shanvi";
        person1.balance = 10122;
        person1.Display();
        System.out.println("Account Balance: " + person1.getBalance());

        person1.Deposit(5000);
        System.out.println("Account Balance: " + person1.getBalance());

        person1.Withdraw(5000);
        System.out.println("Account Balance: " + person1.getBalance());
    }
}

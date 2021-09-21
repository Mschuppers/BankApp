public class Account {

    int accountNumber;
    double balance;
    double interest;


    //getters & setters


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //Constructors
    public Account(int accountNumber, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }


    //Methods
    void deposit(double amount) { // waarom to en niet op this?
        System.out.println("Request deposit to " + this.accountNumber + " with balance: " + this.balance);
        this.balance += amount;
        System.out.println("New balance for " + this.accountNumber + " = " + this.balance);
        setBalance(this.balance);

    }


    void withdraw(double amount) {

        System.out.println("Request transfer (€ " + amount + " -) " + this.accountNumber + " with balance: " + this.balance);
        try {
            if ((this.balance -= amount) >= 0) {
                System.out.println("New balance for " + this.accountNumber + " = " + this.balance);
            } else {
                throw new Exception("Not enough funds");
            }
        } catch (Exception e) {
            System.out.println("Not enough funds, try again");
            System.exit(-1);

        }
    }
}



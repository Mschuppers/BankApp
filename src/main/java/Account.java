import javax.management.InvalidAttributeValueException;

public class Account {

    int accountNumber;
    double balance;
    double interest;

    //getters & setters
    public void setBalance(double balance) {
        this.balance = balance;
    }


    //Constructors
    public Account(int accountNumber, double balance, double interest) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interest = interest;
    }


    //Methods
    void deposit(Account to, double amount) {
        System.out.println("Request deposit to "+ to.accountNumber + " with balance: "+to.balance);
        this.balance += amount;
        System.out.println("New balance for "+to.accountNumber+" = " +to.balance);
        setBalance(this.balance);

    }

    void withdraw(Account from, double amount) throws InvalidAttributeValueException {
        System.out.println("Request transfer (€ "+ amount +" -) "+ from.accountNumber + " with balance: "+from.balance);
        if ((this.balance -= amount) >= 0) {
            setBalance(this.balance);
            System.out.println("New balance for " + from.accountNumber + " = " + from.balance);
        }else{
            throw new InvalidAttributeValueException("Not enough available in account");
        }}




}



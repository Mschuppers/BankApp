import java.util.ArrayList;


public class Bank {
    double totalBalance = 0;

    ArrayList<Account> bankAccounts = new ArrayList<>(); // casing fIXeD

    void createAccounts() {
        bankAccounts.add(new Account(1, 100, 1.04));
        bankAccounts.add(new Account(2, 200, 1.04));
        bankAccounts.add(new Account(3, 400.92, 1.04));
        bankAccounts.add(new Account(4, 25.21, 1.04));
        bankAccounts.add(new Account(5, 122.25, 1.04));
        bankAccounts.add(new Account(6, 279.77, 1.04));
        bankAccounts.add(new Account(7, 374.16, 1.04));
        bankAccounts.add(new Account(8, 1354.74, 1.04));
        bankAccounts.add(new Account(9, 1987.67, 1.04));
        bankAccounts.add(new Account(10, 324.55, 1.04));
        System.out.println("Creating Accounts finished");
    }

    void withdraw(int number, double amount) {
        Account a = searchAccount(number);
        a.withdraw(amount);

    }

    void deposit(int number, double amount) {
        Account a = searchAccount(number);
        a.deposit(amount);

    }


    void transfer(int number, int number2, double amount) {

        Account a = searchAccount(number);
        Account b = searchAccount(number2);

        try {
            a.withdraw(amount);
            b.deposit(amount);
        } catch (Exception e) {
            System.out.println("No money available for this transaction");

        }

    }

    double totalBalance() {
        for (Account i : bankAccounts) {
            totalBalance += i.balance;
        }
        return totalBalance;

    }


    double interestCalc(int number) {


        Account a = searchAccount(number);
        searchAccount(number);

        a.balance *= a.interest;
        return a.balance;
    }


    double checkBalance(int number) {
        Account bankAccount = searchAccount(number);
        return bankAccount.balance;
    }

    public Account searchAccount(int number) {

        for (Account bankAccount : bankAccounts) {

            if (number == bankAccount.getAccountNumber()) {
                return bankAccount;
            }
        }

        throw new IllegalArgumentException();
    }
}













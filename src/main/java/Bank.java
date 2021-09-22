import java.util.ArrayList;


public class Bank {
    double totalBalance = 0;

    ArrayList<Account> bankAccounts = new ArrayList<>(); // casing fIXeD

    void createAccounts() {
        // Hoe acces ik deze accounts nu voor b.v. transfer?
        bankAccounts.add(new Account(1, 100, 1.04));// kan ook korter (hoeft niet) tot BankAccounts.add(new Account(1, 100, 1.04)); fixed
        bankAccounts.add(new Account(2, 200, 1.04));
        bankAccounts.add(new Account(3, 400.92, 1.04));
        bankAccounts.add(new Account(4, 25.21, 1.04));
        bankAccounts.add(new Account(5, 122.25, 1.04));
        bankAccounts.add(new Account(6, 279.77, 1.04));
        bankAccounts.add(new Account(7, 374.16, 1.04));
        bankAccounts.add(new Account(8, 1354.74, 1.04));
        bankAccounts.add(new Account(9, 1987.67, 1.04));
        bankAccounts.add(new Account(10, 324.55, 1.04));

    }

    void withdraw(int number, double amount) {
        Account a = fetchAccountNumber(number);
        a.withdraw(amount);

    }

    void deposit(int number, double amount) {
        Account a = fetchAccountNumber(number);
        a.deposit(amount);

    }


    void transfer(int number, int number2, double amount) {

        Account a = fetchAccountNumber(number);
        Account b = fetchAccountNumber(number2);

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


        Account a = fetchAccountNumber(number);
        fetchAccountNumber(number);

        a.balance *= a.interest;
        return a.balance;
    }


    double checkBalance(int number) {
        Account a = fetchAccountNumber(number);
        fetchAccountNumber(number);
        return a.balance;
    }

    public Account fetchAccountNumber(int number) {

        Account a;
        for (Account bankAccount : bankAccounts) {
            a = bankAccount;
            if (number == a.getAccountNumber()) {
                return a;
            }
        }
        return null;
    }
}








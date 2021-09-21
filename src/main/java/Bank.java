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

        //gaat zoeken
        Account a = fetchAccountNumber(number);

        //gaat withdrawen
        a.withdraw(amount);

    }

    void deposit(int number, double amount) {

        //gaat zoeken
        Account a = fetchAccountNumber(number);

        //gaat withdrawen
        a.withdraw(amount);

    }


    // niet alles moet static zijn, fixed
    void transfer(Account a, Account b, double amount) {

        try {
            a.withdraw(amount);
            b.deposit(amount);
        } catch (Exception e) { // prima.
            System.out.println("No money available for this transaction");
        }

    }

    double totalBalance() { // mooier om hier een return te geven. kun je het ook testen. fixed
        for (Account i : bankAccounts) {
            totalBalance += i.balance;  // denk om je code layout, bijv. empty lines:  fixed
        }
        return totalBalance;

    }

    // klopt deze functie wel? volgens mij moest je de renteopbrengst van één account kunnen uitrekenen: saldo*rente%  Fixed (was onder de indruk dat alles in 1x moest)
    double interestCalc(double balance, double interest) { // mooier om hier een return te geven. kun je het ook testen. Fixed
        balance *= interest;
        return balance;
    }


    public Account fetchAccountNumber(int number) {
        Account a = bankAccounts.get(0);
        for (int i = 0, bankAccountsSize = bankAccounts.size(); i < bankAccountsSize; i++) {
            a = bankAccounts.get(i);
            if (number == a.getAccountNumber()) {
                return a;
            }
        }
        return a;

    }
}








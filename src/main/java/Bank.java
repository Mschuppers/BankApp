import java.util.ArrayList;

// sommige repos van jou heten "...excersize"; dit moet zijn ...exercise
// geen gitignore? jouw .idea en target folders zitten nu ook in je repo. dat hoort niet. alleen je eigen sources.

public class Bank {

    // waarom static? nu hebben alle banken één BankAccounts en één total
    static ArrayList<Account> BankAccounts = new ArrayList<>(); // casing
    static double totalBalance = 0;

    public static void main(String[] args) { // het is mooier om verantwoordelijkheden te scheiden; de main in een andere class.

        Account a = new Account(1, 100, 1.04);
        Account b = new Account(2, 200, 1.04);
        Account c = new Account(3, 400.92, 1.04);
        Account d = new Account(4, 25.21, 1.04);
        Account e = new Account(5, 122.25, 1.04);
        Account f = new Account(6, 279.77, 1.04);
        Account g = new Account(7, 374.16, 1.04);
        Account h = new Account(8, 1354.74, 1.04);
        Account k = new Account(9, 1987.67, 1.04);
        Account l = new Account(10, 324.55, 1.04);

        BankAccounts.add(a); // kan ook korter (hoeft niet) tot BankAccounts.add(new Account(1, 100, 1.04));
        BankAccounts.add(b);
        BankAccounts.add(c);
        BankAccounts.add(d);
        BankAccounts.add(e);
        BankAccounts.add(f);
        BankAccounts.add(g);
        BankAccounts.add(h);
        BankAccounts.add(k);
        BankAccounts.add(l);

        interestCalc();
        totalBalance();

    }

    // niet alles moet static zijn
    static void transfer(Account from, Account to, double amount) {

        try {
            from.withdraw(from, amount);
            to.deposit(to, amount);
        } catch (Exception e) { // prima.
            System.out.println("No money available for this transaction");
        }

    }

    private static void totalBalance() { // mooier om hier een return te geven. kun je het ook testen.
        for (Account i : BankAccounts) {
            Bank.totalBalance += i.balance;  // denk om je code layout, bijv. empty lines:

        }
        System.out.println(totalBalance);
    }

    // klopt deze functie wel? volgens mij moest je de renteopbrengst van één account kunnen uitrekenen: saldo*rente%
    private static void interestCalc() { // mooier om hier een return te geven. kun je het ook testen.
        for (Account i : BankAccounts) {
            double interestAmount = i.balance - (i.interest - 1);
            System.out.println(interestAmount);
            i.balance *= i.interest;
            System.out.println(i.balance);
        }

    }

}






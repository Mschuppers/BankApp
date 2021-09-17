import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    //Scanner sc = new Scanner(System.in);
    static ArrayList<Account> BankAccounts = new ArrayList<>();
    static double totalBalance = 0;

    public static void main(String[] args) {

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

        BankAccounts.add(a);
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
        //inputUser();

    }

//   static void inputUser() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bankaccountnr?");
//        Account from = sc.nextInt();
//        Account to = sc.nextInt();
//        double amount = sc.nextDouble();
//
//
//        transfer(from, to, amount);
//
//    }


    static void transfer(Account from, Account to, double amount) {

        try {
            from.withdraw(from, amount);
            to.deposit(to, amount);
        } catch (Exception e) {
            System.out.println("No money available for this transaction");
        }

    }

    private static double totalBalance() {
        for (Account i : BankAccounts) {
            Bank.totalBalance += i.balance;

        }
        System.out.println(totalBalance);
        return totalBalance;
    }

    private static void interestCalc() {
        for (Account i : BankAccounts) {
            double interestAmount = i.balance - (i.interest - 1);
            System.out.println(interestAmount);
            i.balance *= i.interest;
            System.out.println(i.balance);
        }


    }

}






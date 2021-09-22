import java.util.Scanner;

public class controller {
    static boolean nextChoice = true;


    public static void main(String[] args) {

        /*nog 1 laatste issue te fixen / bekijken.
        Zo lang de Bank abn = new bank & abn.createAccounts(); in de menuSelection staan worden
        de objecten telkens gerest naar de defaultwaardes.

        Doe maar eens optie 5 voor account 1, withdraw voor account 1 en check account 1 daarna weer.
        Ik moet de eerder genoemde elementen nog uit deze loop halen. Verder lijkt het te werken*/
        while (nextChoice == true) {
            menuSelection();
        }
        System.out.println("Goodbye");
    }


    public static void menuSelection() {
        Bank abn = new Bank();
        abn.createAccounts();
        Scanner menuChoice = new Scanner(System.in);
        System.out.println("Select one of our services");

        System.out.println("1) Withdraw");
        System.out.println("2) Deposit");
        System.out.println("3) Transfer");
        System.out.println("4) Calculate Interest");
        System.out.println("5) Check your saldo");
        System.out.println("6) Total money in bank");
        System.out.println("0) Exit application");

        int inputA = menuChoice.nextInt();

        switch (inputA) {
            case 1:
                System.out.println("Select account number");
                int number = menuChoice.nextInt();
                System.out.println("Insert amount");
                double amount = menuChoice.nextDouble();
                abn.withdraw(number, amount);
                break;
            case 2:
                System.out.println("Select account number");
                number = menuChoice.nextInt();
                System.out.println("Insert amount");
                amount = menuChoice.nextDouble();
                abn.deposit(number, amount);
                break;
            case 3:
                System.out.println("Select sender");
                number = menuChoice.nextInt();
                System.out.println("Select recepient");
                int number2 = menuChoice.nextInt();
                System.out.println("Insert amount");
                amount = menuChoice.nextDouble();
                abn.transfer(number, number2, amount);
                break;

            case 4:
                System.out.println("Select account to receive interest");
                number = menuChoice.nextInt();
                System.out.println(abn.interestCalc(number));
                break;

            case 5:
                System.out.println("Select account to check saldo");
                number = menuChoice.nextInt();
                System.out.println(abn.checkBalance(number));
                break;

            case 6:
                System.out.println("Retrieving total money in the bank");
                System.out.println(abn.totalBalance());
                break;


            case 0:
                System.out.println("Goodbye");
                nextChoice = false;
                break;

            default:
                System.out.println("Incorrect entry, try again");

        }
    }

}



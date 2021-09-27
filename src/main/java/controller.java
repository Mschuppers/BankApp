import java.util.Scanner;

public class controller {
    static boolean nextChoice = true;

    static Bank abn = new Bank();

    public static void main(String[] args) {


        abn.createAccounts();
        while (nextChoice) {
            menuSelection();
        }

    }


    public static void menuSelection() {

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





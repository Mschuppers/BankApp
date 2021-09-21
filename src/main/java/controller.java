import java.util.Scanner;

public class controller {

    public static void main(String[] args) {


        menuSelection();

    }

    public static void menuSelection() {
        Scanner menuChoice = new Scanner(System.in);
        Bank abn = new Bank();
        abn.createAccounts();
        System.out.println("Select one of our services");

        System.out.println("1) Withdraw");
        System.out.println("2) Deposit");
        System.out.println("3) Transfer");
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
                //number2 = menuChoice.nextInt();

                System.out.println("Insert amount");
                amount = menuChoice.nextDouble();

                //abn.transfer(number,number2, amount);
                break;
            case 0:
                System.out.println("Goodbye");
                System.exit(-1);
                break;
            default:

                // code block
        }
    }


}


import java.util.Scanner;

public class Card implements Payment {

    Scanner scanner = new Scanner(System.in);
    int[][] Accounts = {{12345, 2486, 10000}, {67890, 2345, 20000}};


    @Override
    public void pay(int bill) {
        System.out.print("Enter your Card Number: ");
        int cardNumber = scanner.nextInt();
        System.out.print("Enter your Pin Number: ");
        int pin = scanner.nextInt();

        for (int[] account : Accounts) {
            if (account[0] == cardNumber && account[1] == pin) {
                if (account[2] >= bill) {
                    account[2] -= bill;
                    System.out.println("Payment of " + bill + " successful. Remaining balance: " + account[2]);
                } else {
                    System.out.println("Insufficient balance for payment.");
                }
                return;
            }
        }
        System.out.println("Invalid card number or pin.");
    }
}

import java.util.Scanner;

public class Gcash implements Payment {

    Scanner scanner = new Scanner(System.in);
    long[][] Accounts = {{1234234, 2486, 10000}, {67890, 2345, 20000}};

    @Override
    public void pay(int bill) {

        System.out.print("Enter your Gcash Number: ");
        int GcashNumber = scanner.nextInt();
        System.out.print("Enter your Pin Number: ");
        int pin = scanner.nextInt();

        for (long[] account : Accounts) {
            if (account[0] == GcashNumber && account[1] == pin) {
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

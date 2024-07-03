import java.util.Scanner;

public class Cash implements Payment {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void pay(int bill) {

        System.out.print("Enter your cash: ");
        int amount = scanner.nextInt();

        int total = amount - bill;
        System.out.println("Successfully paid " + bill + " change:  " + total);
    }
}

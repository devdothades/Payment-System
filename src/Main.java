import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PaymentFactory paymentFactory = new PaymentFactory();

        Scanner scanner = new Scanner(System.in);

        int bill = 423;

        System.out.println("Total bill is: " + bill);

        System.out.println("[1] Cash");
        System.out.println("[2] Gcash");
        System.out.println("[3] Card");
        System.out.print("Enter Payment Method: ");
        int paymentMethod = scanner.nextInt();

        Payment payment = paymentFactory.getPayment(paymentMethod);
        payment.pay(bill);


    }
}

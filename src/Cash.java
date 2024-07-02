public class Cash implements Payment {
    @Override
    public void pay(int amount, int bill) {

        int total = amount - bill;
        System.out.println("Gcash payment is now " + total);
    }
}

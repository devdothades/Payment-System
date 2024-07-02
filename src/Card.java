public class Card implements Payment {
    @Override
    public void pay(int amount, int bill) {
        System.out.println("Gcash payment is now " + amount);
    }
}

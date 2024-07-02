public class PaymentFactory {

    public Payment getPayment(int paymentType) {
        if (paymentType == 1) {
            return new Cash();
        } else if (paymentType == 2) {
            return new Gcash();
        } else if (paymentType == 3) {
            return new Card();
        }
        return null;
    }

}

package strategypattern;

public class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount +
                           " to email address " + emailAddress);
    }
}

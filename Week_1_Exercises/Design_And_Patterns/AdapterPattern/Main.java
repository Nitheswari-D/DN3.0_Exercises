package adapterpattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());

        payPalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
    }
}

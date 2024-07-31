package strategypattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com");

        paymentContext.setPaymentStrategy(creditCardPayment);
        System.out.println("Making payment using Credit Card:");
        paymentContext.executePayment(150.00);

        paymentContext.setPaymentStrategy(payPalPayment);
        System.out.println("Making payment using PayPal:");
        paymentContext.executePayment(75.50);
    }
}

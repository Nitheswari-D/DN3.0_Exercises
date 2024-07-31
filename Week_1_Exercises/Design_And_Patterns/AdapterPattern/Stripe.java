
package adapterpattern;

public class Stripe {
    public void processTransaction(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}

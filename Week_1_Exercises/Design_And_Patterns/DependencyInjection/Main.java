package dependencyinjection;

public class Main {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service using constructor injection
        CustomerService service = new CustomerService(repository);

        // Use the service to find customer details
        String customer1 = service.getCustomerDetails("1");
        String customer2 = service.getCustomerDetails("2");
        String customer3 = service.getCustomerDetails("3");

        // Print customer details
        System.out.println("Customer 1: " + customer1);
        System.out.println("Customer 2: " + customer2);
        System.out.println("Customer 3: " + customer3);
    }
}

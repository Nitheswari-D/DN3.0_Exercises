package dependencyinjection;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerDetails(String customerId) {
        String customerDetails = customerRepository.findCustomerById(customerId);
        return customerDetails != null ? customerDetails : "Customer not found";
    }
}

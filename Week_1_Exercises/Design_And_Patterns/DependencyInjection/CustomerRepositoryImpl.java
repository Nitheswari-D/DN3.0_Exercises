package dependencyinjection;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, String> customerDatabase;

    public CustomerRepositoryImpl() {
        // Simulate a database with some customer data
        customerDatabase = new HashMap<>();
        customerDatabase.put("1", "John Doe");
        customerDatabase.put("2", "Jane Smith");
    }

    @Override
    public String findCustomerById(String customerId) {
        return customerDatabase.get(customerId);
    }
}

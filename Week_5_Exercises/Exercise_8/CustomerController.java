package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.CustomerDTO;
import com.example.bookstoreapi.mapper.CustomerMapper;
import com.example.bookstoreapi.model.Customer;
import com.example.bookstoreapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Create a new customer
    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        Customer savedCustomer = customerService.createCustomer(customer);
        CustomerDTO responseDTO = CustomerMapper.INSTANCE.customerToCustomerDTO(savedCustomer);
        return ResponseEntity.ok(responseDTO);
    }

    // Read all customers
    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        List<CustomerDTO> customerDTOs = customers.stream()
                                                  .map(CustomerMapper.INSTANCE::customerToCustomerDTO)
                                                  .toList();
        return ResponseEntity.ok(customerDTOs);
    }

    // Read a customer by ID
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable int id) {
        Customer customer = customerService.getCustomerById(id);
        CustomerDTO customerDTO = CustomerMapper.INSTANCE.customerToCustomerDTO(customer);
        return ResponseEntity.ok(customerDTO);
    }

    // Update a customer
    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable int id, @Valid @RequestBody CustomerDTO customerDTO) {
        Customer customer = CustomerMapper.INSTANCE.customerDTOToCustomer(customerDTO);
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        CustomerDTO responseDTO = CustomerMapper.INSTANCE.customerToCustomerDTO(updatedCustomer);
        return ResponseEntity.ok(responseDTO);
    }

    // Delete a customer
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
}

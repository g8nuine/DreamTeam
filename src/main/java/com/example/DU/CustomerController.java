package com.example.DU;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {this.customerService = customerService;}
    private final List<Customer> customers = new ArrayList<>();

    @PostMapping("/api/customers")
    public Customer create(@RequestBody Customer customer) {
        customerService.create(customer);
        return customer;
    }
    @PostMapping("/api/customers/by-name") //create customer
    public Customer create(@RequestParam long id, String meno, String priezvisko, String email) {
        return customerService.create(id, meno, priezvisko, email);
    }

    @GetMapping("/api/customers") // return all customers
    public List<Customer> getCustomers() {return customerService.getCustomers(); }

    @GetMapping("/api/customers/{id}") // return customer by id
    public Customer getCustomer(@PathVariable long id) {return customerService.getCustomer(id); }

    @PutMapping("/api/customers/{id}") // edit customer by id
    public Customer editCusotmer(@PathVariable long id, String meno, String priezvisko, String email) {
        return customerService.editCustomer(id, meno, priezvisko, email);
    }

    @DeleteMapping("/api/customers/{id}") // delete customer by id
    public Customer deleteCustomer(@PathVariable long id) { return customerService.deleteCustomer(id); }
}

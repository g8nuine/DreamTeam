package com.example.DU;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    public Customer create(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer create(long id, String meno, String priezvisko, String email) {
        Customer customer = new Customer();
        customer.id = id;
        customer.meno = meno;
        customer.priezvisko = priezvisko;
        customer.email = email;
        customers.add(customer);
        return customer;
    }
    public List<Customer> getCustomers(){return customers;}
    public Customer getCustomer(long id) {
        Customer c = new Customer();
        for(int i =0; i < customers.size(); i++){
            if(customers.get(i).id == id) {
                c.meno = customers.get(i).meno;
                c.priezvisko = customers.get(i).priezvisko;
                c.email = customers.get(i).email;
            }
        }
        return c;
    }

    public Customer editCustomer(long id, String meno, String priezvisko, String email) {
        for(int i =0; i < customers.size(); i++) {
            if (customers.get(i).id == id) {
                customers.get(i).meno = meno;
                customers.get(i).priezvisko = priezvisko;
                customers.get(i).email = email;
            }
        }
        return null;
    }
    public Customer deleteCustomer(long id) {
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).id == id) {
                customers.remove(i);
            }
            }
        return null;
    }
}

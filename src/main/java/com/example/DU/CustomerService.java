package com.example.DU;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerDto> getCustomers(String customerName) {return null;}

    @Transactional
    public CustomerDto getCustomer(Long CustomerId) {
        Optional<CustomerEntity> byId = customerRepository.findById(CustomerId);

        if(byId.isPresent()) {
            return mapToCustomerDto(byId.get());
        }
        return null;
    }

    private static CustomerDto mapToCustomerDto(CustomerEntity customerEntity) {
        CustomerDto customerDto = new CustomerDto();

        customerDto.setFirstname(customerEntity.getFirstname());
        customerDto.setSecondname(customerEntity.getSecondname());
        return customerDto;
    }
}

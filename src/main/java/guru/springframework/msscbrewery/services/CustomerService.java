package guru.springframework.msscbrewery.services;


import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * Created by jlc on 5/13/2024.
 */
public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto savedCustomerDto(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}

package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by jlc on 6/10/2024
 */
@Mapper
public interface CustomerMapper {

   CustomerDto customerToCustomerDto(Customer customer);

   Customer customerDtoToCustomer(CustomerDto customerDto);
}

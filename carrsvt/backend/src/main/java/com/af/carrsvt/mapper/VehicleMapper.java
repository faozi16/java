package com.af.carrsvt.mapper;

import org.mapstruct.Mapper;

import com.af.carrsvt.dto.CustomerDto;
import com.af.carrsvt.entity.Customer;

@Mapper(
    componentModel = "spring"
)
public interface VehicleMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}

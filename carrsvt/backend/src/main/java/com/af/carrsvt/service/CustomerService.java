package com.af.carrsvt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.af.carrsvt.entity.Customer;
import com.af.carrsvt.repository.CustomerRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new EntityNotFoundException("Customer not found"));
    }

    public Customer updateCustomer(Long customerId, Customer customerDetails) {
        Customer customer = getCustomerById(customerId);
        customer.setUsername(customerDetails.getUsername());
        customer.setPassword(customerDetails.getPassword());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhoneNumber(customerDetails.getPhoneNumber());
        customer.setStatus(customerDetails.getStatus());
        customer.setPaymentMethod1(customerDetails.getPaymentMethod1());
        customer.setPaymentMethod2(customerDetails.getPaymentMethod2());
        customer.setDetailPaymentMethod1(customerDetails.getDetailPaymentMethod1());
        customer.setDetailPaymentMethod2(customerDetails.getDetailPaymentMethod2());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        Customer customer = getCustomerById(customerId);
        customerRepository.delete(customer);
    }
}


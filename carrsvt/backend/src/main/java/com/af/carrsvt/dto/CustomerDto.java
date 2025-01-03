package com.af.carrsvt.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    private Long customerId;
    private String username;
    private String password;
    @Email
    private String email;
    private String phoneNumber;
    private String status;
    private String paymentMethod1;
    private String paymentMethod2;
    private String detailPaymentMethod1;
    private String detailPaymentMethod2;  
}

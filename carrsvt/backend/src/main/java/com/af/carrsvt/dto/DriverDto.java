package com.af.carrsvt.dto;

import java.util.Date;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverDto {
    private Long driverId;
    private String username;
    private String password;
    @Email
    private String email;
    private String phoneNumber;
    private String licenseDriver;
    private Date dateOfBirth;
    private String placeOfBirth;
    private String address;
    private String status;
}

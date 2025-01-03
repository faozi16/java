package com.af.carrsvt.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDto {
    private Long reservationId;
    private Long customerId;
    private Long vehicleId;
    private Date pickupTime;
    private String pickupLocation;
    private String dropoffLocation;
    private String status;
}

package com.af.carrsvt.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDto {
    private Long vehicleId;
    private Long driverId;
    private String vehicleType;
    private String licensePlate;
    private String status;
}

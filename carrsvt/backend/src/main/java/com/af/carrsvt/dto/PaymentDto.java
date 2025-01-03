package com.af.carrsvt.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentDto {
    private Long paymentId;
    private Long reservationId;
    private Date paymentTime;
    private BigDecimal amount;
    private String paymentMethod;
    private String status;
}

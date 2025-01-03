package com.af.carrsvt.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedbackDto {
    private Long feedbackId;
    private Long customerId;
    private Long reservationId;
    private Integer rating;
    private String comments;
}

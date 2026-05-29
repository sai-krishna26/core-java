package com.kmf.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetailDto implements Serializable {
    private int orderId;
    private String OrderName;
    private String paymentStatus;
    private LocalDate orderedTime;
    private long mobileNor;
}

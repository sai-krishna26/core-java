package com.kmf.dto;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalesDetailDto implements Serializable{
    private String personName;
    private String productName;
    private double amount;
    private boolean validDetails;
    private String location;
}


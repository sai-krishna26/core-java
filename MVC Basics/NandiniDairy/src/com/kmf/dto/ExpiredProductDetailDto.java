package com.kmf.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExpiredProductDetailDto implements Serializable {
    private String productName;
    private String productId;
    private String companyName;
    private float cost;
    private  String productType;
}

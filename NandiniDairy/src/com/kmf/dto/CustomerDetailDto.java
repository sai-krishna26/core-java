package com.kmf.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDetailDto implements Serializable {
    private String name;
    private int c_Id;
    private String address;
    private String gender;
    private String c_type;
}

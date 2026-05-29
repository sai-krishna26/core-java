package com.kmf.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KmfDetailsDto implements Serializable {
    private String companyName;
    private String Location;
    private boolean isOpen;
    private String email;
    private long mobileNor;
}

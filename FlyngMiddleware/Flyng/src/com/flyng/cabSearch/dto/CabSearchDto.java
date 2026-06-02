package com.flyng.cabSearch.dto;

import com.flyng.cabSearch.constants.RouteType;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CabSearchDto {
    private RouteType routeType;
    private String fromAddress;
    private String toAddress;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
}

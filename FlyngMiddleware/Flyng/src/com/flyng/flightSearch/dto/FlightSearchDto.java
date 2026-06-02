package com.flyng.flightSearch.dto;

import com.flyng.flightSearch.constants.Currency;
import com.flyng.flightSearch.constants.TripType;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class FlightSearchDto {
    private TripType tripType;
    private Currency currency;
    private String from;
    private String to;
    private LocalDate departure;
    private int passengerCount;
}

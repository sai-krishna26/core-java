package com.flyng.hotelSearch.dto;

import com.flyng.hotelSearch.constants.SearchType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class HotelSearchDto {
    private SearchType searchType;
    private String destinationName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int no_of_guests;
    private int no_of_rooms;
}

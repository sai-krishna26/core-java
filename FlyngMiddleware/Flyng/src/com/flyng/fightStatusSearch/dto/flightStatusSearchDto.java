package com.flyng.fightStatusSearch.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class flightStatusSearchDto {
    private int searchByPnrNumber;
    private LocalDate date;
}

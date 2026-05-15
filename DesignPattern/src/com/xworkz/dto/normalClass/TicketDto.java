package com.xworkz.dto.normalClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class TicketDto implements Serializable {
    private String type;
    private int cost;
}

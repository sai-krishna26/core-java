package com.xworkz.dto.normalClass;

import com.xworkz.dto.constants.Items;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class MarketDto implements Serializable {
    @Setter(AccessLevel.NONE)
    Items items;
    int budget;
    String item;
}

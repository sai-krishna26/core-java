package com.xworkz.dto.normalClass;
import com.xworkz.dto.constants.Names;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class PassportDto implements Serializable {

    int id;
    Names names;
    LocalDate date;
    @Getter(AccessLevel.NONE)
    int age;
    String address;
}

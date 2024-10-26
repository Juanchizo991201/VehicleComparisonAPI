package com.jjmontenegrop.carcomparisonapi.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleSearchByMakeModelYearDto {

    private String make;
    private String model;
    private Integer year;
}

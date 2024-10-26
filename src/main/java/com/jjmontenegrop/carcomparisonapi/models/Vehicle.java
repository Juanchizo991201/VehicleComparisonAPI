package com.jjmontenegrop.carcomparisonapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private Integer year;
    private Double displacement;

    @Column(name = "fuel_type")
    private String fuelType;
    private String transmission;
    private Integer horsepower;
    private Double price;

    @Column(name = "fuel_efficiency")
    private Double fuelEfficiency;
}

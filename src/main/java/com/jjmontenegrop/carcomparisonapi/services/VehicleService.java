package com.jjmontenegrop.carcomparisonapi.services;

import com.jjmontenegrop.carcomparisonapi.models.Vehicle;
import com.jjmontenegrop.carcomparisonapi.models.dtos.VehicleSearchByMakeModelYearDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VehicleService {


    void addVehicle(Vehicle vehicle);

    List<Vehicle> getFilteredVehicles(String make, String model, Integer year, String fuelType, String transmission, Double minPrice, Double maxPrice);

    void updateVehicle(Vehicle vehicle);
}

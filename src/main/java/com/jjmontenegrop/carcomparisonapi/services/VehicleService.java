package com.jjmontenegrop.carcomparisonapi.services;

import com.jjmontenegrop.carcomparisonapi.models.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehicleService {


    void addVehicle(Vehicle vehicle);

    List<Vehicle> getFilteredVehicles(String make, String model, Integer year, Double displacement, String fuelType, String transmission, Double minPrice, Double maxPrice);

    void updateVehicle(Vehicle vehicle);
}

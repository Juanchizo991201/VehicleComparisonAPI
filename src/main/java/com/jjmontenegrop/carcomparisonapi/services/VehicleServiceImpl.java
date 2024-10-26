package com.jjmontenegrop.carcomparisonapi.services;

import com.jjmontenegrop.carcomparisonapi.models.Vehicle;
import com.jjmontenegrop.carcomparisonapi.repositories.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getFilteredVehicles(String make, String model, Integer year, Double displacement, String fuelType, String transmission, Double minPrice, Double maxPrice) {

        if (make != null && model != null && year != null && displacement != null && fuelType != null && transmission != null && minPrice != null && maxPrice != null) {
            return vehicleRepository.findAll();
        }
        return vehicleRepository.findProductsByFilter(make, model, year, displacement, fuelType, transmission, minPrice, maxPrice);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}

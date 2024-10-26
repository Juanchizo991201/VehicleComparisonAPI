package com.jjmontenegrop.carcomparisonapi.repositories;

import com.jjmontenegrop.carcomparisonapi.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    @Query("SELECT v FROM Vehicle v WHERE " +
            "(:make IS NULL OR v.make = :make) AND " +
            "(:model IS NULL OR v.model = :model) AND " +
            "(:year IS NULL OR v.year = :year) AND " +
            "(:displacement IS NULL OR v.displacement = :displacement) AND " +
            "(:fuelType IS NULL OR v.fuelType = :fuelType) AND " +
            "(:transmission IS NULL OR v.transmission = :transmission) AND " +
            "((:minPrice IS NULL AND :maxPrice IS NULL) OR " +
            " (:minPrice IS NOT NULL AND :maxPrice IS NULL AND v.price >= :minPrice) OR " +
            " (:minPrice IS NULL AND :maxPrice IS NOT NULL AND v.price <= :maxPrice) OR " +
            " (:minPrice IS NOT NULL AND :maxPrice IS NOT NULL AND v.price BETWEEN :minPrice AND :maxPrice))")
    List<Vehicle> findProductsByFilter(@Param("make") String make,
                                       @Param("model") String model,
                                       @Param("year") Integer year,
                                        @Param("displacement") Double displacement,
                                       @Param("fuelType") String fuelType,
                                       @Param("transmission") String transmission,
                                       @Param("minPrice") Double minPrice,
                                       @Param("maxPrice") Double maxPrice);
}

package com.poornima.rentcloud.vehicleservice.repository;

import com.poornima.rentcloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}

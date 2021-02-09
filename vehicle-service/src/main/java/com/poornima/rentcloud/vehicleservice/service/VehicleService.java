package com.poornima.rentcloud.vehicleservice.service;

import com.poornima.rentcloud.model.vehicle.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle save(Vehicle customer);

    Vehicle findById(int id);

    List<Vehicle> findAll();
}

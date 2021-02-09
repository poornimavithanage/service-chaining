package com.poornima.rentcloud.model.vehicle;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String make;
    private String model;
    private String type;
    int year;
    int odometerValueOnRegister;
    String color;
}

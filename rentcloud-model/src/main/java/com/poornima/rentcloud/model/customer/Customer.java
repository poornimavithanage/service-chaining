package com.poornima.rentcloud.model.customer;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipCode;
    @OneToMany(mappedBy = "customer")
    private List<Loyalty>loyalties;

}

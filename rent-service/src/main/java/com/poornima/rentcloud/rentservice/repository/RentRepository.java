package com.poornima.rentcloud.rentservice.repository;

import com.poornima.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}

package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerDao extends JpaRepository<Passenger, Long> {
}

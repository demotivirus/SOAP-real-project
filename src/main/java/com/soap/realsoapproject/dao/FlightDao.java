package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDao extends JpaRepository<Flight, Long> {
}

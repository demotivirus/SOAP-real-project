package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.Flight;
import com.soap.realsoapproject.model.dictionary.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface FlightDao extends JpaRepository<Flight, Long> {
    List<Flight> findByDateFromAndCityFromAndCityTo(LocalDateTime localDateTime, City cityFrom, City cityTo);
}

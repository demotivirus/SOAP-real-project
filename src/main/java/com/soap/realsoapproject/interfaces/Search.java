package com.soap.realsoapproject.interfaces;

import com.soap.realsoapproject.model.Flight;
import com.soap.realsoapproject.model.dictionary.City;

import java.time.LocalDateTime;
import java.util.List;

public interface Search {
    List<Flight> findAirplane(LocalDateTime localDateTime, City cityFrom, City cityTo);
}

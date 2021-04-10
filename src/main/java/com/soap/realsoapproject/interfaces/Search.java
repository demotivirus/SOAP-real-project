package com.soap.realsoapproject.interfaces;

import com.soap.realsoapproject.model.Flight;
import com.soap.realsoapproject.model.dictionary.City;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;
import java.util.List;

@WebService
public interface Search {
    @WebMethod
    List<Flight> findFlight(LocalDateTime localDateTime, City cityFrom, City cityTo);
}

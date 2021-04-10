package com.soap.realsoapproject.interfaces.impl;

import com.soap.realsoapproject.dao.FlightDao;
import com.soap.realsoapproject.interfaces.Search;
import com.soap.realsoapproject.model.Flight;
import com.soap.realsoapproject.model.dictionary.City;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.time.LocalDateTime;
import java.util.List;

@WebService(endpointInterface = "com.soap.realsoapproject.interfaces.Search",
        serviceName = "FlightService")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Service
public class SearchImpl implements Search {
    private FlightDao flightDao;

    @Override
    public List<Flight> findFlight(LocalDateTime localDateTime, City cityFrom, City cityTo) {
        return flightDao.findByDateFromAndCityFromAndCityTo(localDateTime, cityFrom, cityTo);
    }
}

package com.soap.realsoapproject;

import com.soap.realsoapproject.dao.FlightDao;
import com.soap.realsoapproject.model.Flight;
import com.soap.realsoapproject.model.dictionary.Airplane;
import com.soap.realsoapproject.model.dictionary.City;
import com.soap.realsoapproject.model.dictionary.Company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
public class FlightDaoTest {
    @MockBean
    private FlightDao flightDao;

    @Test
    public void simpleDaoTest() {
        final LocalDateTime dateNow = LocalDateTime.now();
        City moscow = City.builder().name("Moscow").build();
        City paris = City.builder().name("Paris").build();

        Flight flight = Flight.builder()
                .id(1L)
                .dateFrom(dateNow)
                .cityFrom(moscow)
                .cityTo(paris)
                .build();

        List<Flight> flights = new ArrayList<>();
        flights.add(flight);

        Mockito.when(flightDao.findByDateFromAndCityFromAndCityTo(dateNow, moscow, paris)).thenReturn(flights);

        List<Flight> flightsFromDao =
                flightDao.findByDateFromAndCityFromAndCityTo(dateNow, moscow, paris);

        System.err.println(Arrays.asList(flightsFromDao));

        Assertions.assertEquals(flightDao.findByDateFromAndCityFromAndCityTo(dateNow, moscow, paris),
                flights);
    }
}

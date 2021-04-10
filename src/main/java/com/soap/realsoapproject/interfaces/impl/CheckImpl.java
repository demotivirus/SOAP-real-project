package com.soap.realsoapproject.interfaces.impl;

import com.soap.realsoapproject.dao.ReservationDao;
import com.soap.realsoapproject.interfaces.Check;
import com.soap.realsoapproject.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "Check")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CheckImpl implements Check {
    private ReservationDao reservationDao;

    @Override
    public Reservation checkReservation(String code) {
        return null;
    }
}

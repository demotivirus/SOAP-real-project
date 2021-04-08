package com.soap.realsoapproject.interfaces;

import com.soap.realsoapproject.model.Reservation;

public interface Check {
    Reservation checkReservation(String code);
}

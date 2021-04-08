package com.soap.realsoapproject.interfaces;

import com.soap.realsoapproject.model.Reservation;
import com.soap.realsoapproject.model.dictionary.Airplane;
import com.soap.realsoapproject.model.dictionary.Place;

public interface Buy {
    Reservation buyTicket(Airplane airplane, Place place, String addInfo);
}

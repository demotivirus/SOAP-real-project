package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDao extends JpaRepository<Reservation, Long> {
}

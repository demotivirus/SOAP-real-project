package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceDao extends JpaRepository<Place, Long> {
}

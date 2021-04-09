package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Long> {
}

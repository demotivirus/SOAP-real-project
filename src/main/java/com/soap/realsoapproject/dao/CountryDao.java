package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Long> {
}

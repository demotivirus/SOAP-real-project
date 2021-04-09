package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.AirplaneClasses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneClassesDao extends JpaRepository<AirplaneClasses, Long> {
}

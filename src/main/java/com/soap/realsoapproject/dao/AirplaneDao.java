package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneDao extends JpaRepository<Airplane, Long> {
}

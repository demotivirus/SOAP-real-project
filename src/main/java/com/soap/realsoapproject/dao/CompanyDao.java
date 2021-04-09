package com.soap.realsoapproject.dao;

import com.soap.realsoapproject.model.dictionary.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Long> {
}

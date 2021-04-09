package com.soap.realsoapproject.model;

import com.soap.realsoapproject.model.dictionary.Airplane;
import com.soap.realsoapproject.model.dictionary.City;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String code;
    LocalDateTime dateFrom;
    LocalDateTime dateTo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "airplane_id", referencedColumnName = "id")
    Airplane airplane;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_from_id", referencedColumnName = "id")
    City cityFrom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_to_id", referencedColumnName = "id")
    City cityTo;
}

package com.soap.realsoapproject.model;

import com.soap.realsoapproject.model.dictionary.Airplane;
import com.soap.realsoapproject.model.dictionary.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@Entity
@Table(name = "flight")
@XmlRootElement(name = "flight")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Flight {
    public Flight() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String code;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    LocalDateTime dateFrom;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
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

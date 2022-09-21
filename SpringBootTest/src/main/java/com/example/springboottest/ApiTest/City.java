package com.example.springboottest.ApiTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="city")
public class City {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="countryCode")
    private String countryCode;
    @Column(name="district")
    private String district;
    @Column(name="population")
    private int population;

}

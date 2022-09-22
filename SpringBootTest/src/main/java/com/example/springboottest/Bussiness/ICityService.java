package com.example.springboottest.Bussiness;

import com.example.springboottest.ApiTest.City;

import java.io.InvalidObjectException;
import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add(City city) throws InvalidObjectException;
    void update(City city);
    void delete(City city);
    City getCityByID(int id);
}


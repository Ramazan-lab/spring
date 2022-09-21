package com.example.springboottest.DAL;
import com.example.springboottest.ApiTest.City;

import java.util.ArrayList;
import java.util.List;

public interface ICityDal {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
}

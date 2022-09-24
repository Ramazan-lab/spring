package com.example.springboottest.Bussiness;

import com.example.springboottest.ApiTest.City;
import com.example.springboottest.DAL.HibernateCityDal;
import com.example.springboottest.DAL.ICityDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InvalidObjectException;
import java.util.List;
@Service
public class CityManager implements ICityService {

    private ICityDal cityDal;
    @Autowired

    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }

    @Override
    @Transactional
    public List<City> getAll() {

        return this.cityDal.getAll();
    }

    @Override
    @Transactional
    public void add(City city) throws InvalidObjectException {
        for(City temp: cityDal.getAll()) {
            if (temp.getName()==city.getName())
                throw new InvalidObjectException("ALREDAY EXIST");
        }
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public City getCityByID(int id) {
        return this.cityDal.getCityByID(id);
    }
}

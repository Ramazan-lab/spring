package com.example.springboottest.DAL;

import com.example.springboottest.ApiTest.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HibernateCityDal implements ICityDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional //build yaptıgınızda açma ve kapama kodlarını otomatik olarak koyar AOP
    public List<City> getAll() {
        //start
        Session session=entityManager.unwrap(Session.class);
        List<City> citties=session.createQuery
                ("from City",City.class).stream().collect(Collectors.toList());
        return citties;
        //finish

    }

    @Override
    public void add(City city) {

    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(City city) {

    }
}

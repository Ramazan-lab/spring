package com.example.springboottest.restApi;

import com.example.springboottest.ApiTest.City;
import com.example.springboottest.Bussiness.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.InvalidObjectException;
import java.util.*;

@RestController
@RequestMapping("/api")
public class CityController {

    private ICityService cityService;
    @Autowired
    public CityController(ICityService cityService) {

        this.cityService = cityService;
    }

    @Transactional
    @GetMapping("/citties")
    public List<City> getAll(){
        return this.cityService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody City city) throws InvalidObjectException {
        cityService.add(city);
    }
    @PostMapping("/update")
    public void update(@RequestBody City city)  {
        cityService.update(city);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody City city)  {
        cityService.delete(city);
    }
    @GetMapping("/citties/{id}")
    public City getCityByID(@PathVariable int id){
        return this.cityService.getCityByID(id);
    }



}

package com.example.springboottest.ApiTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductsController {
    @GetMapping("/")
    public String Get(){
    return "phone";
    }
    @GetMapping("/ramazan")
    public ArrayList<String> GetArray(){
        ArrayList<String> arr=new ArrayList<>();
        arr.add("laptop");
        arr.add("computer");
        return arr;
    }
}

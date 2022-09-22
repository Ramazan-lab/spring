package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.entity.Product;

import java.util.List;

public interface IProductService<Type> {

    void create(Type t);
    Type update(Long id,Type t);
    void delete(Long id);
    List<Type> getAll();

    Type getProductById(Long id);
    boolean checkProductIsExist(Long id);
}

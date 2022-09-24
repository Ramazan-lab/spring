package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;

import java.util.List;

public interface ICategoryService <Type>{
    void create(Type t);
    void update(Category t);
    void delete(Long id);
    List<Type> getAll();

    Category getCategoryById(Long id);
    boolean checkCategoryIsExist(Long id);
    Category getProductByCategoryId();


}

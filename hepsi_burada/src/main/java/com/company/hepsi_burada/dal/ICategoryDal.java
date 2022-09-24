package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.entity.Product;

import java.util.List;
import java.util.Set;

public interface ICategoryDal <Type>{
    void create(Type t);//done
    void update(Type t);//done
    void delete(Long id);//done
    List<Type> getAll();//done
    Type getCategoryById(Long id);//done
    boolean checkCategoryIsExist(Long id);//done

}



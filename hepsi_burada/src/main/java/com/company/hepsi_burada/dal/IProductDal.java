package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.dto.ProductDto;

import java.util.List;

public interface IProductDal <Type>{
    void create(Type t);
    Type update(Long id,Type t);
    void delete(Long id);
    List<ProductDto> getAll();
    Type getProductById(Long id);
    boolean checkProductIsExist(Long id);
}

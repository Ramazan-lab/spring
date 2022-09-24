package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Product;

import java.util.List;

public interface IProductService<Type> {

    void create(Type t);
    void update(Product t);
    void delete(Long id);
    List<Type> getAll();

    Product getProductById(Long id);
    boolean checkProductIsExist(Long id);
    List<Product> getproductsByCategoryId(Long category_id);

}

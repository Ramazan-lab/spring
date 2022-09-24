package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;
import org.hibernate.mapping.PrimaryKey;

import java.util.List;

public interface IProductDal <Type>{
    void create(Type t);//done
    void update(Type t);
    void delete(Long id);
    List<Type> getAll();//done
    Type getProductById(Long id);
    boolean checkProductIsExist(Long id);
    List<Product> getproductsByCategoryId(Long category_id);

}

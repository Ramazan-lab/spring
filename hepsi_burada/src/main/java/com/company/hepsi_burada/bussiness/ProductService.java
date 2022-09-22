package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.dal.IProductDal;
import com.company.hepsi_burada.dal.ProductDal;
import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService<ProductDto> {

    public ProductService(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Autowired
    private IProductDal productDal;

    @Override
    public void create(ProductDto t) {

        Product p1=new Product(t.getName(),t.getPrice());
        this.productDal.create(p1);
    }

    @Override
    public ProductDto update(Long id, ProductDto t) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override

    public List<ProductDto> getAll() {
        return this.productDal.getAll();
    }

    @Override
    public ProductDto getProductById(Long id) {
        return null;
    }

    @Override
    public boolean checkProductIsExist(Long id) {
        return false;
    }
}

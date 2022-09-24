package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.dal.IProductDal;
import com.company.hepsi_burada.dal.ProductDal;
import com.company.hepsi_burada.dal.ProductRepository;
import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService<Product> {
    @Autowired
    private IProductDal productDal;

    @Autowired
    private ProductRepository productRepository;
    public ProductService(IProductDal productDal,ProductRepository productRepository) {

        this.productDal = productDal;
        this.productRepository=productRepository;
    }



    @Override
    public void create(Product t) {

        this.productDal.create(t);
    }

    @Override
    @Transactional
    public void update(Product product) {
        this.productDal.update(product);
    }


    @Override
    public void delete(Long id) {
            this.productDal.delete(id);
    }

    @Override
    public List<Product> getAll() {
        return this.productDal.getAll();
    }

    @Override
    public Product getProductById(Long id) {
        if(id!=null) {
            return (Product) this.productDal.getProductById(id);
        }
        return null;
    }

    @Override
    public boolean checkProductIsExist(Long id) {

        return this.productDal.checkProductIsExist(id);
    }

    @Override
    public List<Product> getproductsByCategoryId(Long category_id) {
        return (List<Product>) this.productDal.getproductsByCategoryId(category_id);
    }
}

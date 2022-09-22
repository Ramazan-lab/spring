package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductDal implements IProductDal<Product> {
    @Autowired
    private EntityManager entityManager;
    public ProductDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void create(Product t) {
        Session s=entityManager.unwrap(Session.class);
        s.saveOrUpdate(t);
    }

    @Override
    public Product update(Long id, Product t) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    @Transactional
    public List<ProductDto> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<Product> products=session.createQuery
                ("from Product",Product.class).stream().collect(Collectors.toList());
        List<ProductDto> productDtoList=new ArrayList<>();
        products.stream().forEach(item->{
            ProductDto productDto=new ProductDto();
            productDto.setName(item.getName());
            productDto.setPrice(item.getPrice());
            productDtoList.add(productDto);
        });
        return productDtoList;
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public boolean checkProductIsExist(Long id) {
        return false;
    }
}
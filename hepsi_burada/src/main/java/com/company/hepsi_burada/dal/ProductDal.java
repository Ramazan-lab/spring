package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ProductDal implements IProductDal<Product> {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ProductRepository productRepository;
    public ProductDal(EntityManager entityManager,ProductRepository productRepository) {
        this.entityManager = entityManager;
        this.productRepository = productRepository;
    }


    @Override
    public void create(Product t) {
        Session s=entityManager.unwrap(Session.class);
        s.saveOrUpdate(t);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }


    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);

    }
    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        Session session=entityManager.unwrap(Session.class);
        Product product=session.get(Product.class,id);
        return product;
    }

    @Override
    public boolean checkProductIsExist(Long id) {
        Product product=productRepository.findById(id).orElse(null);
        if(product!=null)
            return true;
        return false;
    }

        @Override
        public List<Product> getproductsByCategoryId(Long category_id){
            Session session=entityManager.unwrap(Session.class);
            List<Product> productList= Collections.singletonList(session.get(Product.class, category_id));
           productList.forEach(item->{
               //System.out.println(item.getCategory());
               System.out.println(item.getName());
               System.out.println(item.getPrice());
           });
            return productList;
          }


}
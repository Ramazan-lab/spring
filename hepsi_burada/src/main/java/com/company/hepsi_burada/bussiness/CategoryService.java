package com.company.hepsi_burada.bussiness;

import com.company.hepsi_burada.dal.ICategoryDal;
import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CategoryService implements ICategoryService<Category>{

    @Autowired
    private ICategoryDal categoryDal;

    public CategoryService(ICategoryDal categoryDal) {
        this.categoryDal = categoryDal;
    }


    @Override
    public void create(Category t) {
        this.categoryDal.create(t);
    }

    @Override
    public void update(Category t) {
        this.categoryDal.update(t);
    }

    @Override
    public void delete(Long id) {
        this.categoryDal.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return this.categoryDal.getAll();

    }

    @Override
    public Category getCategoryById(Long id) {
        return (Category) this.categoryDal.getCategoryById(id);
    }

    @Override
    public boolean checkCategoryIsExist(Long id) {
        return this.categoryDal.checkCategoryIsExist(id);
    }

    @Override
    public Category getProductByCategoryId() {
        return null;
    }


}

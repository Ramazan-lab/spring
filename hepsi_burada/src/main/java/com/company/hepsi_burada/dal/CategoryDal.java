package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Repository
public class CategoryDal implements ICategoryDal<Category>{
    @Autowired
    private ICategoryRepository categoryRepository;


    public CategoryDal(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void create(Category t) {
        categoryRepository.save(t);
    }

    @Override
    public void update(Category t) {
        categoryRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }


    @Override
    public List<Category> getAll() {

        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public boolean checkCategoryIsExist(Long id) {
        Category category= categoryRepository.findById(id).orElse(null);
        if (category!=null)
            return true;
        return false;
    }


}

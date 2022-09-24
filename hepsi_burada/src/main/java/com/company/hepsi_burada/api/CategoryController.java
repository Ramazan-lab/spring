package com.company.hepsi_burada.api;

import com.company.hepsi_burada.bussiness.ICategoryService;
import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/create")
    public void create(@RequestBody Category category){

        categoryService.create(category);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        categoryService.delete(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Category category){
        categoryService.update(category);
    }

    @GetMapping("/categories")
    public List<Category> getAll(){
        return this.categoryService.getAll();
    }
    @GetMapping("/categorybyid/{id}")
    public Category getCategoryById(@PathVariable Long id){
        return this.categoryService.getCategoryById(id);
    }


}

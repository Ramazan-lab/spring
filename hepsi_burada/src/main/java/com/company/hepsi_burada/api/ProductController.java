package com.company.hepsi_burada.api;

import com.company.hepsi_burada.bussiness.IProductService;
import com.company.hepsi_burada.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    public ProductController(IProductService productService) {

        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody Product product){
        productService.create(product);
        return ResponseEntity.ok(product);
    }


    @GetMapping("/products")
    public List<Product> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/update")
    public void update(@RequestBody Product product){
        productService.update(product);
    }

    @PostMapping("/delete/{id}")
    public void delete(@PathVariable Long id){

        this.productService.delete(id);
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){

        return this.productService.getProductById(id);
    }
    @GetMapping("/check/{id}")
    public boolean checkProductIsExist(@PathVariable Long id){

        return this.productService.checkProductIsExist(id);
    }

    @GetMapping("/hell/{category_id}")
    public List<Product> getproductsByCategoryId(@PathVariable Long category_id){
        return this.productService.getproductsByCategoryId(category_id);
    }

}

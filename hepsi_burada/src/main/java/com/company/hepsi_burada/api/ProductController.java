package com.company.hepsi_burada.api;

import com.company.hepsi_burada.bussiness.IProductService;
import com.company.hepsi_burada.dto.ProductDto;
import com.company.hepsi_burada.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {
    @Autowired
    private IProductService productService;
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto productDto){
        productService.create(productDto);
        return ResponseEntity.ok(productDto);
    }

    @Transactional
    @GetMapping("/productsDto")
    public List<ProductDto> getAll(){
        return this.productService.getAll();
    }


}

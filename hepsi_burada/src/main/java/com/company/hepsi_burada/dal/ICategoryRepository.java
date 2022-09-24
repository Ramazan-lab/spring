package com.company.hepsi_burada.dal;

import com.company.hepsi_burada.entity.Category;
import com.company.hepsi_burada.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {


}

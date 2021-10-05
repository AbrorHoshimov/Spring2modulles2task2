package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}

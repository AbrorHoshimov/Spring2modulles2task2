package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.InputProduct;
import com.example.lesson2task1.projection.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}

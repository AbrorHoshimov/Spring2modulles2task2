package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Attachment;
import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}

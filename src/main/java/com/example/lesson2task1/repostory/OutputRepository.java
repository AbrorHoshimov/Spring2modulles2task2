package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Output;
import com.example.lesson2task1.projection.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output,Integer> {
}

package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Input;
import com.example.lesson2task1.projection.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input",excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input,Integer> {
}

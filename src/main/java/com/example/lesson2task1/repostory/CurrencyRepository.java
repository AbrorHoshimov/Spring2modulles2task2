package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Currency;
import com.example.lesson2task1.projection.MeasurmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = MeasurmentProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}

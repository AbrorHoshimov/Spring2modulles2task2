package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Measurement;
import com.example.lesson2task1.projection.MeasurmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurmentProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}

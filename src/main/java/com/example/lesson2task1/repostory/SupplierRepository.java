package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Supplier;
import com.example.lesson2task1.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}

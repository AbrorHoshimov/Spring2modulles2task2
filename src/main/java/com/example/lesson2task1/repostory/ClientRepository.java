package com.example.lesson2task1.repostory;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Client;
import com.example.lesson2task1.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = SupplierProjection.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}

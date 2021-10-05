package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.Measurement;
import com.example.lesson2task1.entity.Supplier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "supplierprojection",types ={ Supplier.class})
public interface SupplierProjection {
        @Value("#{target.id}")
        Integer getId();

        String getPhoneNumber();

        String getName();

        boolean isActive();
}

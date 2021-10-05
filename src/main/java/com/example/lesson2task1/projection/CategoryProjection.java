package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.Category;
import com.example.lesson2task1.entity.Measurement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "categoryProjection",types =Category.class)
public interface CategoryProjection {
        @Value("#{target.id}")
        Integer getId();
        String getName();
        boolean isActive();
        Category getParentCategory();
}

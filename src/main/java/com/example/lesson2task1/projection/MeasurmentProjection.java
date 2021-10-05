package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.Measurement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "measurmentprojection",types ={ Measurement.class})
public interface MeasurmentProjection {
        @Value("#{target.id}")
        Integer getId();

        String getName();
        boolean isActive();
}

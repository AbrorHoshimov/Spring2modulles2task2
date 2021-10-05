package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;
import java.util.Date;

@Projection(name = "outputProductProjection",types = OutputProduct.class)
public interface OutputProductProjection {
        @Value("#{target.id}")
        Integer getId();

        Product getProduct();
        double getAmount();
        double getPrice();
        Output getOutput();

        Timestamp getCreatedAt();


}

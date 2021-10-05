package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Projection(name = "inputProductProjection",types = InputProduct.class)
public interface InputProductProjection {
        @Value("#{target.id}")
        Integer getId();

        Product getProduct();
        double getAmount();
        double getPrice();
        Date getExpireDate();
        Input getInput();


        Timestamp getCreatedAt();


}

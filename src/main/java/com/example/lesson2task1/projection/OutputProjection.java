package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;
import java.util.Date;

@Projection(name = "outputProjection",types = Output.class)
public interface OutputProjection {
        @Value("#{target.id}")
        Integer getId();
        Timestamp getCreatedAt();
        Date getDate();
        Warehouse getWarehouse();
        Client getClient();
        Currency getCurrency();
        String getFactureNumber();
        String getCode();
}

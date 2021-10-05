package com.example.lesson2task1.projection;

import com.example.lesson2task1.entity.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Date;

@Projection(name = "inputProjection",types = Input.class)
public interface InputProjection {
        @Value("#{target.id}")
        Integer getId();
        Timestamp getCreatedAt();
        Date getDate();
        Warehouse getWarehouse();
        Supplier getSupplier();
        Currency getCurrency();
        String getFactureNumber();
        String getCode();
}

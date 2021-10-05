package com.example.lesson2task1.entity;

import com.example.lesson2task1.entity.template.AbsNameEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
public class User extends AbsNameEntity {
    private String lastName;
    private String phoneNumber;
    private String code;
    private String password;

    @ManyToMany
    private List<Warehouse> warehouses;
}

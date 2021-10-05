package com.example.lesson2task1.entity;

import com.example.lesson2task1.entity.template.AbsNameEntity;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
public class Measurement extends AbsNameEntity {
}

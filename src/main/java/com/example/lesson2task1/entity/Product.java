package com.example.lesson2task1.entity;

import com.example.lesson2task1.entity.template.AbsNameEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Product extends AbsNameEntity {

    @ManyToOne
    private Category category;
    @OneToMany
    private List<Attachment> attachments;
    private String code;
    @OneToOne
    private Measurement measurement;

}

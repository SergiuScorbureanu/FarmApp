package com.FarmApp.FarmApp.Entities;

import com.FarmApp.FarmApp.Entities.abstracts.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "Products")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "quantityInput")
    private int quantityInput;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "availableDate")
    private Date availableDate;

    @Column(name = "expirationDate")
    private Date expirationDate;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "alergens")
    private String alergens;
}

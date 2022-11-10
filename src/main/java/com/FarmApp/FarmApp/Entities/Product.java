package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "Products")
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
    private String[] ingredients;

    @Column(name = "alergens")
    private String[] alergens;

    public Product(){
    }

    public Product(String name, String image, int quantityInput, double price, String description,
                   Date availableDate, Date expirationDate, String[] ingredients, String[] alergens) {
        this.name = name;
        this.image = image;
        this.quantityInput = quantityInput;
        this.price = price;
        this.description = description;
        this.availableDate = availableDate;
        this.expirationDate = expirationDate;
        this.ingredients = ingredients;
        this.alergens = alergens;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", quantityInput=" + quantityInput +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", availableDate=" + availableDate +
                ", expirationDate=" + expirationDate +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", alergens=" + Arrays.toString(alergens) +
                '}';
    }
}

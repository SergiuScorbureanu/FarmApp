package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Categories")
@Getter
@Setter
public class Category {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    public Category(){
    }

    public Category(String name, String image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "category_id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}

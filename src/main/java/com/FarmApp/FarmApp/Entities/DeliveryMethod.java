package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DeliveryMethods")
@Getter
@Setter
public class DeliveryMethod {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public DeliveryMethod(){
    }

    public DeliveryMethod(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeliveryMethods{" +
                "delivery_method_id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

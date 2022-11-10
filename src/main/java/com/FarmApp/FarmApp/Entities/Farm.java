package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "Farms")
@Getter
@Setter
public class Farm {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "galery")
    private String galery;

    @Column(name = "location")
    private double[] location;

    @Column(name = "deliveryLocations")
    private double[] deliveryLocations;

    public Farm(){
    }

    public Farm(String address, String phone, String galery, double[] location, double[] deliveryLocations) {
        this.address = address;
        this.phone = phone;
        this.galery = galery;
        this.location = location;
        this.deliveryLocations = deliveryLocations;
    }

    @Override
    public String toString() {
        return "Farms{" +
                "farm_id=" + id +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", galery='" + galery + '\'' +
                ", location=" + location +
                ", deliveryLocations=" + Arrays.toString(deliveryLocations) +
                '}';
    }
}

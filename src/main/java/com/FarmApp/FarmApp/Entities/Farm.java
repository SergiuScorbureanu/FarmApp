package com.FarmApp.FarmApp.Entities;

import com.FarmApp.FarmApp.Entities.abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Arrays;

@Entity
@Table(name = "Farms")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Farm extends BaseEntity {

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "galery")
    private String galery;

    @Column(name = "location")
    private Double location;
}

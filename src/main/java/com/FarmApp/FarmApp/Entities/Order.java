package com.FarmApp.FarmApp.Entities;

import com.FarmApp.FarmApp.Entities.abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Orders")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order extends BaseEntity {

    @Column(name = "quantityInput")
    private int quantityInput;

    @Column(name = "price")
    private double price;

    @Column(name = "orderStatus")
    private String orderStatus;
}

package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
@Getter
@Setter
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quantityInput")
    private int quantityInput;

    @Column(name = "price")
    private double price;

    @Column(name = "orderStatus")
    private String orderStatus;

    public Order(){
    }

    public Order(int quantityInput, double price, String orderStatus) {
        this.quantityInput = quantityInput;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + id +
                ", quantity_input=" + quantityInput +
                ", price=" + price +
                ", order_status='" + orderStatus + '\'' +
                '}';
    }
}

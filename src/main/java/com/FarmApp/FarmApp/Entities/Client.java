package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
@Getter
@Setter
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "location")
    private double location;

    public Client(){
    }

    public Client(String name, String address, String email, String phone, double location) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "client_id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", location=" + location +
                '}';
    }
}

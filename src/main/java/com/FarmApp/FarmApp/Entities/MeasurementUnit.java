package com.FarmApp.FarmApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MeasurementUnits")
@Getter
@Setter
public class MeasurementUnit {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "symbol")
    private String symbol;

    public MeasurementUnit(){
    }

    public MeasurementUnit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "MeasurementUnits{" +
                "measurement_unit_id=" + id +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}

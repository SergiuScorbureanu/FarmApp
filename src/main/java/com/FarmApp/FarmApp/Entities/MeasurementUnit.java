package com.FarmApp.FarmApp.Entities;

import com.FarmApp.FarmApp.Entities.abstracts.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Entity
@Table(name = "MeasurementUnits")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MeasurementUnit extends BaseEntity {

    @Column(name = "symbol")
    private String symbol;
}

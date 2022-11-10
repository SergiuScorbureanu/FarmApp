package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.MeasurementUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementUnitsRepository extends JpaRepository<MeasurementUnit, Long> {
}

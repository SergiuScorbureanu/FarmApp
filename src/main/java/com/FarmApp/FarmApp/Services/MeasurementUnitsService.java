package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.MeasurementUnit;
import com.FarmApp.FarmApp.Repositories.MeasurementUnitsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasurementUnitsService {

    private final MeasurementUnitsRepository measurementUnitsRepository;

    public MeasurementUnitsService(MeasurementUnitsRepository measurementUnitsRepository){
        this.measurementUnitsRepository = measurementUnitsRepository;
    }

    public List<MeasurementUnit> getMeasurementUnits(){
        return measurementUnitsRepository.findAll();
    }

    public void createMeasurementUnit(MeasurementUnit measurementUnit){
        measurementUnitsRepository.save(measurementUnit);
    }

    public void updateMeasurementUnit(Long id, MeasurementUnit measurementUnit) {
        MeasurementUnit measurementUnitToUpdate = measurementUnitsRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        measurementUnitToUpdate.setSymbol(measurementUnit.getSymbol());
        measurementUnitsRepository.save(measurementUnitToUpdate);
    }

    public void deleteMeasurementUnit(Long id){
        measurementUnitsRepository.deleteById(id);
    }
}

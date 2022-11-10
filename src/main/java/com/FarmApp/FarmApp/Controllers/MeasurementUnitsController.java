package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.MeasurementUnit;
import com.FarmApp.FarmApp.Services.MeasurementUnitsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/measurementUnits")
public class MeasurementUnitsController {

    private final MeasurementUnitsService measurementUnitsService;

    public MeasurementUnitsController(MeasurementUnitsService measurementUnitsService){
        this.measurementUnitsService = measurementUnitsService;
    }

    @GetMapping
    public List<MeasurementUnit> getMeasurementUnits(){
        return measurementUnitsService.getMeasurementUnits();
    }

    @PostMapping
    public void createMeasurementUnit(@RequestBody MeasurementUnit measurementUnit) {
        measurementUnitsService.createMeasurementUnit(measurementUnit);
    }

    @PutMapping(path = "{id}")
    public void updateMeasurementUnit(@PathVariable Long id, @RequestBody MeasurementUnit measurementUnit) {
        measurementUnitsService.updateMeasurementUnit(id, measurementUnit);
    }

    @DeleteMapping(path = "{id}")
    public void deleteMeasurementUnit(@PathVariable Long id){
        measurementUnitsService.deleteMeasurementUnit(id);
    }
}

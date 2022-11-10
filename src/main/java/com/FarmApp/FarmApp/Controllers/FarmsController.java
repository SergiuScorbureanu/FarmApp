package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.Farm;
import com.FarmApp.FarmApp.Services.FarmsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/farms")
public class FarmsController {

    private final FarmsService farmsService;

    public FarmsController(FarmsService farmsService){
        this.farmsService = farmsService;
    }

    @GetMapping
    public List<Farm> getFarms(){
        return farmsService.getFarms();
    }

    @PostMapping
    public void createFarm(@RequestBody Farm farm) {
        farmsService.createFarm(farm);
    }

    @PutMapping(path = "{id}")
    public void updateFarm(@PathVariable Long id, @RequestBody Farm farm) {
        farmsService.updateFarm(id, farm);
    }

    @DeleteMapping(path = "{id}")
    public void deleteFarm(@PathVariable Long id){
        farmsService.deleteFarm(id);
    }
}

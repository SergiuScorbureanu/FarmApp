package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Farm;
import com.FarmApp.FarmApp.Repositories.FarmsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmsService {

    private final FarmsRepository farmsRepository;

    public FarmsService(FarmsRepository farmsRepository){
        this.farmsRepository = farmsRepository;
    }

    public List<Farm> getFarms(){
        return farmsRepository.findAll();
    }

    public void createFarm(Farm farm){
        farmsRepository.save(farm);
    }

    public void updateFarm(Long id, Farm farm) {
        Farm farmToUpdate = farmsRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        farmToUpdate.setAddress(farm.getAddress());
        farmToUpdate.setLocation(farm.getLocation());
        farmToUpdate.setPhone(farm.getPhone());
        farmToUpdate.setGalery(farm.getGalery());
        farmToUpdate.setDeliveryLocations(farm.getDeliveryLocations());
        farmsRepository.save(farmToUpdate);
    }

    public void deleteFarm(Long id){
        farmsRepository.deleteById(id);
    }
}

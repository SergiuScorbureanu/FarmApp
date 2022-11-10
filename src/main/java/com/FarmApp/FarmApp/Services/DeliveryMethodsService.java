package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.DeliveryMethod;
import com.FarmApp.FarmApp.Repositories.DeliveryMethodsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryMethodsService {

    private final DeliveryMethodsRepository deliveryMethodsRepository;

    public DeliveryMethodsService(DeliveryMethodsRepository deliveryMethodsRepository){
        this.deliveryMethodsRepository = deliveryMethodsRepository;
    }

    public List<DeliveryMethod> getDeliveryMethods(){
        return deliveryMethodsRepository.findAll();
    }

    public void createDeliveryMethods(DeliveryMethod deliveryMethod){
        deliveryMethodsRepository.save(deliveryMethod);
    }

    public void updateDeliveryMethods(Long id, DeliveryMethod deliveryMethod) {
        DeliveryMethod deliveryMethodToUpdate = deliveryMethodsRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        deliveryMethodToUpdate.setName(deliveryMethod.getName());
        deliveryMethodsRepository.save(deliveryMethodToUpdate);
    }

    public void deleteDeliveryMethods(Long id){
        deliveryMethodsRepository.deleteById(id);
    }
}

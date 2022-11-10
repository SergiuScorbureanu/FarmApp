package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.DeliveryMethod;
import com.FarmApp.FarmApp.Services.DeliveryMethodsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/deliveryMethods")
public class DeliveryMethodsController {

    private final DeliveryMethodsService deliveryMethodsService;

    public DeliveryMethodsController(DeliveryMethodsService deliveryMethodsService){
        this.deliveryMethodsService = deliveryMethodsService;
    }

    @GetMapping
    public List<DeliveryMethod> getDeliveryMethods(){
        return deliveryMethodsService.getDeliveryMethods();
    }

    @PostMapping
    public void createDeliveryMethod(@RequestBody DeliveryMethod deliveryMethod) {
        deliveryMethodsService.createDeliveryMethods(deliveryMethod);
    }

    @PutMapping(path = "{id}")
    public void updateDeliveryMethod(@PathVariable Long id, @RequestBody DeliveryMethod deliveryMethod) {
        deliveryMethodsService.updateDeliveryMethods(id, deliveryMethod);
    }

    @DeleteMapping(path = "{id}")
    public void deleteDeliveryMethod(@PathVariable Long id){
        deliveryMethodsService.deleteDeliveryMethods(id);
    }
}

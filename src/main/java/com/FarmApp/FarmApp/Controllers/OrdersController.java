package com.FarmApp.FarmApp.Controllers;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Entities.Farm;
import com.FarmApp.FarmApp.Entities.Order;
import com.FarmApp.FarmApp.Services.OrdersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/farmapp/v1/orders")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @GetMapping
    public List<Order> getOrders(){
        return ordersService.getOrders();
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        ordersService.createOrder(order);
    }

    @PutMapping(path = "{id}")
    public void updateOrder(@PathVariable Long id, @RequestBody Order order) {
        ordersService.updateOrder(id, order);
    }

    @DeleteMapping(path = "{id}")
    public void deleteOrder(@PathVariable Long id){
        ordersService.deleteOrder(id);
    }
}

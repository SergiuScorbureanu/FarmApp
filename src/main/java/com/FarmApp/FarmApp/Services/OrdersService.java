package com.FarmApp.FarmApp.Services;

import com.FarmApp.FarmApp.Entities.Category;
import com.FarmApp.FarmApp.Entities.Farm;
import com.FarmApp.FarmApp.Entities.Order;
import com.FarmApp.FarmApp.Repositories.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

    public List<Order> getOrders(){
        return ordersRepository.findAll();
    }

    public void createOrder(Order order){
        ordersRepository.save(order);
    }

    public void updateOrder(Long id, Order order) {
        Order orderToUpdate = ordersRepository.findById(id).orElseThrow(() -> new IllegalStateException(String.format("plm")));
        orderToUpdate.setQuantityInput(order.getQuantityInput());
        orderToUpdate.setPrice(order.getPrice());
        orderToUpdate.setOrderStatus(order.getOrderStatus());
        ordersRepository.save(orderToUpdate);
    }

    public void deleteOrder(Long id){
        ordersRepository.deleteById(id);
    }
}

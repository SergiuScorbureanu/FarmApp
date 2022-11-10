package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Long> {
}

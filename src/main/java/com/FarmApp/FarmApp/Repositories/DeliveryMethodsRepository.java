package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.DeliveryMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryMethodsRepository extends JpaRepository<DeliveryMethod, Long> {
}

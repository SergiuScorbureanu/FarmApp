package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long> {
}

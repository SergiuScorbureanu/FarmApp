package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {
}

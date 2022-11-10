package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmsRepository extends JpaRepository<Farm, Long> {
}

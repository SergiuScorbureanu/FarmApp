package com.FarmApp.FarmApp.Repositories;

import com.FarmApp.FarmApp.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
}

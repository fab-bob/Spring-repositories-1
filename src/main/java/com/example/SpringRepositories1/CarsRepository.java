package com.example.SpringRepositories1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarsRepository extends JpaRepository<Cars, Integer> {
}

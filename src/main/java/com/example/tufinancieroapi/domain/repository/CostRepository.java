package com.example.tufinancieroapi.domain.repository;

import com.example.tufinancieroapi.domain.model.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JpaRepository<Cost, Integer> {
}

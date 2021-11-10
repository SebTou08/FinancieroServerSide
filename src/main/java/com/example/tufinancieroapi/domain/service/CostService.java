package com.example.tufinancieroapi.domain.service;

import com.example.tufinancieroapi.domain.model.Cost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CostService {
    Page<Cost> getAllCosts(Pageable pageable);
    Cost createCost(Cost cost);
}

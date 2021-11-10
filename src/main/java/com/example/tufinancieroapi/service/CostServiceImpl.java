package com.example.tufinancieroapi.service;

import com.example.tufinancieroapi.domain.model.Cost;
import com.example.tufinancieroapi.domain.repository.CostRepository;
import com.example.tufinancieroapi.domain.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CostServiceImpl implements CostService{
    @Autowired
    CostRepository _costRepo;

    @Override
    public Page<Cost> getAllCosts(Pageable pageable) {
        Page<Cost> costs = _costRepo.findAll(pageable);
        return costs;
    }

    @Override
    public Cost createCost(Cost cost) {
        return _costRepo.save(cost);
    }
}

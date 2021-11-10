package com.example.tufinancieroapi.domain.service;

import com.example.tufinancieroapi.domain.model.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CompanyService {
    Page<Company> getAllSubscriptions(Pageable pageable);
    Company createCompany(Company company);
}

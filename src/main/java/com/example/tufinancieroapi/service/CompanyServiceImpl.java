package com.example.tufinancieroapi.service;

import com.example.tufinancieroapi.domain.model.Company;
import com.example.tufinancieroapi.domain.repository.CompanyRepository;
import com.example.tufinancieroapi.domain.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepository _repo;

    @Override
    public Page<Company> getAllSubscriptions(Pageable pageable) {
        Page<Company> companies = _repo.findAll(pageable);
        return companies;
    }

    @Override
    public Company createCompany(Company company) {
        return _repo.save(company);
    }
}

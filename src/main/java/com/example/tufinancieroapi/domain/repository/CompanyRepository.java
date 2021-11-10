package com.example.tufinancieroapi.domain.repository;

import com.example.tufinancieroapi.domain.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository  extends JpaRepository<Company, Integer> {
}

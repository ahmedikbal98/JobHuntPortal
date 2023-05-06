package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
 public Long findCompanyIdByCompanyName(String companyName);
}

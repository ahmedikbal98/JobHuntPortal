package com.company.service;

import java.util.List;

import com.company.entity.Company;
import com.company.model.Job;

public interface CompanyService {
	   //Creating company
		public Company createCompany(Company company);
		
		//Create job for this company
//		public Job createjobForThisCompany(Job job,Long companyId);
		
	   //GetCompanyById
		public Company getCompanyById(Long id);
	   //GetAll Company
		public List<Company> getAllCompany();
	   //Delete Company
		public void deleteCompany(Long id);
}

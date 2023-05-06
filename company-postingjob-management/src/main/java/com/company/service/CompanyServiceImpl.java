package com.company.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.exceptions.ResourceNotFoundException;
import com.company.externalServices.JobService;
import com.company.model.Job;
import com.company.repository.CompanyRepository;


@Service
public class CompanyServiceImpl implements CompanyService {
    
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	JobService jobService;
	
	//service method To create a new companuy
	@Override
	public Company createCompany(Company company) {
		
		return companyRepository.save(company);
	}
	
	
	

	
	//service method To get company info along with job posted info by company ID
	@Override
	public Company getCompanyById(Long companyId) {
		

	Company res =  companyRepository.findById(companyId).orElseThrow(
				()-> new ResourceNotFoundException("No company found with this specified ID")
				);
		List<Job> jobsFromJs = (List<Job>) jobService.getJobByCompanyIdApi(companyId);
		res.setJobs(jobsFromJs);
		return res;
	}

	
	//service method To get all company info along with job posted by them
	@Override
	public List<Company> getAllCompany() {
		
		List<Company> companyRaw = companyRepository.findAll();
		
		
		List<Company> companyWithJobInfo = companyRaw.stream().map(company->{
		
		List<Job> jobsFromJs = (List<Job>) jobService.getJobByCompanyIdApi(company.getCompanyId());
		company.setJobs(jobsFromJs);
		return company;	
			
		}).collect(Collectors.toList());
		return companyWithJobInfo;
	}
	
	//service method To delete a company with company ID
	@Override
	public void deleteCompany(Long id) {
		companyRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("No company found with this specified ID")
				);
		companyRepository.deleteById(id);
		
	
	}




// Creating job post for this company
//	@Override
//	public Job createjobForThisCompany(Job job, Long companyId) {
//		job.setCompanyId(companyId);
//		return jobService.createJobApi(job).getBody();
//	
//	}
//   
	
	
}

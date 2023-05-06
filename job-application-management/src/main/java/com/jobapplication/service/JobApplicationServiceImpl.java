package com.jobapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobapplication.entity.JobApplication;
import com.jobapplication.externalservice.JobService;
import com.jobapplication.repository.JobApplicationRepository;
import com.jopbapplication.model.Job;


@Service
public class JobApplicationServiceImpl implements JobApplicationService {
     
	@Autowired
	JobApplicationRepository applicationRepo;
	
	//External service
	@Autowired
	JobService jobService;
	
	
	//Create
	@Override
	public String createJobApplication(JobApplication application) {
	    JobApplication ja = applicationRepo.save(application);
	    Long appId = ja.getApplicationId();
		return "Application created Successfully...Application id is "+appId;
	}
    
	//Get a single
	@Override
	public JobApplication getSingleJobApplication(Long applicationId) {
		
		return  applicationRepo.findById(applicationId).orElseThrow(()-> new com.jobapplication.exception.ResourceNotFoundException("invalid job application id"));			

	}
     
	//Get all applications
	@Override
	public List<JobApplication> getAllApplication() {
		
		return applicationRepo.findAll();
	}
    
	//delete an application
	@Override
	public void deleteAnApplication(Long applicationId) {
		applicationRepo.deleteById(applicationId);

	}

	@Override
	public List<JobApplication> getApplicationByUserId(Long userId) {
		
		List<JobApplication> appListRaw = applicationRepo.findByUserId(userId);
		
		   return appListRaw;	
	
	}

}

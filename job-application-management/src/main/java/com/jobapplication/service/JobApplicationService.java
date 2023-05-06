package com.jobapplication.service;

import java.util.List;

import com.jobapplication.entity.JobApplication;

public interface JobApplicationService {
  //create application
	
	public String createJobApplication(JobApplication application);
	
  // get a single application
	public JobApplication getSingleJobApplication(Long applicationId);
	
	// get All Application
	public List<JobApplication> getAllApplication();
	
	
	//get all application made by an user
	public List<JobApplication> getApplicationByUserId(Long userId);
	
	//Delete a job application
	public void deleteAnApplication(Long applicationId);
}

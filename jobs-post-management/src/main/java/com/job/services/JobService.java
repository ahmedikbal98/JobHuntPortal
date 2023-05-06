package com.job.services;

import java.util.List;

import com.job.enitity.Job;

public interface JobService {
	
	//Create a job
	
	public String createNewJob(Job job, Long companyId);
	
	
	  //get single job by Job Id
	
	   public Job getJobByJobId(Long jobId);
	   
	  //Get a List of job by Compay Id
	   public List<Job> getJobsByCompanyId(Long Id);

	   
	  //get all job from all comapny
	   public List<Job> getAllJobs();
	  
	// Delete a job post
	   public void deleteJobById(Long jobId);
	   

}

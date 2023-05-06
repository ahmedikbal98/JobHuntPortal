package com.job.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.job.enitity.Job;
import com.job.exceptions.ResourceNotFoundException;
import com.job.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	JobRepository jobRepository;

	@Override
	public String createNewJob(Job job,Long companyId){
		
		//job.setJobId(job.getJobId());
		job.setCompanyId(companyId);
		jobRepository.save(job);
		return "Job is created";
	}

	@Override
	public Job getJobByJobId(Long jobId) {
		
		
		return jobRepository.findById(jobId).orElseThrow(()-> new ResourceNotFoundException("Resource not found on server!!") );
 		 
	}

	@Override
	public List<Job> getAllJobs() {
		List jobs = jobRepository.findAll();
		return jobs;}

	@Override
	public void deleteJobById(Long jobId) {
	
	  jobRepository.deleteById(jobId);
	}

	@Override
	public List<Job> getJobsByCompanyId(Long Id) {
		
		return jobRepository.findByCompanyId(Id);
	}

	
}
package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.job.enitity.Job;
import com.job.services.JobService;

@RestController
@RequestMapping("/job")
public class JobController {

	@Autowired
	JobService jobService;

	// Creating Jobs API
	@PostMapping("/create/{companyId}")
	public ResponseEntity<Job> createJobApi(@RequestBody Job job, @PathVariable Long companyId) {
	    
		jobService.createNewJob(job, companyId);
		return ResponseEntity.status(HttpStatus.CREATED).body(job);
	}
	
	//Getting a singLe Job by ID
	@GetMapping("/findJob/{jobId}")
	public ResponseEntity<Job> getJobByIdApi(@PathVariable Long jobId){
		return ResponseEntity.ok(jobService.getJobByJobId(jobId));
	}
	
	//Getting All jobs Posted by a single company
	@GetMapping("/findJobByCid/{companyId}")
	public ResponseEntity<List<Job>> getJobByCompanyIdApi(@PathVariable Long companyId){
		return ResponseEntity.ok(jobService.getJobsByCompanyId(companyId));
	}

	//Getting All jobs posted by all the company
	@GetMapping("/getAll")
	public ResponseEntity<List<Job>> getAllJobsApi(){
		return ResponseEntity.ok(jobService.getAllJobs());
	}
	
	//Deleteing a JOB post
	@DeleteMapping("/delete/{jobId}")
	public String deleteAJob(@PathVariable Long jobId){
		jobService.deleteJobById(jobId);
		return "Job post deleted";
	}
	
	
}

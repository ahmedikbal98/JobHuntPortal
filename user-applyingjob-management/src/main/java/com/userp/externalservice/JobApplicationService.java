package com.userp.externalservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userp.model.JobApplication;



@FeignClient(name = "JOB-APPLICATION-SERVICE")

public interface JobApplicationService {
	@GetMapping("/job-application/get-all-application/{userId}")
	public ResponseEntity<List<JobApplication>> getAllApplicationByUserId(@PathVariable Long userId);
	
}

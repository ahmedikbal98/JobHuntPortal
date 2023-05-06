package com.userp.externalservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userp.model.Job;





@FeignClient(name = "JOB-SERVICE")
public interface JobService {
	@GetMapping("/job/findJob/{jobId}")
	public ResponseEntity<Job> getJobByIdApi(@PathVariable Long jobId);

}

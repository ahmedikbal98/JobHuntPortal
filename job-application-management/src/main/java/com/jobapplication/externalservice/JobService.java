package com.jobapplication.externalservice;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jopbapplication.model.Job;

@LoadBalancerClient(name = "JOB-SERVICE")
@FeignClient(name = "JOB-SERVIE")
public interface JobService {
	@GetMapping("/findJob/{jobId}")
	public ResponseEntity<Job> getJobByIdApi(@PathVariable Long jobId);

}

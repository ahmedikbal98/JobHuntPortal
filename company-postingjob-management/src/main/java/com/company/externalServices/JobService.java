package com.company.externalServices;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.company.model.Job;



@FeignClient(name="JOB-SERVICE")
public interface JobService {

	// Creating Jobs API
	@PostMapping("/create")
	public ResponseEntity<Job> createJobApi(@RequestBody Job job);
	
	//GetJobs Posted by a company using Company ID
	@GetMapping("job/findJobByCid/{companyId}")
	public List<Job> getJobByCompanyIdApi(@PathVariable Long companyId);
	
}

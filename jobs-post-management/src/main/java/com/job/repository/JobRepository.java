package com.job.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.enitity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
   
	public List<Job> findByCompanyId(Long companyId);
}

package com.jobapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobapplication.entity.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
  
	public List<JobApplication> findByUserId(Long userId);
}

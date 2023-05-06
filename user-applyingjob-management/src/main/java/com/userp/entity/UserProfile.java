package com.userp.entity;

import java.util.List;

import com.userp.model.Job;
import com.userp.model.JobApplication;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserProfile {
	
   @Id
   @SequenceGenerator(name="id_gen", sequenceName="job_id", initialValue=1234)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
	private Long userId;
	private String email;
	private String userFullName;
	private Character sex;
	private String qualification;
	private String specialization;
	
	@Transient
	private List<Job> jobList;
	
	

}

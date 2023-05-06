package com.jobapplication.entity;

import java.util.List;

import com.jopbapplication.model.Job;
import com.jopbapplication.model.UserProfile;

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
public class JobApplication {
    @Id
    @SequenceGenerator(name="id_gen", sequenceName="job_id", initialValue=54321)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
	private Long applicationId;
	private Long userId;
	private Long jobId;
	

	
	

}

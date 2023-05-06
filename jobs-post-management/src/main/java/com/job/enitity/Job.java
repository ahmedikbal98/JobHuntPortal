package com.job.enitity;

import com.job.model.Company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {
	
    @Id
    @SequenceGenerator(name="id_gen", sequenceName="job_id", initialValue=1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
    private Long jobId;
	private String jobType;
	private Long companyId;
	private String companyName;
	private String jobDescription;
	private String location;
    private String salaryExpected;
    private String jobStatus;
    private String lastApplyDate;
//    
//    @ManyToOne
//    @JoinColumn(name = "companyId")
//    private Company company;
    
	
	

}

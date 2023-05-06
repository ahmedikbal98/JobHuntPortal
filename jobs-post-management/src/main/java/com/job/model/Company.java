package com.job.model;

import java.util.ArrayList;
import java.util.List;

import com.job.enitity.Job;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private String companyName;
    private String companyDescription;
    private String companyUrl;
  
	private List<Job> jobs = new ArrayList<>();
	

}

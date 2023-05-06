package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	private String jobType;
	private Long companyId;
	private String companyName;
	private String jobDescription;
	private String location;
	private String salaryExpected;
	private String jobStatus;
	private String lastApplyDate;
}

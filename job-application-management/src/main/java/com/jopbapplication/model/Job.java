package com.jopbapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    private Long jobId;
	private String jobType;
	private Long companyId;
	private String companyName;
	private String jobDescription;
	private String location;
    private String salaryExpected;
    private String jobStatus;
    private String lastApplyDate;
}

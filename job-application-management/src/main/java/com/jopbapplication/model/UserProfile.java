package com.jopbapplication.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
	
	private Long userId;
	private String email;
	private String userFullName;
	private Character sex;
	private String qualification;
	private String specialization;

}

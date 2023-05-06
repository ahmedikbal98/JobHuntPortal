package com.company.entity;

import java.util.ArrayList;
import java.util.List;

import com.company.model.Job;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Company {
	@Id
	@SequenceGenerator(name="id_gen", sequenceName="company_id", initialValue=3000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
	private Long companyId;
    private String companyName;

    private String companyDescription;
    private String companyUrl;
    
	@Transient
	private List<Job> jobs = new ArrayList<>();
}

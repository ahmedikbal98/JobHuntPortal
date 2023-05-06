package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompanyPostingjobManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyPostingjobManagementApplication.class, args);
	}

}

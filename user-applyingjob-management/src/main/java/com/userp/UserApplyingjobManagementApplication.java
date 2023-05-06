package com.userp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class UserApplyingjobManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplyingjobManagementApplication.class, args);
	}

}

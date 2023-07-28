package com.login_registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.login_registrationModel"})
@SpringBootApplication
public class LoginRegistartionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegistartionApplication.class, args);
	}

}

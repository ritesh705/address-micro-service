package com.ritesh.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@ComponentScan({"com.ritesh.controller", "com.ritesh.service"})
@EntityScan("com.ritesh.entity")
@EnableJpaRepositories("com.ritesh.repository")*/
public class AddressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}

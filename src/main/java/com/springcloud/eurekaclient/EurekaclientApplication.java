package com.springcloud.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/user")
@EnableEurekaClient
public class EurekaclientApplication {
	@RequestMapping("/detail")
	public String Detail(){
		return "## Detail information about : User ";
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
}

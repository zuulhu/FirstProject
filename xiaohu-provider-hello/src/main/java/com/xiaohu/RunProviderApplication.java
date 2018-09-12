package com.xiaohu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunProviderApplication.class, args);
	}
}

package com.xiaohu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RunEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(RunEurekaApplication.class, args);
	}
}

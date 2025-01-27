package com.mtss.sdp.streamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OBDStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(OBDStreamApplication.class, args);
	}
}

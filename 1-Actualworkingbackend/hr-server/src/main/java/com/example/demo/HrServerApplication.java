package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class HrServerApplication {
	
//private static final Logger logger = LoggerFactory.getLogger(HrServerApplication.class);
	
	/**@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder()
	{
		return new BCryptPasswordEncoder();
	}**/
	
	public static void main(String[] args) {
		SpringApplication.run(HrServerApplication.class, args);
	}

}

package com.jenkins.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;






@SpringBootApplication
@ComponentScan(basePackages={"com.jenkins.springboot"})
public class SpringbootjpaApplication {
	
	
	private final static Logger logger =LoggerFactory.getLogger(SpringbootjpaApplication.class);

	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringbootjpaApplication.class, args);
		logger.info("hello jenkins spring boot welcome");
	}

}

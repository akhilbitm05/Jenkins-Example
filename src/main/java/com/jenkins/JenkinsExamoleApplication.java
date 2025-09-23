package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsExamoleApplication {

	private static final Logger log = LoggerFactory.getLogger(JenkinsExamoleApplication.class);

	public void initMethod(){
		log.info("Init Method---executed.....");
	}
	public static void main(String[] args) {
		log.info("main method started......");
		SpringApplication.run(JenkinsExamoleApplication.class, args);
	}

}

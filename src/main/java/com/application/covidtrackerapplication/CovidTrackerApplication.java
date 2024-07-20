package com.application.covidtrackerapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CovidTrackerApplication
{
	public  static  final Logger logger = LoggerFactory.getLogger(CovidTrackerApplication.class);

	
	public static void main(String[] args)
	{
		logger.info("Continous Integration Job");
		SpringApplication.run(CovidTrackerApplication.class, args);
	}

	public void run(String[] args) throws Exception
	{
		logger.info("Second Logger");
	}

	//For apache testing
	//Ambatutest again
	@GetMapping("/get")
	public String getData()
	{
		return "Testing, testing";
	}

	//test na please

	//job 1
}

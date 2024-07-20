package com.application.covidtrackerapplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CovidTrackerApplicationTests
{
	public  static  final Logger logger = LoggerFactory.getLogger(CovidTrackerApplication.class);

	@Test
	void contextLoads()
	{
		logger.info("Test Class");
		assertEquals(false, true);
	}

}


//This is a test

//Test again

//Please work na

//Working na boss
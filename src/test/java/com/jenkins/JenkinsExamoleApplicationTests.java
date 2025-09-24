package com.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class JenkinsExamoleApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(JenkinsExamoleApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test case executed");
		log.info("Test case executed second log statement");
        assertTrue(true);
	}

}

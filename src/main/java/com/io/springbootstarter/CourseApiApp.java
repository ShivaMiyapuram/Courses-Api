package com.io.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates a servlet container and deplys on the server and makes the app ready to run
		SpringApplication.run(CourseApiApp.class, args);
	}

}

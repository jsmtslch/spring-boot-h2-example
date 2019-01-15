package com.example.demo.h2;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.h2.repo.StudentJdbcRepo;

@SpringBootApplication
public class DemoH2Application implements CommandLineRunner{
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentJdbcRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Student with ID:10001 --> {}", studentRepo.findByID(10001L));
	}

}


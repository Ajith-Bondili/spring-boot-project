package com.ajith.spring_boot_project;

import com.ajith.spring_boot_project.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Bean // this method will be called when the application starts
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {
			StudentService studentService = ctx.getBean(StudentService.class);
			studentService.fetchStudent();
		};
	}


}

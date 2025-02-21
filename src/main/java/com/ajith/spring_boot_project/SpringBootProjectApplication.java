package com.ajith.spring_boot_project;

import com.ajith.spring_boot_project.model.Student;
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

    @Bean // This method will be called when the application starts
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            StudentService studentService = ctx.getBean(StudentService.class);
            
            // --- Create ---
            Student newStudent = new Student();
            newStudent.setName("John Doe");
            newStudent.setEmail("john@example.com");
            studentService.addStudent(newStudent);
            System.out.println("Created student: " + newStudent);
            
            // --- Read: Get All Students ---
            System.out.println("All Students: ");
            studentService.getAllStudents().forEach(System.out::println);
            
            // --- Read: Get Student by ID ---
            Student student = studentService.getStudentById(1); // assuming id 1 exists
            System.out.println("Fetched student by ID 1: " + student);
            
            // --- Update ---
            student.setName("John Updated");
            student.setEmail("john.updated@example.com");
            studentService.updateStudent(student);
            System.out.println("Updated student: " + studentService.getStudentById(1));
            
            // --- Delete ---
            studentService.removeStudent(1);
            System.out.println("Deleted student with ID 1");
            
            // --- Final list ---
            System.out.println("All Students after deletion: ");
            studentService.getAllStudents().forEach(System.out::println);
        };
    }
}

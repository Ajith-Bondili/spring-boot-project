package com.ajith.spring_boot_project.service;

import com.ajith.spring_boot_project.model.Student;
import com.ajith.spring_boot_project.service.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;
    
    // Existing method
    public void fetchStudent() {
        System.out.println(studentDao.getStudentById(1));
    }
    
    // New CRUD methods
    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }
    
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
    
    public void addStudent(Student student) {
        studentDao.createStudent(student);
    }
    
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
    
    public void removeStudent(int id) {
        studentDao.deleteStudent(id);
    }
}

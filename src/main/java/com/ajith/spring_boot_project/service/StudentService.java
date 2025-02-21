package com.ajith.spring_boot_project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajith.spring_boot_project.service.dao.StudentDao;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void fetchStudent() {
        studentDao.readStudentFromDB();
    }
}

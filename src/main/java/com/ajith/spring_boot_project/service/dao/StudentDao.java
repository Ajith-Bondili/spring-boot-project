package com.ajith.spring_boot_project.service.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Repository
public class StudentDao {

    @Autowired
   private JdbcTemplate jdbcTemplate;

    public void readStudentFromDB() {
        Map<String,Object> result = this.jdbcTemplate.queryForMap("select * from students where id=?", 1);
        System.out.println(result);
   
    }
}

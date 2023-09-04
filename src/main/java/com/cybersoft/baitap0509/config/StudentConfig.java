package com.cybersoft.baitap0509.config;

import com.cybersoft.baitap0509.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setNameStudent("Nguyen Van A");
        student.setAge(15);

        return  student;
    }

    @Bean
    public List<Student> listStudent(){

        return new ArrayList<Student>();
    }
}

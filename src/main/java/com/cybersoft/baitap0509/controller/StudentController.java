package com.cybersoft.baitap0509.controller;

import com.cybersoft.baitap0509.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    Student createStudent;

    @Autowired
    List<Student> listStudent;

    @GetMapping("")
    public ResponseEntity<?> getListStudent(){
        return new ResponseEntity<>(listStudent,HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> addStudent1(@RequestParam String nameStudent,@RequestParam int age){
        listStudent.add(new Student(nameStudent,age));
        return new ResponseEntity<>(listStudent,HttpStatus.OK);
    }

    @PostMapping("{nameStudent}/{age}")
    public ResponseEntity<?> addStudent2(@PathVariable String nameStudent,@PathVariable int age){
        listStudent.add(new Student(nameStudent,age));
        return new ResponseEntity<>(listStudent,HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<?> addStudent3(@RequestBody Student student){
        listStudent.add(student);
        return new ResponseEntity<>(listStudent,HttpStatus.OK);
    }


}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.Stuserve;

@RestController
@RequestMapping("/students")
public class Studentcontroller{

    @Autowired
    private Stuserve ser;

    @PostMapping("/add")
    public Student createData(@RequestBody Student stu) {
        return ser.createData(stu);
    }

    @GetMapping("/all")
    public List<Student> fetch() {
        return ser.fetch();
    }
}

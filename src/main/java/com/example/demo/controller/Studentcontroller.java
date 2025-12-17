package com.example.demo.controller;
import com.example.demo.entity.Student;
import com.example.demo.service.Stuserve;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class Studentcontrol {

    @Autowired
    Stuserve ser;

    @PostMapping("/add")
    public Student createData(@RequestBody Student stu) {  
        return ser.createData(stu);
    }
    @GetMapping
    public List<Integer> fetch(){
        return ser.fetch();
        
    }

}

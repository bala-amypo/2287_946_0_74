package com.example.demo.service;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;

import repository.Sturepository;

@Service
public class Stuserve {

   
    @Autowired
    Sturepository repo;
    public Student createData (Student stu)
    {
        return repo.save(stu);

    }
    public List<Integer> fetch() {
        return repo.findAll();
    }


}

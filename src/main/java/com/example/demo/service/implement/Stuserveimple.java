package com.example.demo.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Stuserve;

@Service
public class StuserveImpl implements Stuserve {

    @Autowired
    private StudentRepository repo;

    @Override
    public Student createData(Student stu) {
        return repo.save(stu);
    }

    @Override
    public List<Student> fetch() {
        return repo.findAll();
    }
}

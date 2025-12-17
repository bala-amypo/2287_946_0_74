package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface Stuserve {

    Student createData(Student stu);

    List<Student> fetch();
}

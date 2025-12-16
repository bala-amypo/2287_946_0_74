package com.example.demo.entity;
import jakarta.persistence.Entity;

public class Student {
   
    private int regno;
    private String name;
    private int marks;
    private double cgpa;
        
    public int getRegno() {
        return regno;
    }
    public void setRegno(int regno) {
        this.regno = regno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public Student(int regno, String name, int marks, double cgpa) {
        this.regno = regno;
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }
    public Student() {
        
    }
    

}

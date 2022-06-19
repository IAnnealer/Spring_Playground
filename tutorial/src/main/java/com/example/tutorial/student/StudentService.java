package com.example.tutorial.service;

import com.example.tutorial.entity.Student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "ian",
                        "duwjdtn1@gmail.com",
                        LocalDate.of(1994, 9, 12),
                        21)
        );
    }
}

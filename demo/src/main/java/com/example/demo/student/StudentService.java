package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "ian",
                        "duwjdtn1@gmail.com",
                        LocalDate.of(1994, Month.SEPTEMBER, 12),
                        29
                )
        );
    }

}

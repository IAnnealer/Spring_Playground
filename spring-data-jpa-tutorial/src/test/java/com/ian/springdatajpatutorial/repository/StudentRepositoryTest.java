package com.ian.springdatajpatutorial.repository;

import com.ian.springdatajpatutorial.entity.Guardian;
import com.ian.springdatajpatutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("duwjdtn1@gmail.com")
                .firstName("ian")
                .lastName("yeo")
//                .guardianName("guardian")
//                .guardianEmail("guardian@gmail.com")
//                .guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .email("ian.yeo@gmail.com")
                .name("ian_guardian")
                .mobile("9999999999")
                .build();

        Student student = Student.builder()
                .firstName("ian")
                .emailId("duwjdtn1@gmail.com")
                .lastName("yeo")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }
}
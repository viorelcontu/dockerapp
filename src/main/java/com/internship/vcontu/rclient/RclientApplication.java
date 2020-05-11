package com.internship.vcontu.rclient;

import com.internship.vcontu.rclient.domain.dao.StudentRepository;
import com.internship.vcontu.rclient.domain.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.internship.vcontu.rclient.domain.model.Student.Gender.MALE;

@SpringBootApplication
public class RclientApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(RclientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("vcontu", "Viorel Contu", MALE);
        studentRepository.save(student);
    }
}

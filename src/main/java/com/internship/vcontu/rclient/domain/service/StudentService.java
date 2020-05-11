package com.internship.vcontu.rclient.domain.service;

import com.internship.vcontu.rclient.domain.dao.StudentRepository;
import com.internship.vcontu.rclient.domain.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.internship.vcontu.rclient.domain.model.exceptions.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student findStudentById(String studentId) {
        return studentRepository.findById(studentId)
            .orElseThrow(() -> new ResourceNotFoundException(studentId + " not found"));
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> listStudents() {
        final Iterable<Student> allStudents = studentRepository.findAll();
        final List<Student> studentList = new ArrayList<>();
        allStudents.forEach(studentList::add);
        return studentList;
    }
}

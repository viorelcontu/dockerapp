package com.internship.vcontu.rclient.web;

import com.internship.vcontu.rclient.domain.model.Student;
import com.internship.vcontu.rclient.domain.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;

    @GetMapping ("/students/")
    public List<Student> listStudents () {
        return studentService.listStudents();
    }

    @GetMapping ("/students/{studentId}")
    public Student findById (@PathVariable String studentId) {
        return studentService.findStudentById(studentId);
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public void save (@RequestBody Student student) {
        studentService.saveStudent(student);
    }
}

package com.internship.vcontu.rclient.domain.dao;


import com.internship.vcontu.rclient.domain.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

}


package org.example.service;

import org.example.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {

    Student saveStudent(Student student);

    List<Student> getAllSorted(String field);
}

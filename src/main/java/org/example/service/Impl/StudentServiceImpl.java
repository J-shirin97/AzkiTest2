package org.example.service.Impl;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.example.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {


    StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public List<Student> getAllSorted(String field) {
        return studentRepository.getAllSortedBy(field);
    }

}

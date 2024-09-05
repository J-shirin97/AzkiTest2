package org.example.repository;

import org.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student, Long> {


    Student save(Student student);

    @Query("SELECT s FROM Student s ORDER BY CASE :field WHEN 'firstName' THEN s.firstName WHEN 'lastName' THEN s.lastName WHEN 'birthYear' THEN s.birthYear WHEN 'nationalCode' THEN s.nationalCode WHEN 'birthCity' THEN s.birthCity WHEN 'grade' THEN s.grade END ASC")
    List<Student> getAllSortedBy(@Param("field") String field);

}

package com.dheerajproject.socialnetworkforstudents.repository;

import com.dheerajproject.socialnetworkforstudents.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByStudentId(int id);
}

package com.dheerajproject.socialnetworkforstudents.service;

import com.dheerajproject.socialnetworkforstudents.dto.StudentRequest;
import com.dheerajproject.socialnetworkforstudents.entity.Student;
import com.dheerajproject.socialnetworkforstudents.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(StudentRequest studentRequest) {
        Student newStudent = Student.build(0, studentRequest.getFirstName(), studentRequest.getLastName(),
                studentRequest.getEmailId(), studentRequest.getPhoneNumber(), studentRequest.getAddress());
        return studentRepository.save(newStudent);
    }

    public Student getStudent(int id) {
        return studentRepository.findByStudentId(id);
    }
}

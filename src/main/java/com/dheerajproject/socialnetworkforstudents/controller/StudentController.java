package com.dheerajproject.socialnetworkforstudents.controller;

import com.dheerajproject.socialnetworkforstudents.dto.StudentRequest;
import com.dheerajproject.socialnetworkforstudents.entity.Student;
import com.dheerajproject.socialnetworkforstudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(studentService.getStudent(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentRequest studentRequest) {
            return new ResponseEntity<>(studentService.saveStudent(studentRequest), HttpStatus.CREATED);
    }

    @GetMapping("/ping")
    public String ping() {
        return "UP";
    }
}

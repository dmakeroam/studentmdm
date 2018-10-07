package com.example.studentmdm.controller;

import com.example.studentmdm.model.Student;
import com.example.studentmdm.request.StudentRequest;
import com.example.studentmdm.response.GenericResponse;
import com.example.studentmdm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public GenericResponse<Student> addStudent(@RequestBody StudentRequest request){
        GenericResponse<Student> response = new GenericResponse<>();
        response.setResponse(studentService.add(request));
        response.setIsSuccess(true);

        return response;
    }

    @PutMapping("/{id}")
    public GenericResponse<Student> updateStudent(@RequestBody StudentRequest request, @PathVariable("id") Long id) throws Exception{
        GenericResponse<Student> response = new GenericResponse<>();
        response.setResponse(studentService.update(request, id));
        response.setIsSuccess(true);

        return response;
    }

    @GetMapping("/{id}")
    public GenericResponse<Student> findById(@PathVariable("id") Long id) throws Exception{
        GenericResponse<Student> response = new GenericResponse<>();
        response.setResponse(studentService.findById(id));
        response.setIsSuccess(true);

        return response;
    }
}

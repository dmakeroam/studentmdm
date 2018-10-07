package com.example.studentmdm.service;

import com.example.studentmdm.model.Student;
import com.example.studentmdm.request.StudentRequest;

public interface StudentService {

    public Student add(StudentRequest request);

    public Student update(StudentRequest request, Long id) throws Exception;

    public Boolean deleteById(Long id);

    public Student findById(Long id) throws Exception;
}

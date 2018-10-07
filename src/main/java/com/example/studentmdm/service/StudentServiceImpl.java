package com.example.studentmdm.service;

import com.example.studentmdm.model.Student;
import com.example.studentmdm.repository.StudentRepository;
import com.example.studentmdm.request.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student add(StudentRequest request){
        Student student =  new Student(request.getFirstName(),
                                       request.getLastName(),
                                       request.getFaculty(),
                                       request.getDepartment(),
                                       request.getYears());

        Student response = studentRepository.save(student);

        return response;
    }

    public Student update(StudentRequest request, Long id) throws Exception{
         Student student = this.findById(id);
         student.setFirstName(request.getFirstName());
         student.setLastName(request.getLastName());
         student.setFaculty(request.getFaculty());
         student.setDepartment(request.getDepartment());
         student.setYears(request.getYears());

         Student response = studentRepository.save(student);

         return  response;
    }

    public Boolean deleteById(Long id){
        return null;
    }

    public Student findById(Long id) throws Exception{
        return studentRepository.findById(id)
                .orElseThrow(() -> new Exception("The student is not found"));
    }
}

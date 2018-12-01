package com.example.studentmdm;

import com.example.studentmdm.model.Student;
import com.example.studentmdm.request.StudentRequest;
import com.example.studentmdm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class StudentmdmApplicationTests {

    @Mock
    StudentService studentService;

     @Test
     public void test_findById() throws Exception{
         StudentRequest request = new StudentRequest("A","B","C","D",1);

         Student student = new Student("A","B","C","D",1);

         when(studentService.add(request)).thenReturn(student);

         assertNotNull(studentService.add(request));

         when(studentService.findById(1L)).thenReturn(student);

         assertNotNull(studentService.findById(1L));
     }

    @Test
    public void test_updateStudent() throws Exception{
        StudentRequest request = new StudentRequest("A","B","C","E",1);

        Student student = new Student("A","B","C","E",1);

        when(studentService.update(request, 1L)).thenReturn(student);

        assertNotNull(studentService.update(request, 1L));
    }

}

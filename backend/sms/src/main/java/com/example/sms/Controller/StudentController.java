package com.example.sms.Controller;

import com.example.sms.model.Student;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;



@RestController //From Spring web
@RequestMapping("/students") //http://localhost:8080/students
@CrossOrigin(origins = "*") //Allowing cross-origin requests from the React frontend
public class StudentController {
    
    @GetMapping
        public ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "mba"));
        students.add(new Student(2, "Jane Smith", "bba"));
        students.add(new Student(3, "Alice Johnson", "bca"));

        return students;
    }
   
    
}

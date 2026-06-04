package com.example.sms.Controller;

import com.example.sms.model.Student;
import org.springframework.web.bind.annotation.*;



@RestController //From Spring web
@RequestMapping("/students") //http://localhost:8080/students
@CrossOrigin(origins = "http://localhost:5173") //Allowing cross-origin requests from the React frontend
public class StudentController {
    
    @GetMapping
    public Student getStudent() {
        return new Student(1, "John Doe", "Computer Science");
    }
}

package com.example.sms.Controller;

import com.example.sms.model.Student;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.*;



@RestController //From Spring web
@RequestMapping("/students") //http://localhost:8080/students
@CrossOrigin(origins = "*") //Allowing cross-origin requests from the React frontend
public class StudentController {
    
    @GetMapping
        public ArrayList<Student> getStudents() {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "MBA"));
        students.add(new Student(2, "Jane Smith", "BBA"));
        students.add(new Student(3, "Alice Johnson", "BCA"));
        students.add(new Student(4,"Tushar","BCA"));
        students.add(new Student(5,"Rahul","MCA"));
        students.add(new Student(6,"Aman","BCA"));
        students.add(new Student(7,"Rohit","BTech"));
        students.add(new Student(8,"Priya","BCA"));


        return students;
    }

    @GetMapping("/bca")
    public List<Student> getbcaStudents() {
        return getStudents().stream()
                .filter(student -> student.getCourse().equalsIgnoreCase("BCA"))
                .collect(Collectors.toList());
    }
   

     
    
}

package com.cdavis.washingtonhighadminsystem.Controller;

import com.cdavis.washingtonhighadminsystem.Model.Student;
import com.cdavis.washingtonhighadminsystem.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/student")
public class StudentController {

    //create instance of StudentService
    private final StudentService studentService;

    //create constructor for instance
    public StudentController(StudentService service) { studentService = service; }

    //---- Dependency Injection - Controller Routing ----//

    /*controller route to get request*/
    @GetMapping
    public List<Student> findAll() {
        return studentService.findAllStudents();
    }

    /*controller route to post request*/
    @PostMapping("/addStudent")
    public void saveStudent(@RequestBody List<Student> studentList) {
        for (Student student : studentList) {
            studentService.save(student);
        }
    }

    /*controller route to delete request*/
    @DeleteMapping("/removeStudent/{id}")
    public void deleteStudent(@PathVariable Long id) { studentService.delete(id); }
}

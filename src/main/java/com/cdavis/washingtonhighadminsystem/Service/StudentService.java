package com.cdavis.washingtonhighadminsystem.Service;

import com.cdavis.washingtonhighadminsystem.Model.Student;
import com.cdavis.washingtonhighadminsystem.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //create instance of StudentRepository
    private final StudentRepository studentRepository;

    //create constructor for instance
    public StudentService(StudentRepository studentRepo) { studentRepository = studentRepo; }

    //---- CRUD applications ----//

    /*get student records*/
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    /*post, create new student record*/
    public void save(Student student) { studentRepository.save(student); }

    /*delete, remove a student record*/
    public void delete(Long id) { studentRepository.deleteById(id); }
}

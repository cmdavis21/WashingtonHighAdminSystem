package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="course_list")
public class Course {
    @Column(name = "course_code")
    @GeneratedValue
    @Id
    private String courseCode;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_description")
    private String courseDescription;

    @Column(name = "course_teacher")
    private Staff teacher;

    @Column(name = "students_enrolled")
    private List<Student> studentsEnrolled;

    @Column(name = "course_start_date")
    private LocalDate startDate;

    @Column(name = "course_end_date")
    private LocalDate endDate;

    @Column(name = "course_location")
    private String classroom;

    @Column(name = "course_gradebook")
    private Gradebook courseGradebook;

    public Course(String courseCode, String courseName, String courseDescription, Staff teacher,
                  LocalDate startDate, LocalDate endDate, String classroom) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.teacher = teacher;
        this.studentsEnrolled = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
        this.classroom = classroom;
        this.courseGradebook = new Gradebook();
    }

    // Getters and setters for the instance fields

    // Other methods
}


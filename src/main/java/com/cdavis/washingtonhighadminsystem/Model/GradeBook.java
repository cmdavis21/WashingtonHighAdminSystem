package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="grade_book")
public class GradeBook {

    @Column(name = "course")
    private List<Course> courses;

    @Column(name = "assignments")
    private List<Assignment> assignments;

    @Column(name = "grades")
    private Map<Student, Double> grades;

    @Column(name = "attendance")
    private Map<Student, AttendanceStatus> attendance;

    @Column(name = "gradingScale")
    private GradingScale gradingScale;

    @Column(name = "classAverage")
    private double classAverage;

    public Gradebook() {
        attendance = new HashMap<>();
        // Initialize other fields as needed
    }
}

package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="courses")
public class Course {

    @Id
    @Column(name = "course_code")
    private String courseCode = generateUniqueCourseCode();

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_description")
    private String courseDescription;

    @Column(name = "course_teacher")
    private Staff teacher;

    @Column(name = "course_start_date")
    private LocalDate startDate;

    @Column(name = "course_end_date")
    private LocalDate endDate;

    @Column(name = "course_location")
    private String classroom;

    @Enumerated(EnumType.STRING)
    @Column(name = "grading_scale")
    private GradeScale.GradingScale gradingScale;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollment = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Attendance> attendance;

    @Column(name = "course_assignments")
    private List<Assignments> courseAssignments;

    @OneToMany(mappedBy = "course")
    private List<AssignmentStudentGrades> studentGrades = new ArrayList<>();

    // Auto generate a unique course code
    private String generateUniqueCourseCode() {
        final String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(alphanumeric.length());
            sb.append(alphanumeric.charAt(index));
        }

        return sb.toString();
    }

    //method to calculate class average
}

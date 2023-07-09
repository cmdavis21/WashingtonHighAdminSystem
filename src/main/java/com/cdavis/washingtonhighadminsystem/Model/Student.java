package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {
    /* MODEL FOR STUDENT TO BE STRUCTURED BY IN THE SYSTEM */

    @Column(name = "student_id")
    @GeneratedValue
    @Id
    private Long studentId;

    @Column(name = "student_first_name")
    private String studentFirstName;

    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "grade_level")
    private int gradeLevel;

    @Column(name = "enrolled_courses")
    private List<Course> enrolledCourses;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "student_phone_number")
    private String studentPhoneNumber;

    @Column(name = "student_email")
    private String studentEmail;

    @Column(name = "parent_first_name")
    private String parentFirstName;

    @Column(name = "parent_last_name")
    private String parentLastName;

    @Column(name = "parent_phone_number")
    private String parentPhoneNumber;

    @Column(name = "parent_email")
    private String parentEmail;

    @Column(name = "awards")
    private List<Awards> awards;
}

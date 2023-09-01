package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "student_first_name")
    private String studentFirstName;

    @Column(name = "student_last_name")
    private String studentLastName;

    @Column(name = "grade_level")
    private int gradeLevel;

    @Column(name = "gpa_weighted")
    private double gpaWeighted;

    @Column(name = "gpa_unweighted")
    private double gpaUnweighted;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollment = new ArrayList<>();

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendance;

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

    @ManyToMany(mappedBy = "student_awards")
    private List<Awards> awards;

    //method to calculate students' weighted GPA

    //method to calculate students' unWeighted GPA
}

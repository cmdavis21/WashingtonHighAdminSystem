package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "students")
public class Student {

    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
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

    @Column(name = "enrolled_courses")
    private static List<Course> enrolledCourses;

    @Column(name = "attendance_status")
    private List<Course> attendance;

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

//    public Student() {
//        // Calculate and set the weighted GPA value
//        this.gpaWeighted = calculateStudentGPAWeighted();
//        // Calculate and set the unweighted GPA value
//        this.gpaUnweighted = calculateStudentGPAUnweighted();
//    }

//    private List<Course> getEnrolledCourses() {
//        return enrolledCourses;
//    }
//
//    public double calculateStudentGPAWeighted(Student student) {
//        double totalWeightedPoints = 0.0;
//        double totalWeight = 0.0;
//
//        // Iterate over each enrolled course of the student
//        for (Course course : student.getEnrolledCourses()) {
//            // Iterate over each assignment in the course
//            for (Assignments assignment : course.getAssignments()) {
//                double grade = assignment.getStudentGrades().get(student); // Get the grade for the provided student
//                double weight = assignment.getAssignmentWeight();
//
//                // Convert course grade to GPA
//                double courseGPAValue = convertGradeToGPA(grade);
//
//                // Calculate the weighted GPA for the assignment
//                double weightedGPA = courseGPAValue * (weight / 100.0);
//
//                // Add the weighted GPA to the total
//                totalWeightedPoints += weightedGPA;
//                totalWeight += weight;
//            }
//        }
//
//        // Calculate the weighted GPA by dividing totalWeightedPoints by totalWeight
//        double weightedGPA = totalWeightedPoints / totalWeight;
//
//        return weightedGPA;
//    }
//
//    public static double calculateStudentGPAUnweighted() {
//        double totalPoints = 0.0;
//        int totalCourses = enrolledCourses.size();
//
//        // Iterate over each enrolled course of the student
//        for (Course course : enrolledCourses) {
//            // Iterate over each assignment in the course
//            for (Assignments assignment : course.getAssignments()) {
//                double grade = assignment.getStudentGrades().get(this); // Get the grade for this student
//
//                // Convert course number (double) grade to GPA
//                double courseGPAValue = convertGradeToGPA(grade);
//
//                // Add course GPA value to totalPoints
//                totalPoints += courseGPAValue;
//            }
//        }
//
//        // Calculate unweighted GPA by dividing totalPoints by totalCourses
//        double unweightedGPA = totalPoints / totalCourses;
//
//        return unweightedGPA;
//    }
//
//    // Helper method to convert grade to GPA value
//    private static double convertGradeToGPA(double grade) {
//        double gpaPoint = 0.0;
//
//        if (grade >= 90 && grade <= 100) {
//            gpaPoint = 4.0;
//        } else if (grade >= 80 && grade <= 89) {
//            gpaPoint = 3.0;
//        } else if (grade >= 70 && grade <= 79) {
//            gpaPoint = 2.0;
//        } else if (grade >= 60 && grade <= 69) {
//            gpaPoint = 1.0;
//        } else if (grade <= 59) {
//            gpaPoint = 0.0;
//        }
//
//        return gpaPoint;
//    }
}

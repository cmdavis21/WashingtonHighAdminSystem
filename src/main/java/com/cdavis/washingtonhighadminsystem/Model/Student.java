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
    private calculateStudentGPAWeighted gpaWeighted;

    @Column(name = "gpa_unweighted")
    private calculateStudentGPAUnweighted gpaUnweighted;

    @Column(name = "enrolled_courses")
    private List<Course> enrolledCourses;

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

    //calculate student GPA weighted
    public static double calculateStudentGPAWeighted() {

    }

    //calculate student GPA Unweighted
    public static double calculateStudentGPAUnweighted(List<Course> enrolledCourses) {
        double totalPoints = 0.0;
        int totalCourses = enrolledCourses.size();

        //iterate over each enrolled course
        for (Course course : enrolledCourses) {
            double studentGrades = course.getStudentGrades();

            //convert course number (double) grade to gpa
            double courseGPAValue = convertGradeToGPA(studentGrades);

            //add course GPA value to totalPoints
            totalPoints += courseGPAValue;
        }

        //calculate unweighted GPA by dividing totalPoints by totalCourses
        double unweightedGPA = totalPoints / totalCourses;

        return unweightedGPA;
    }

    // Helper method to convert grade to GPA letter values
    private static double convertGradeToGpa(Course.GradingScale grade) {
        // Map the grade to GPA letter values
        String letterGrade;
        double gpaPoint = 0.0;

        if (grade >= 90 && grade <= 100) {
            letterGrade = "A";
            gpaPoint = 4.0;
        }
        else if (grade >= 80 && grade <= 89) {
            letterGrade = "B";
            gpaPoint = 3.0;
        }
        else if (grade >= 70 && grade <= 79) {
            letterGrade = "C";
            gpaPoint = 2.0;
        }
        else if (grade >= 60 && grade <= 69) {
            letterGrade = "D";
            gpaPoint = 1.0;
        }
        else {
            letterGrade = "F";
            gpaPoint = 0.0;
        }

        return gpaPoint;
    }
}

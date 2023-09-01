package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Assignments")
public class Assignments {

    @Id
    @Column(name = "assignment_name")
    private String assignmentName;

    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course courseCode;

    @Column(name = "course_name")
    private Course courseName;

    @Enumerated(EnumType.STRING)
    @Column(name = "assignment_type")
    private AssignmentType type;

    @Column(name = "assignment_weight")
    private float assignmentWeight;

    @Column(name = "assignment_points")
    private double availablePoints;

    @Enumerated(EnumType.STRING)
    @Column(name = "grading_scale")
    private GradeScale.GradingScale gradingScale;

    @OneToMany(mappedBy = "assignment")
    private Map<Student, Double> studentGrades;

    @Column(name = "date_assigned")
    private Date dateAssigned;

    @Column(name = "date_due")
    private Date dateDue;

    @Column(name = "semester_year")
    private String semesterAndYear;

    public enum AssignmentType {
        HOMEWORK,
        QUIZ,
        PROJECT,
        EXAM
    }

    // Update a student's grade for this assignment
    public void updateStudentGrade(Student student, double newGrade) {
        studentGrades.put(student, newGrade);
    }
}
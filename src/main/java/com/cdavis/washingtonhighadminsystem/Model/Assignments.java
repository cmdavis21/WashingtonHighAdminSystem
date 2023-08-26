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

    @Column(name = "assignment_name")
    @Id
    private String assignmentName;

    @Column(name = "course_code")
    private Course courseCode;

    @Column(name = "course_name")
    private Course courseName;

    @Column(name = "assignment_type")
    private AssignmentType type;

    @Column(name = "assignment_weight")
    private int assignmentWeight;

    @Column(name = "assignment_points")
    private double availablePoints;

    @Column(name = "date_assigned")
    private Date dateAssigned;

    @Column(name = "date_due")
    private Date dateDue;

    //mapping assignments.java to course.java
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ElementCollection
    @MapKeyJoinColumn(name = "student_id")
    @Column(name = "grade")
    private Map<Student, Double> studentGrades;

    @Column(name = "semester_year")
    private String semesterAndYear;

    public enum AssignmentType {
        HOMEWORK,
        QUIZ,
        PROJECT,
        EXAM
    }
}

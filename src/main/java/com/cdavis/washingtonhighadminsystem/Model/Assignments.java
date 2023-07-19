package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Assignments")
public class Assignments {

    @Column(name = "assignment_name")
    @Id
    private String assignmentName;

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

    @Column(name = "semester_year")
    private String semesterAndYear;

    @Column(name = "course_code")
    private Course courseCode;

    @Column(name = "course_name")
    private Course courseName;

    public enum AssignmentType {
        HOMEWORK,
        QUIZ,
        PROJECT,
        EXAM
    }
}

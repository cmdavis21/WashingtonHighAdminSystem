package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "assignment_student_grades")
public class AssignmentStudentGrades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "assignment_name")
    private Assignments assignment;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Double grade;

    // Update student grades
    public void updateStudentGrade(Double newGrade) {
        // Add validation logic if needed
        this.grade = newGrade;
    }

}

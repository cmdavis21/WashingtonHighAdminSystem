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

    @Column(name = "course_code")
    @Id //foreign key
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

    @Column(name = "gradingScale")
    private GradingScale gradingScale;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollment = new ArrayList<>();

    @OneToMany(mappedBy = "course")
    private List<Attendance> attendance;

    @OneToMany(mappedBy = "course")
    private List<Assignments> assignments;

    public enum GradingScale {
        A_PLUS("A+", 97, 100),
        A("A", 93, 96),
        A_MINUS("A-", 90, 92),
        B_PLUS("B+", 87, 89),
        B("B", 83, 86),
        B_MINUS("B-", 80, 82),
        C_PLUS("C+", 77, 79),
        C("C", 73, 76),
        C_MINUS("C-", 70, 72),
        D_PLUS("D+", 67, 69),
        D("D", 63, 66),
        D_MINUS("D-", 60, 62),
        F("F", 0, 59);

        private final String letterGrade;
        private final int lowScore;
        private final int highScore;

        GradingScale(String letterGrade, int lowScore, int highScore) {
            this.letterGrade = letterGrade;
            this.lowScore = lowScore;
            this.highScore = highScore;
        }

        public String getLetterGrade() {
            return letterGrade;
        }

        public int getLowScore() {
            return lowScore;
        }

        public int getHighScore() {
            return highScore;
        }
    }

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

//    public static String convertPointsToLetterGrade(double grade) {
//        for (GradingScale scale : GradingScale.values()) {
//            if (grade >= scale.getLowScore() && grade <= scale.getHighScore()) {
//                return scale.getLetterGrade();
//            }
//        }
//        return "N/A"; // Return "N/A" if the grade is not within any scale range
//    }
//
//    public double calculateClassAverage() {
//        double totalPoints = 0.0;
//        int totalStudents = studentsEnrolled.size();
//
//        // Iterate over each assignment to get student grades
//        for (Assignments assignment : assignments) {
//            Map<Student, Double> grades = assignment.getStudentGrades();
//
//            // Iterate over each student and their grade
//            for (Map.Entry<Student, Double> entry : grades.entrySet()) {
//                Double grade = entry.getValue();
//                totalPoints += grade;
//            }
//        }
//
//        // Calculate the class average by dividing the total points by the total number of students
//        double classAverage = totalPoints / totalStudents;
//        return classAverage;
//    }

//    public void updateGrades(List<Assignments> updatedAssignments) {
//        // Update the grades for the course's assignments
//        // ...
//
//        // Recalculate and update GPA values for enrolled students
//        for (Student student : studentsEnrolled) {
//            student.setGpaWeighted(Student.calculateStudentGPAWeighted());
//            student.setGpaUnweighted(Student.calculateStudentGPAUnweighted());
//        }
//    }
//
//    public void enrollInCourse(Student student) {
//        // Add the student to the list of enrolled students
//        studentsEnrolled.add(student);
//        // Recalculate and update GPA values for the enrolled student
//        student.setGpaWeighted(Student.calculateStudentGPAWeighted());
//        student.setGpaUnweighted(Student.calculateStudentGPAUnweighted());
//    }
}

package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    @Id
    private String courseCode = generateUniqueCourseCode();

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_description")
    private String courseDescription;

    @Column(name = "course_teacher")
    private Staff teacher;

    @Column(name = "students_enrolled")
    private List<Student> studentsEnrolled;

    @Column(name = "course_start_date")
    private LocalDate startDate;

    @Column(name = "course_end_date")
    private LocalDate endDate;

    @Column(name = "course_location")
    private String classroom;

    @Column(name = "student_attendance")
    private Map<Student, AttendanceStatus> attendance;

    @Column(name = "assignments")
    private List<Assignments> assignments;

    @Column(name = "student_grades")
    private Map<Student, GradingScale> studentGrades;

    public Map<Student, GradingScale> getStudentGrades() {
        return studentGrades;
    }

    public enum AttendanceStatus {
        PRESENT,
        ABSENT,
        TARDY,
        EXCUSED
    }

    public enum GradingScale {
        A_PLUS(97, 100),
        A(93, 96),
        A_MINUS(90, 92),
        B_PLUS(87, 89),
        B(83, 86),
        B_MINUS(80, 82),
        C_PLUS(77, 79),
        C(73, 76),
        C_MINUS(70, 72),
        D_PLUS(67, 69),
        D(63, 66),
        D_MINUS(60, 62),
        F(0, 59);

        private final int lowScore;
        private final int highScore;

        GradingScale(int lowScore, int highScore) {
            this.lowScore = lowScore;
            this.highScore = highScore;
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

    // Calculate class average
    public double calculateClassAverage() {
        // Implementation logic to calculate the class average
        // based on the grades of all students in the enrolled course
    }
}

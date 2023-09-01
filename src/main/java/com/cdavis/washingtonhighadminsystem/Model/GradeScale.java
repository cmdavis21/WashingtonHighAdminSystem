package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class GradeScale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gradeScale_id")
    private Long id;

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
}

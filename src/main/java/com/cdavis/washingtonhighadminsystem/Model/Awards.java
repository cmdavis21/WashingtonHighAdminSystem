package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "awards")
public class Awards {

    @Id
    @Column(name = "award_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long awardId;

    @Column(name = "award_type")
    private AwardType awardType;

    @Column(name = "award_name")
    private String awardName;

    @Column(name = "date_received")
    private LocalDate dateReceived;

    @Column(name = "award_criteria")
    private String criteria; //represents any specific criteria or met requirements associated with the award.

    @Column(name = "award_details")
    private String details; //provides additional details or descriptions related to the award.

    @ManyToMany
    @JoinTable(
            name = "student_awards",
            joinColumns = @JoinColumn(name = "award_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> studentsAwarded;

    @ManyToMany
    @JoinTable(
            name = "staff_awards",
            joinColumns = @JoinColumn(name = "award_id"),
            inverseJoinColumns = @JoinColumn(name = "staff_id")
    )
    private List<Staff> staffAwarded;

    public enum AwardType {
        STUDENT,
        STAFF
    }
}
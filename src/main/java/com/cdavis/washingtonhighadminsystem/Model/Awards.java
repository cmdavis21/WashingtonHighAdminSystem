package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "awards")
public class Awards {

    @Column(name = "award_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long awardId;

    @Column(name = "award_type")
    private AwardType awardType;

    @Column(name = "award_name")
    private String awardName;

    @Column(name = "date_received")
    private LocalDate dateReceived;

    @Column(name = "award_criteria")
    private String criteria; //represents any specific criteria or requirements associated with the award.

    @Column(name = "award_details")
    private String details; //provides additional details or descriptions related to the award.

    public enum AwardType {
        STUDENT,
        STAFF
    }
}
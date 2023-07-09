package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class Staff {
    /* MODEL FOR STAFF */

    @Column(name = "staff_id")
    @GeneratedValue
    @Id
    private Long staffId;

    @Column(name = "staff_first_name")
    private String staffFirstName;

    @Column(name = "staff_last_name")
    private String staffLastName;

    @Column(name = "staff_position")
    private String staffPosition;

    @Column(name = "department")
    private String department;

    @Column(name = "office_location")
    private String officeLocation;

    @Column(name = "office_hours")
    private LocalTime officeHours;

    @Column(name = "courses_taught")
    private List<Course> coursesTaught;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "salary")
    private float salary;

    @Column(name = "date_of_hire")
    private float dateOfHire;
}

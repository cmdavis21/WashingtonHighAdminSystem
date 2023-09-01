package com.cdavis.washingtonhighadminsystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @Column(name = "staff_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private String officeHours;

    @CollectionTable(name = "courses_taught")
    @MapKeyJoinColumn(name = "course_code")
    @Column(name = "courses_taught")
    private List<Course> coursesTaught;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "salary")
    private float salary;

    @Column(name = "date_of_hire")
    private float dateOfHire;

    @ManyToMany(mappedBy = "staffAwarded")
    private List<Awards> awards;
}

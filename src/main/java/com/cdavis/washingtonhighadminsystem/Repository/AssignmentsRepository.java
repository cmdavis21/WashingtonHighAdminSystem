package com.cdavis.washingtonhighadminsystem.Repository;

import com.cdavis.washingtonhighadminsystem.Model.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentsRepository extends JpaRepository<Assignments, String> {
}

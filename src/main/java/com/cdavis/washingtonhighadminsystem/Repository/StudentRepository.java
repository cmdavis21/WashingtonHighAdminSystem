package com.cdavis.washingtonhighadminsystem.Repository;

import com.cdavis.washingtonhighadminsystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

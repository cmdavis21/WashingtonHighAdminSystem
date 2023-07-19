package com.cdavis.washingtonhighadminsystem.Repository;

import com.cdavis.washingtonhighadminsystem.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {
}

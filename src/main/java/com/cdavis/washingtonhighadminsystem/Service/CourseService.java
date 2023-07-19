package com.cdavis.washingtonhighadminsystem.Service;

import com.cdavis.washingtonhighadminsystem.Model.Course;
import com.cdavis.washingtonhighadminsystem.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    //create instance of CourseRepository
    private final CourseRepository courseRepository;

    //create constructor for instance
    public CourseService(CourseRepository courseRepo) { courseRepository = courseRepo; }

    //---- CRUD applications ----//

    /*get courses*/
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> findCourseById(String courseCode) {
        return courseRepository.findById(courseCode);
    }

    /*post, create new course*/
    public void save(Course course) { courseRepository.save(course); }

    /*delete, remove a course*/
    public void delete(String courseCode) { courseRepository.deleteById(courseCode); }
}

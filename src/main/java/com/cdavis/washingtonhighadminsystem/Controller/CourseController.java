package com.cdavis.washingtonhighadminsystem.Controller;

import com.cdavis.washingtonhighadminsystem.Model.Course;
import com.cdavis.washingtonhighadminsystem.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/course")
public class CourseController {

    //create instance of CourseService
    private final CourseService courseService;

    //create constructor for instance
    public CourseController(CourseService service) { courseService = service; }

    //---- Dependency Injection - Controller Routing ----//

    /*controller route to get request*/
    @GetMapping
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> findCourseById(@PathVariable("id") String courseCode) {
        return courseService.findCourseById(courseCode);
    }

    /*controller route to post request*/
    @PostMapping("/addCourse")
    public void saveCourse(@RequestBody List<Course> courseList) {
        for (Course course : courseList) {
            courseService.save(course);
        }
    }

    /*controller route to delete request*/
    @DeleteMapping("/removeCourse/{id}")
    public void deleteCourse(@PathVariable String id) { courseService.delete(id); }
}

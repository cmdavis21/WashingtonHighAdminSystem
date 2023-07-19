package com.cdavis.washingtonhighadminsystem.Controller;

import com.cdavis.washingtonhighadminsystem.Model.Assignments;
import com.cdavis.washingtonhighadminsystem.Service.AssignmentsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/assignments")
public class AssignmentsController {

    //create instance of AssignmentsService
    private final AssignmentsService assignmentsService;

    //create constructor for instance
    public AssignmentsController(AssignmentsService service) { assignmentsService = service; }

    //---- Dependency Injection - Controller Routing ----//

    /*controller route to get request*/
    @GetMapping
    public List<Assignments> findAll() {
        return assignmentsService.findAllAssignments();
    }

    /*controller route to post request*/
    @PostMapping("/addAssignment")
    public void saveAssignment(@RequestBody List<Assignments> assignmentsList) {
        for (Assignments assignments : assignmentsList) {
            assignmentsService.save(assignments);
        }
    }

    /*controller route to delete request*/
    @DeleteMapping("/removeAssignment/{id}")
    public void deleteAssignment(@PathVariable String id) { assignmentsService.delete(id); }
}

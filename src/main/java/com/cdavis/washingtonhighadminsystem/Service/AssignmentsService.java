package com.cdavis.washingtonhighadminsystem.Service;

import com.cdavis.washingtonhighadminsystem.Model.Assignments;
import com.cdavis.washingtonhighadminsystem.Repository.AssignmentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentsService {

    //create instance of AssignmentsRepository
    private final AssignmentsRepository assignmentsRepository;

    //create constructor for instance
    public AssignmentsService(AssignmentsRepository assignmentRepo) { assignmentsRepository = assignmentRepo; }

    //---- CRUD applications ----//

    /*get assignments*/
    public List<Assignments> findAllAssignments() {
        return assignmentsRepository.findAll();
    }

    /*post, create new assignment*/
    public void save(Assignments assignments) { assignmentsRepository.save(assignments); }

    /*delete, remove an assignment*/
    public void delete(String id) { assignmentsRepository.deleteById(id); }
}

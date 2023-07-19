package com.cdavis.washingtonhighadminsystem.Controller;

import com.cdavis.washingtonhighadminsystem.Model.Staff;
import com.cdavis.washingtonhighadminsystem.Service.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/staff")
public class StaffController {

    //create instance of StaffService
    private final StaffService staffService;

    //create constructor for instance
    public StaffController(StaffService service) { staffService = service; }

    //---- Dependency Injection - Controller Routing ----//

    /*controller route to get request*/
    @GetMapping
    public List<Staff> findAll() {
        return staffService.findAllStaff();
    }

    /*controller route to post request*/
    @PostMapping("/addStaff")
    public void saveStaff(@RequestBody List<Staff> staffList) {
        for (Staff staff : staffList) {
            staffService.save(staff);
        }
    }

    /*controller route to delete request*/
    @DeleteMapping("/removeStaff/{id}")
    public void deleteStaff(@PathVariable Long id) { staffService.delete(id); }
}

package com.cdavis.washingtonhighadminsystem.Controller;

import com.cdavis.washingtonhighadminsystem.Model.Awards;
import com.cdavis.washingtonhighadminsystem.Service.AwardsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/awards")
public class AwardsController {

    //create instance of StudentService
    private final AwardsService awardsService;

    //create constructor for instance
    public AwardsController(AwardsService service) { awardsService = service; }

    //---- Dependency Injection - Controller Routing ----//

    /*controller route to get request*/

    @GetMapping("/all")
    public List<Awards> findAllAwards() { return awardsService.findAllAwards(); }

    @GetMapping("/student")
    public List<Awards> findAllStudentAwards() {
        return awardsService.findAllStudentAwards();
    }

    @GetMapping("/staff")
    public List<Awards> findAllStaffAwards() {
        return awardsService.findAllStaffAwards();
    }

    /*controller route to post request*/
    @PostMapping("/addAward")
    public void saveAward(@RequestBody List<Awards> awardList) {
        for (Awards award : awardList) {
            awardsService.save(award);
        }
    }

    /*controller route to delete request*/
    @DeleteMapping("/removeAward/{id}")
    public void deleteAward(@PathVariable Long id) { awardsService.delete(id);
}

package com.cdavis.washingtonhighadminsystem.Service;

import com.cdavis.washingtonhighadminsystem.Model.Awards;
import com.cdavis.washingtonhighadminsystem.Repository.AwardsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardsService {

    //create instance of AwardsRepository
    private final AwardsRepository awardsRepository;

    //create constructor for instance
    public AwardsService(AwardsRepository awardsRepo) { awardsRepository = awardsRepo; }

    //---- CRUD applications ----//

    /*get all awards*/
    public List<Awards> findAllAwards() { return awardsRepository.findAll(); }

    /*get student awards*/
    public List<Awards> findAllStudentAwards() {
        return awardsRepository.findAllByAwardType(Awards.AwardType.STUDENT);
    }

    /*get staff awards*/
    public List<Awards> findAllStaffAwards() {
        return awardsRepository.findAllByAwardType(Awards.AwardType.STAFF);
    }

    /*post, create new award*/
    public void save(Awards award) { awardsRepository.save(award); }

    /*delete, remove an award*/
    public void delete(Long id) { awardsRepository.deleteById(id); }
}

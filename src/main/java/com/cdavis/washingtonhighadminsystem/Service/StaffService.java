package com.cdavis.washingtonhighadminsystem.Service;

import com.cdavis.washingtonhighadminsystem.Model.Staff;
import com.cdavis.washingtonhighadminsystem.Repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    //create instance of StaffRepository
    private final StaffRepository staffRepository;

    //create constructor for instance
    public StaffService(StaffRepository staffRepo) { staffRepository = staffRepo; }

    //---- CRUD applications ----//

    /*get staff records*/
    public List<Staff> findAllStaff() {
        return staffRepository.findAll();
    }

    /*post, create new staff record*/
    public void save(Staff staff) { staffRepository.save(staff); }

    /*delete, remove a staff record*/
    public void delete(Long id) { staffRepository.deleteById(id); }
}

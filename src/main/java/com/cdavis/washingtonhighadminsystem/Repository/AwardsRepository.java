package com.cdavis.washingtonhighadminsystem.Repository;

import com.cdavis.washingtonhighadminsystem.Model.Awards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AwardsRepository extends JpaRepository<Awards, Long> {

    //finds awards by awardType (Student or Staff)
    List<Awards> findAllByAwardType(Awards.AwardType awardType);
}

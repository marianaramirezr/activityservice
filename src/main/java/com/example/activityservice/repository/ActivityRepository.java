package com.example.activityservice.repository;

import com.example.activityservice.model.Activity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ActivityRepository extends MongoRepository<Activity, String> {

    List<Activity> findByApprenticeIdAndTrainingDateBetween(String apprenticeId, LocalDate startDate, LocalDate endDate);
}

package com.example.activityservice.service;

import com.example.activityservice.dto.ActivityReportDTO;
import com.example.activityservice.model.Activity;
import com.example.activityservice.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public ActivityReportDTO getMonthlyReport(String apprenticeId, int month, int year) {

        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        List<Activity> activities = activityRepository.findByApprenticeIdAndTrainingDateBetween(
                apprenticeId, startDate, endDate);

        return mapActivitiesToReport(activities);
    }

    private ActivityReportDTO mapActivitiesToReport(List<Activity> activities) {
        return new ActivityReportDTO();
    }
}

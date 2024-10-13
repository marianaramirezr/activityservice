package com.example.activityservice.dto;
import java.util.List;

public class ActivityReportDTO {

    private String apprenticeId;
    private String apprenticeName;
    private List<WeekReport> weeks;


    public static class WeekReport {
        private String week;
        private List<ActivityDTO> activities;

    }

    public static class ActivityDTO {
        private String trainingDate;
        private String trainingType;
        private String trainingName;

    }
}
package com.kinath.udemy;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "Practice your back hand volley";
    }
}

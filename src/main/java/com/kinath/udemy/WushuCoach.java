package com.kinath.udemy;

import org.springframework.stereotype.Component;

@Component
public class WushuCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "Complete breathing exercises";
    }

    public String getDailyFortune()
    {
        return null;
    }
}

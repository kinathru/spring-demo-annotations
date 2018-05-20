package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WushuCoach implements Coach
{
    @Autowired
    private FortuneService fortuneService;

    public String getDailyWorkout()
    {
        return "Complete breathing exercises";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}

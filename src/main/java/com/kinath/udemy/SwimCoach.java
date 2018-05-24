package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;

public class SwimCoach implements Coach
{
    FortuneService fortuneService;

    public SwimCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout()
    {
        return "Swim 1000 m as a warm up";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}

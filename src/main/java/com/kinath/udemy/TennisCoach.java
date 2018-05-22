package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    private FortuneService fortuneService;

    public TennisCoach()
    {
        System.out.println(" >> TennisCoach : Inside Default constructor");
    }

    /*
    @Autowired
    public TennisCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
    */

    public String getDailyWorkout()
    {
        return "Practice your back hand volley";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    @Autowired
    @Qualifier("happyFortuneService")
    public void doSomeCrazyStuff( FortuneService fortuneService )
    {
        System.out.println(" >> TennisCoach : Inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }
}

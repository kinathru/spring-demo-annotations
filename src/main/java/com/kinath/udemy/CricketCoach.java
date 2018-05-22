package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach
{
    @Autowired
    @Qualifier("cricketFortuneService")
    FortuneService fortuneService;

    public String getDailyWorkout()
    {
        return "Practice Balling";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }

    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    public void setFortuneService( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }
}

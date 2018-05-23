package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class CricketCoach implements Coach
{
    @Autowired
    @Qualifier("cricketFortuneService")
    FortuneService fortuneService;

    public CricketCoach()
    {
        System.out.println("CricketCoach : Inside no-arg constructor" + this.hashCode());
    }

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

    @PostConstruct
    public void doAfterConstruct()
    {
        System.out.println("CricketCoach : After Construction" + this.hashCode() );
    }

    @PreDestroy
    public void doBeforeDestroy()
    {
        System.out.println("CricketCoach : Before Destroying " + this.hashCode() );
    }
}

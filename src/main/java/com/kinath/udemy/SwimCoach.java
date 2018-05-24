package com.kinath.udemy;

import com.kinath.udemy.services.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach
{
    private FortuneService fortuneService;

    @Value( "${foo.email}" )
    private String email;

    @Value( "${foo.team}" )
    private String team;

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

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam( String team )
    {
        this.team = team;
    }
}

package com.kinath.udemy.services;

import org.springframework.stereotype.Component;

@Component
public class CricketFortuneService implements FortuneService
{
    public String getFortune()
    {
        return "You have won 3 free tickets";
    }
}

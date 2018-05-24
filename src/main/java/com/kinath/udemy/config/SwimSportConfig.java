package com.kinath.udemy.config;

import com.kinath.udemy.Coach;
import com.kinath.udemy.SwimCoach;
import com.kinath.udemy.services.FortuneService;
import com.kinath.udemy.services.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwimSportConfig
{
    // Define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService()
    {
        return new SadFortuneService();
    }

    // define bean for swim coach and inject dependencies
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach( sadFortuneService() );
    }
}

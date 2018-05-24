package com.kinath.udemy;

import com.kinath.udemy.config.SportConfig;
import com.kinath.udemy.config.SwimSportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SwimSportConfig.class );

        Coach swimCoach = context.getBean( "swimCoach", Coach.class );
        System.out.println( swimCoach.getDailyFortune() );
        System.out.println( swimCoach.getDailyWorkout() );

        context.close();
    }
}

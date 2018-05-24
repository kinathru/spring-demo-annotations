package com.kinath.udemy;

import com.kinath.udemy.config.SportConfig;
import com.kinath.udemy.config.SwimSportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SwimSportConfig.class );

        SwimCoach swimCoach = context.getBean( "swimCoach", SwimCoach.class );
        System.out.println( swimCoach.getDailyFortune() );
        System.out.println( swimCoach.getDailyWorkout() );
        System.out.println( swimCoach.getEmail() );
        System.out.println( swimCoach.getTeam() );

        context.close();
    }
}

package com.kinath.udemy;

import com.kinath.udemy.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SportConfig.class);
        CricketCoach cricketCoach = context.getBean( "cricketCoach", CricketCoach.class );
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        context.close();
    }
}

package com.kinath.udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        Coach tennisCoach = context.getBean( "tennisCoach", Coach.class );
        System.out.println( tennisCoach.getDailyWorkout() );
        System.out.println( tennisCoach.getDailyFortune() );

        System.out.println("\n -------------------------------- \n");

        WushuCoach wushuCoach = context.getBean( "wushuCoach", WushuCoach.class );
        System.out.println( wushuCoach.getDailyWorkout() );
        System.out.println( wushuCoach.getDailyFortune() );

        context.close();
    }
}

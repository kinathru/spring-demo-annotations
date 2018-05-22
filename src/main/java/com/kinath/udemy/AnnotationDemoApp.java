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

        System.out.println("\n -------------------------------- \n");
        CricketCoach cricketCoach_01 = context.getBean( "cricketCoach",CricketCoach.class );
        CricketCoach cricketCoach_02 = context.getBean( "cricketCoach",CricketCoach.class );

        System.out.println(cricketCoach_01.getDailyFortune());
        System.out.println(cricketCoach_01.getDailyWorkout());

        if( cricketCoach_01 == cricketCoach_02)
        {
            System.out.println("Both Cricket coaches refer to same object");
        }
        else
        {
            System.out.println("Cricket coaches refer to different objects");
        }

        context.close();
    }
}

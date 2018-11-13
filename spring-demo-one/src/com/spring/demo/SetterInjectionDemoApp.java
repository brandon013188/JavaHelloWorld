package com.spring.demo;

import com.spring.demo.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.demo.coach.Coach;

public class SetterInjectionDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        // call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());

        // close the context
        context.close();
    }
}

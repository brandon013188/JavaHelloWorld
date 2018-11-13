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
        Coach coach = context.getBean("myCricketCoach", Coach.class);

        // call method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // close the context
        context.close();
    }
}

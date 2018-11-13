package com.spring.demo;

import com.spring.demo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve the bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(coach.getDailyWorkout());

        // call methods that involve the dependencies
        System.out.println(coach.getDailyFortune());

        // retrieve the bean from spring container
        Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(myCricketCoach.getDailyWorkout());

        // call methods that involve the dependencies
        System.out.println(myCricketCoach.getDailyFortune());


        // close the context
        context.close();
    }
}

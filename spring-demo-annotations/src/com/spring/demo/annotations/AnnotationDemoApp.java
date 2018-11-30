package com.spring.demo.annotations;

import com.spring.demo.annotations.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple annotation demo.
 *
 * @author liguanch
 *
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        final String dailyWorkOutMsg = theCoach.getDailyWorkout();
        System.out.println(dailyWorkOutMsg);

        // close the context
        context.close();
    }
}
